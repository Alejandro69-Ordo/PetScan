package Controlador;

import AppPackage.AnimationClass;
import Modelo.Clase_Mascota;
import Modelo.Conexion_SGBD;
import Modelo.ModeloInstituto;
import Modelo.ModeloMascota;
import Modelo.ModeloRaza;
import Modelo.Modelo_CuentaUsuario;
import Modelo.Modelo_InformeSolicitud;
import Modelo.Modelo_Persona;
import Modelo.Modelo_Solicitud;
import Vista.Actualizacion_Datos;
import Vista.Cuenta_Adoptante;
import Vista.Interfaz_principal;
import Vista.Solicitud_Adopcion;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRSubreport;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.fill.JRFillSubreport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Controlador_Cuenta_Adoptante {

    private ModeloMascota mascota;
    private Cuenta_Adoptante adoptant;
    private Modelo_Persona persona;
    private boolean registro=true;
    private Thread hilo;

    public Controlador_Cuenta_Adoptante(ModeloMascota mascota, Cuenta_Adoptante adoptant, Modelo_Persona persona) {
        this.mascota = mascota;
        this.adoptant = adoptant;
        this.persona=persona;
        iniciaControl();
    }
 
     public void iniciaControl(){
       devolverInsitutos();
       
        KeyAdapter c1=new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
               char c=e.getKeyChar();
               if(Character.isDigit(c) || Character.isLetter(c) || c=='-' || c=='\b' ){}else{
                    e.consume();
                   Toolkit.getDefaultToolkit().beep();
               }
               
                if(adoptant.getTxtIdmascota().getText().length()>24){
                   Toolkit.getDefaultToolkit().beep();
                   e.consume();
               }
            }
        };
        
         KeyAdapter c2=new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
               char c=e.getKeyChar();
               if( Character.isLetter(c) || c=='\b' || Character.isSpaceChar(c) || Character.isDigit(c)){}else{
                    e.consume();
                   Toolkit.getDefaultToolkit().beep();
               }
               
                if(adoptant.getDescripcion().getText().length()>99){
                   Toolkit.getDefaultToolkit().beep();
                   e.consume();
               }

            }
        };
         
         DocumentListener document=new DocumentListener() {
           @Override
           public void insertUpdate(DocumentEvent e) {
               if(!isRegistro()){
                     if(adoptant.getTxtIdmascota().getText().length()>0){}
                      adoptant.getTxtIdmascota().setBorder(new LineBorder(Color.LIGHT_GRAY,1));
               }
               
                 if(adoptant.getDescripcion().getText().length()>0){
                      adoptant.getjScrollPane1().setBorder(new LineBorder(Color.LIGHT_GRAY,1));
                 }
           }

           @Override
           public void removeUpdate(DocumentEvent e) {
                if(!isRegistro()){
                  if(adoptant.getTxtIdmascota().getText().length()==0){
                     adoptant.getTxtIdmascota().setBorder(new LineBorder(Color.RED,2));
                  }
                  
                  if(adoptant.getDescripcion().getText().length()==0){
                     adoptant.getjScrollPane1().setBorder(new LineBorder(Color.RED,2));
                  }
               }
           }

           @Override
           public void changedUpdate(DocumentEvent e) {
           }
       };
         
          KeyAdapter k1=new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
              listar(adoptant.getBusqueda().getText());
            }
        };
          
            hilo=new Reloj(adoptant.getMinuto(),adoptant.getSegundo(),adoptant.getHora());
       hilo.start();
          
       adoptant.getBusqueda().addKeyListener(k1);

       adoptant.getTxtIdmascota().getDocument().addDocumentListener(document);
       adoptant.getDescripcion().getDocument().addDocumentListener(document);
       adoptant.getSalir().addActionListener(l->principal());
       adoptant.getBoton_dez_cerrarseci().addActionListener(l->cerrarSeción());
       adoptant.getCerrar_secion().addActionListener(l-> cerrarSeción());
         
       adoptant.getTxtIdmascota().addKeyListener(c1);
       adoptant.getDescripcion().addKeyListener(c2);
       adoptant.getRbPerro().addActionListener(l->establacerRazaPerro());
       adoptant.getRbGato().addActionListener(l->establecerRazaGato());
       
       adoptant.getLabel_na().setText(persona.getNombre()+" "+persona.getApellido());
       adoptant.getLabel_cedula().setText(persona.getCedula());

       
       adoptant.getBtRegistrar().addActionListener(l->registrarDatos());
       adoptant.getBtFoto().addActionListener(l->cargarImagen());

       adoptant.getBtnCerrar().addActionListener(l->cerrar());
       adoptant.getBtnMinimizar().addActionListener(l->minimizar());
       adoptant.getBtnMenu().addActionListener(l->menu());

       adoptant.getBtnRegistro().addActionListener(l->registroMascota());
       adoptant.getBtnMascotas().addActionListener(l->mascotas());
       
       adoptant.getMascotas().setVisible(false);
       adoptant.getRegistro().setVisible(false);
         
       adoptant.getBoton_movimiento().addActionListener(l->desplazar());
         
       adoptant.getEditar().addActionListener(l->controlarEdicion());
       adoptant.getHistorial().addActionListener(l->abrirHistorial());
       adoptant.getListar().addActionListener(l->listar(""));
       adoptant.getCerrar().addActionListener(l->cerrarJFrame());
              adoptant.getPorfecha().addActionListener(l->imprimirReporte("Barras"));
       adoptant.getImprimir().addActionListener(l->imprimirReporte("Histoi"));
       adoptant.getPorcategoria().addActionListener(l->imprimirReporte("Pasterl_Historial"));

       adoptant.setLocationRelativeTo(null);
       adoptant.getjScrollPane2().getViewport().setOpaque(false);
       adoptant.setVisible(true);
         
     }
     
     public void cerrarJFrame(){
         adoptant.getjFrame1().dispose();
     }

    public Thread getHilo() {
        return hilo;
    }

    public void setHilo(Thread hilo) {
        this.hilo = hilo;
    }

    public Cuenta_Adoptante getAdoptant() {
        return adoptant;
    }

    public void setAdoptant(Cuenta_Adoptante adoptant) {
        this.adoptant = adoptant;
    }

     
     private void desplazar(){
         if(adoptant.getjPanel3().getLocation().x==400){
         Animacion.Animacion.mover_izquierda(400, 100, 2,5, adoptant.getjPanel3());
         Animacion.Animacion.subir(180, 76, 2,8, adoptant.getBoton_dez_cerrarseci());
         adoptant.getBoton_movimiento().setContentAreaFilled(true);
         }else{   
         Animacion.Animacion.mover_derecha(100,400, 2,5, adoptant.getjPanel3());
         Animacion.Animacion.bajar(76,180, 2,8, adoptant.getBoton_dez_cerrarseci());
          adoptant.getBoton_movimiento().setContentAreaFilled(false);
         }
     }
     
      private void regresar(){
          if(adoptant.getjPanel3().getLocation().x==100){
         Animacion.Animacion.mover_derecha(100,400, 2,5, adoptant.getjPanel3());
         Animacion.Animacion.bajar(76,180, 2,8, adoptant.getBoton_dez_cerrarseci());
          adoptant.getBoton_movimiento().setContentAreaFilled(false);
          }
      }
      
      private void controlarEdicion(){
          Controlador_ActualizacionDatos d1=new Controlador_ActualizacionDatos(new Actualizacion_Datos(),persona,this);
    
      }
      
      private void abrirHistorial(){
          adoptant.getjFrame1().setSize(965,448);
          adoptant.getjFrame1().setLocationRelativeTo(null);
          adoptant.getjFrame1().setVisible(true);
      }
     
  
     public void limpiar(){
         adoptant.getButtonGroup1().clearSelection();
         adoptant.getButtonGroup2().clearSelection();
         adoptant.getButtonGroup3().clearSelection();
        adoptant.getTxtIdmascota().setText("");
        adoptant.getAño_nacimiento().setDate(null);
        String[]insitutos=new String[0];
        DefaultComboBoxModel modelito = new DefaultComboBoxModel(insitutos);
        
        adoptant.getCbRaza().setModel(modelito);
        adoptant.getDescripcion().setText("");
        adoptant.getLblFoto().setIcon(null);
     }
    
     public void establacerRazaPerro(){
         devolverRaza("PERRO");
     }
     
     public void establecerRazaGato(){
         devolverRaza("GATO");
     }
     
     JPanel p1=new JPanel();
     
     public void establecerMascotas(){
        adoptant.getPanelarriba().updateUI();
        ArrayList<Clase_Mascota> m1=new ModeloMascota().listar();
        int calculo=(m1.size()/3)+1;
        int calculo2=(int)calculo*185;
         p1.removeAll();
         p1.updateUI();
        p1.setBackground(new Color(255,255,255,10));
        adoptant.getPanelarriba().setPreferredSize(new Dimension(610,calculo2));
        adoptant.getPanelarriba().add(p1);   
         p1.setLayout(new GridLayout(calculo,3,50,10));
         p1.setSize(new Dimension(630,calculo2));
         
         m1.stream().forEach((t) -> {
             p1.add(devolverPanel(t));
         });
       
         if(m1.size()<7){
             for (int i = 0; i < (calculo*3)-m1.size(); i++) {
                 p1.add(Box.createGlue());
             }
         }
    }
 
     
     public JPanel devolverPanel(Clase_Mascota m1){
          JPanel l1=new JPanel(new BorderLayout());
          l1.setBackground(new Color(255,255,255,120));
          JLabel label1=new JLabel("  Año Nacimiento: "+m1.getAño_nacimiento().toLocalDate().getYear()+"  ");
          label1.setFont(new Font("Tw Cent MT",Font.PLAIN,14));
           JButton b1=new JButton();
           Icon ic=new ImageIcon(m1.getFoto());         
           b1.setIcon(ic);
           b1.addActionListener(l->escuchaBotones(m1,b1));
          l1.add(label1,BorderLayout.NORTH);
          l1.add(b1,BorderLayout.CENTER);
          return l1;
     }
     
     private void escuchaBotones(Clase_Mascota m1,JButton boton1){
         Modelo_Solicitud modelo=new Modelo_Solicitud();     
          ModeloMascota modelomascota=new ModeloMascota(m1.getIdmascota(),m1.getDescrpcion(),m1.isEstado(),m1.getTamano(),
          m1.getGenero(),m1.isEsterilizacion(),m1.getTemperamento(),m1.getIdtipo(),m1.getCategoria(),m1.getId_instituto(),m1.getAño_nacimiento());
          modelomascota.setFoto(m1.getFoto());
          new Controlador_Solicitud( modelomascota,persona,new Modelo_Solicitud(),new Solicitud_Adopcion());
            principal();
           
     }
     
    private void registrarDatos(){
        
        if(consultarCamposCompletos()){
            
            if(new ModeloMascota().consultarid(adoptant.getTxtIdmascota().getText())){
                  java.sql.Date date=new java.sql.Date(adoptant.getAño_nacimiento().getDate().getTime());
        ModeloInstituto mod1=new ModeloInstituto();
        ModeloMascota mascota=new ModeloMascota(adoptant.getTxtIdmascota().getText(),adoptant.getDescripcion().getText(),
        false,Float.parseFloat(adoptant.getSpnTamano().getValue()+""),devolverGenero(),devolverEsteralizacion()
        ,adoptant.getTemperamento().getSelectedItem()+"",
        devolverIdTipo(),devolverCategoria(),mod1.devolverIdInsituto(adoptant.getCbInstituto().getSelectedItem()+""),date);
        ImageIcon icono=(ImageIcon) adoptant.getLblFoto().getIcon();
        mascota.setFoto(icono.getImage());
          if(mascota.grabar()){
             JOptionPane.showMessageDialog(p1,"Registro Correcto","Estado Registro",JOptionPane.INFORMATION_MESSAGE,new ImageIcon(getClass().getResource("/Vista/Recursos/correcto.png")));
              limpiar();
              setRegistro(true);
          }else{
              JOptionPane.showMessageDialog(p1,"Registro Incorrecto","Estado Registro",JOptionPane.ERROR_MESSAGE);
              setRegistro(false);
          }
        }else{
                  JOptionPane.showMessageDialog(p1,"Id Mascota ya existente","Estado Registro",JOptionPane.ERROR_MESSAGE); 
         }
       }
    }
    
    private void minimizar(){
          adoptant.setState(JFrame.ICONIFIED);
    }  
     private void cerrar(){
          adoptant.dispose();
          hilo.stop();
    }
    
     
   private void registroMascota(){
        hilo.suspend();
       limpiar();
       regresarMenu();
         adoptant.getMascotas().setVisible(false);
         adoptant.getPanel_principal().setVisible(false);
        adoptant.getSalir().setContentAreaFilled(false);
         adoptant.getBtnRegistro().setContentAreaFilled(true);
           adoptant.getBtnMascotas().setContentAreaFilled(false);
         adoptant.getRegistro().setVisible(true);
        
   }
   
     private void mascotas(){
          hilo.suspend();
          limpiar();
          regresarMenu();
        establecerMascotas();
        adoptant.getRegistro().setVisible(false);
        adoptant.getPanel_principal().setVisible(false);
        adoptant.getSalir().setContentAreaFilled(false);
        adoptant.getBtnMascotas().setContentAreaFilled(true);
        adoptant.getBtnRegistro().setContentAreaFilled(false);
        adoptant.getMascotas().setVisible(true);
     }  
     
     private void principal(){
         hilo.resume();
            limpiar();
            regresarMenu();
        establecerMascotas();
        adoptant.getRegistro().setVisible(false);
        adoptant.getBtnMascotas().setContentAreaFilled(false);
        adoptant.getBtnRegistro().setContentAreaFilled(false);
        adoptant.getMascotas().setVisible(false);
          adoptant.getPanel_principal().setVisible(true);
        adoptant.getSalir().setContentAreaFilled(true);
     }
     
     public boolean consultarCamposCompletos(){
         if(adoptant.getTxtIdmascota().getText().isEmpty() ||
                 (!adoptant.getRbGato().isSelected() && !adoptant.getRbPerro().isSelected()) || 
                 adoptant.getAño_nacimiento().getDate()==null || adoptant.getDescripcion().getText().isEmpty() ||
                 (!adoptant.getRbMacho().isSelected() && !adoptant.getRbHembra().isSelected()) || (!adoptant.getRbSiEstirilizacion().isSelected()
                 && !adoptant.getRbNoEsterilizacion().isSelected()) || adoptant.getLblFoto().getIcon()==null){
            JOptionPane.showMessageDialog(p1,"No pueden haber campos vacios","ERROR",JOptionPane.ERROR_MESSAGE);
            
            if(adoptant.getDescripcion().getText().isEmpty()){
                 adoptant.getjScrollPane1().setBorder(new LineBorder(Color.RED,2));
            }
            if(adoptant.getTxtIdmascota().getText().isEmpty()){
                   adoptant.getTxtIdmascota().setBorder(new LineBorder(Color.RED,2));
            }
           return false;
         }else{
             return true;
         }
     }

      private void menu(){
          regresar();
        AnimationClass mascota=new AnimationClass();
      mascota.jButtonXRight(-40, 10, 10, 5,   adoptant.getBtnMascotas());
      AnimationClass registro=new AnimationClass();
      registro.jButtonXRight(-40, 10, 10, 5,   adoptant.getBtnRegistro());
      AnimationClass salir=new AnimationClass();
      salir.jButtonXRight(-40, 10, 10, 5,   adoptant.getSalir());
      
      AnimationClass mascotar=new AnimationClass();
      mascotar.jButtonXLeft(10, -40, 10, 5,   adoptant.getBtnMascotas());
      AnimationClass regristroo=new AnimationClass();
      regristroo.jButtonXLeft(10, -40, 10, 5,   adoptant.getBtnRegistro());  
       AnimationClass salirr=new AnimationClass();
      salirr.jButtonXLeft(10,-40, 10, 5,  adoptant.getSalir());
    } 
      
      private void regresarMenu(){
           AnimationClass mascotar=new AnimationClass();
      mascotar.jButtonXLeft(10, -40, 10, 5,   adoptant.getBtnMascotas());
      AnimationClass regristroo=new AnimationClass();
      regristroo.jButtonXLeft(10, -40, 10, 5,   adoptant.getBtnRegistro());  
       AnimationClass salirr=new AnimationClass();
      salirr.jButtonXLeft(10,-40, 10, 5,  adoptant.getSalir());
      }
    
     private  void imprimirReporte(String nombre){
           Conexion_SGBD p1=new  Conexion_SGBD();
            JasperReport r1 = null;
        try {
         r1=(JasperReport)JRLoader.loadObject(getClass().getResource("/Vista/Reportes/"+nombre+".jasper"));
        } catch (JRException ex) {}

 	Map<String,Object> mapa=new HashMap<String,Object>();
 	mapa.put("Id_Adoptante","AD-"+persona.getCedula());
   
        
        JasperPrint pr1 = null;
        try {
            pr1 = JasperFillManager.fillReport(r1,mapa,p1.getConexion());
        } catch (JRException ex) {
            Logger.getLogger(Controlador_Solicitud.class.getName()).log(Level.SEVERE, null, ex);
        }
            JasperViewer jv1=new JasperViewer(pr1,false);
            jv1.setVisible(true);
           
       }
    
    public String devolverGenero(){
        String genero=null;
        if(adoptant.getRbMacho().isSelected()){
            genero="Macho";
        }else{
            genero="Hembra";
        }
        return genero;
    }
    
    public boolean devolverEsteralizacion(){
        boolean ester=false;
        if(adoptant.getRbSiEstirilizacion().isSelected()){
            ester=true;
        }else{
            ester=false;
        }
        return ester;
    }
    
    public String devolverIdTipo(){
        String id=null;
        if(adoptant.getRbPerro().isSelected()){
            id="0101";
        }else{
            id="0102";
        }
        return id;
    }
    
    public String devolverCategoria(){
        String categoria=null;
        if(adoptant.getRbPerro().isSelected()){
            categoria="perro";
        }else{
            categoria="gato";
        }
        return categoria;
    }
     
     private void cargarImagen(){
        JFileChooser jfc= new JFileChooser();
        FileNameExtensionFilter f1=new FileNameExtensionFilter("JPG, PNG & GIF","jpg","png","gif");
        jfc.setFileFilter(f1);
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int estado=jfc.showOpenDialog(null);
        if(estado==JFileChooser.APPROVE_OPTION){
            try {
                Image icono = ImageIO.read(jfc.getSelectedFile()).getScaledInstance(adoptant.getLblFoto().getWidth(),adoptant.getLblFoto().getHeight(),Image.SCALE_DEFAULT);
             Icon ic=new ImageIcon(icono);
             adoptant.getLblFoto().setIcon(ic);
             adoptant.getLblFoto().updateUI();
            } catch (IOException ex) {
                Logger.getLogger(Controlador_Cuenta_Adoptante.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

     public void devolverInsitutos(){
           
         ModeloInstituto l1=new  ModeloInstituto();
         ArrayList<String> r1=l1.listar();
         String[]insitutos=new String[r1.size()];
         insitutos=r1.toArray(insitutos);
         DefaultComboBoxModel modelito = new DefaultComboBoxModel(insitutos);
         adoptant.getCbInstituto().setModel(modelito);
     }
     
     public void devolverRaza(String tipo){
         ModeloRaza l1=new ModeloRaza(); 
         ArrayList<String> r1=l1.listar(tipo);
         String[]insitutos=new String[r1.size()];
         insitutos=r1.toArray(insitutos);        
         DefaultComboBoxModel modelito = new DefaultComboBoxModel(insitutos);
         adoptant.getCbRaza().setModel(modelito);
     }
     
     private void listar(String aguja){
         adoptant.getjTable1().setRowHeight(110);
        adoptant.getjTable1().setDefaultRenderer(Object.class,new RenderizacionTabla());
       Modelo_InformeSolicitud m1= new Modelo_InformeSolicitud("","","",null,"AD-"+persona.getCedula());
         adoptant.getjTable1().setModel(new EstiloTablaHistorial(new Modelo_InformeSolicitud().listar(aguja)));
     }

    public boolean isRegistro() {
        return registro;
    }

    public void setRegistro(boolean registro) {
        this.registro = registro;
    }
     
     public void cerrarSeción(){
     
         if (JOptionPane.showConfirmDialog(p1, "¿Desea realmente cerrar Seción?",
                "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
             Controlador_Principal p=new Controlador_Principal(new Interfaz_principal(),new Modelo_CuentaUsuario());
             adoptant.dispose();
             hilo.stop();

         }

     }
     
    private class Reloj extends Thread{
         JLabel minuto;
         JLabel segundos;
         JLabel hora;
         LocalDateTime relo;
         
         public Reloj(JLabel minuto,JLabel segundos,JLabel hora){
             this.minuto=minuto;
             this.segundos=segundos;
             this.hora=hora;
         }

        @Override
        public void run() {
            while(true){
             try {
                 
                 relo=LocalDateTime.now();
                 if(relo.getMinute()<10){
                     minuto.setText("0"+relo.getMinute()+"");
                 }else{
                      minuto.setText(relo.getMinute()+"");
                 }
                 
                 if(relo.getHour()<10){
                     hora.setText("0"+relo.getHour()+"");
                 }else{
                      hora.setText(relo.getHour()+"");
                 }
                 
                  if(relo.getSecond()<10){
                          segundos.setText("0"+relo.getSecond()+"");
                  }else{
                       segundos.setText(relo.getSecond()+"");
                  }
                 sleep(1000);
                 
             } catch (InterruptedException ex) {
                 Logger.getLogger(Controlador_Cuenta_Adoptante.class.getName()).log(Level.SEVERE, null, ex);
             }   
            }
        }
         
    
     }
    
}


