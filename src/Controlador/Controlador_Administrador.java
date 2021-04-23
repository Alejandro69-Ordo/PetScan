
package Controlador;

import AppPackage.AnimationClass;
import Modelo.Clase_Adoptante;
import Modelo.Clase_Mascota;
import Modelo.Clase_Persona;
import Modelo.Conexion_SGBD;
import Modelo.ModeloInstituto;
import Modelo.ModeloMascota;
import Modelo.ModeloRaza;
import Modelo.Modelo_Adoptante;
import Modelo.Modelo_Persona;
import Vista.Administrador;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import sun.swing.table.DefaultTableCellHeaderRenderer;


public class Controlador_Administrador {
    
    private Modelo_Adoptante ma;
    private ModeloInstituto inst;
    private Administrador vr;
    private ModeloRaza rz;

    public Controlador_Administrador(Modelo_Adoptante ma, ModeloInstituto inst, Administrador vr, ModeloRaza rz) {
        this.ma = ma;
        this.inst = inst;
        this.vr = vr;
        this.rz = rz;
        
        iniciaControl();
    }
    
     private void iniciaControl() {
         KeyListener kl = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {       }
            @Override
            public void keyPressed(KeyEvent e) {            }
            @Override
            public void keyReleased(KeyEvent e) {
                cargaLista(vr.getTxtBuscar().getText()); }    };
         
         KeyListener kl2 = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {       }
            @Override
            public void keyPressed(KeyEvent e) {            }
            @Override
            public void keyReleased(KeyEvent e) {
                cargaListaMascota(vr.getTxtBuscarM().getText()); }    };
   
         vr.getCerrar().addActionListener(l->cerrar());
         vr.getBtnCerrarInst().addActionListener(l->cerrarI());
         vr.getBtnCerrarRaza().addActionListener(l->cerrarR());
         vr.getMinimizar().addActionListener(l->minimizar());
         vr.getBtnMenu().addActionListener(l->menu());
         
         vr.getPnlMascota().setVisible(false);
        vr.getPnlUsuario().setVisible(true);
         
         vr.getTxtBuscar().addKeyListener(kl);
         vr.getTxtBuscarM().addKeyListener(kl2);
         vr.getBtnRegistroInst().addActionListener(l->verdlgInst());
         vr.getBtnRegistroRaza().addActionListener(l->verdlgRaza());
         
         vr.getBtnGuardarInst().addActionListener(l->registrarDatosInst());
         vr.getBtnGuardarRaza().addActionListener(l->registrarDatosRaza());
         
         vr.getBtnActualizarTbl().addActionListener(l->cargaLista(""));
         vr.getBtnReporte().addActionListener(l->imprimirReporte());
         vr.getBtnReporteCert().addActionListener(l->imprimirCertificado());
         vr.getBtnActualizarTblM().addActionListener(l->cargaListaMascota(""));

         vr.getBtnReporteMascota().addActionListener(l->mascotaReporte());
         vr.getBtnReporteUsuario().addActionListener(l->usuariosReporte());
         vr.setLocationRelativeTo(null);
         vr.setVisible(true);
    }
     
   private void cerrar(){
        if (JOptionPane.showConfirmDialog(vr, "¿Desea cerrar?",
                "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
             vr.dispose();
        }
       
    }
   
   private void cerrarR(){
        if (JOptionPane.showConfirmDialog(vr, "¿Desea cerrar?",
                "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
             vr.getDlgRaza().dispose();
        }
       
    }
   private void cerrarI(){
        if (JOptionPane.showConfirmDialog(vr, "¿Desea cerrar?",
                "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
             vr.getDlgInstituto().dispose();
        }
       
    }
   
   private void minimizar(){
        vr.setState(JFrame.ICONIFIED);
    }
   private void menu(){
      AnimationClass mascota=new AnimationClass();
      mascota.jButtonXRight(-60, 0, 10, 5,   vr.getBtnReporteMascota());
      AnimationClass registro=new AnimationClass();
      registro.jButtonXRight(-60, 0, 10, 5,   vr.getBtnReporteUsuario());
      AnimationClass mascotar=new AnimationClass();
      mascotar.jButtonXLeft(0, -60, 10, 5,   vr.getBtnReporteMascota());
      AnimationClass regristroo=new AnimationClass();
      regristroo.jButtonXLeft(0, -60, 10, 5,   vr.getBtnReporteUsuario()); 
      AnimationClass raza=new AnimationClass();
      mascota.jButtonXRight(-60, 0, 10, 5,   vr.getBtnRegistroRaza());
      AnimationClass inst=new AnimationClass();
      registro.jButtonXRight(-60, 0, 10, 5,   vr.getBtnRegistroInst());
      AnimationClass razar=new AnimationClass();
      mascotar.jButtonXLeft(0, -60, 10, 5,   vr.getBtnRegistroRaza());
      AnimationClass instr=new AnimationClass();
      regristroo.jButtonXLeft(0, -60, 10, 5,   vr.getBtnRegistroInst()); 
    }
   
   private void usuariosReporte(){
        
        vr.getPnlMascota().setVisible(false);
        vr.getBtnReporteMascota().setContentAreaFilled(false);
        vr.getBtnReporteUsuario().setContentAreaFilled(true);
        vr.getPnlUsuario().setVisible(true);
     }
     
   private void mascotaReporte(){
        vr.getPnlUsuario().setVisible(false);
        vr.getBtnReporteUsuario().setContentAreaFilled(false);
        vr.getBtnReporteMascota().setContentAreaFilled(true);
        vr.getPnlMascota().setVisible(true);
     }
   
   
   
   
   private void cargaLista(String aguja){
       // DefaultTableCellRenderer renderer= new DefaultTableCellHeaderRenderer();
        DefaultTableModel tblModel;
        tblModel=(DefaultTableModel)vr.getTblTabla().getModel();
        tblModel.setNumRows(0);
        List<Clase_Persona> lista=Modelo_Persona.listarP(aguja);
        int ncols=tblModel.getColumnCount();
        Holder<Integer> i = new Holder<>(0);
        lista.stream().forEach(p1->{
           tblModel.addRow(new Object[ncols]);
           vr.getTblTabla().setValueAt(p1.getCedula(), i.value , 0);
           vr.getTblTabla().setValueAt(p1.getNombre(), i.value , 1);
           vr.getTblTabla().setValueAt(p1.getApellido(), i.value , 2);
           vr.getTblTabla().setValueAt(p1.getGenero(), i.value , 3);
           i.value++;
          ;
        });
    }
   
   
   private void cargaListaMascota(String aguja){
       // DefaultTableCellRenderer renderer= new DefaultTableCellHeaderRenderer();
        DefaultTableModel tblModel;
        tblModel=(DefaultTableModel)vr.getTblTablaM().getModel();
        tblModel.setNumRows(0);
        List<Clase_Mascota> lista=ModeloMascota.listarMascota(aguja);
        int ncols=tblModel.getColumnCount();
        Holder<Integer> i = new Holder<>(0);
        lista.stream().forEach(p1->{
           tblModel.addRow(new Object[ncols]);
           vr.getTblTablaM().setValueAt(p1.getIdmascota(), i.value , 0);
           vr.getTblTablaM().setValueAt(p1.getIdtipo(), i.value , 1);
           vr.getTblTablaM().setValueAt(p1.getAño_nacimiento(), i.value , 2);
           vr.getTblTablaM().setValueAt(p1.getDescrpcion(), i.value , 3);
           vr.getTblTablaM().setValueAt(p1.getTamano(), i.value , 4);
           vr.getTblTablaM().setValueAt(p1.getGenero(), i.value , 5);
           vr.getTblTablaM().setValueAt(p1.getTemperamento(), i.value , 6);
           i.value++;
          ;
        });
    }
   
   private void imprimirReporte(){
        Conexion_SGBD con=new Conexion_SGBD();
        try {
            JasperReport jr=(JasperReport)JRLoader.loadObject(getClass().getResource("/vista/Reportes/ContratoAdopcion.jasper"));
            String aguja = vr.getTxtBuscar().getText();
            Map<String,Object> parametros= new HashMap<String,Object>();
            parametros.put("aguja", "%"+aguja+"%");
            JasperPrint jp = JasperFillManager.fillReport(jr, parametros,con.getConexion());
            JasperViewer jv= new JasperViewer(jp);
            jv.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Controlador_Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   private void imprimirCertificado(){
        Conexion_SGBD con=new Conexion_SGBD();
        try {
            JasperReport jr=(JasperReport)JRLoader.loadObject(getClass().getResource("/vista/Reportes/rptCertificado.jasper"));
            String aguja = vr.getTxtBuscar().getText();
            Map<String,Object> parametros= new HashMap<String,Object>();
            parametros.put("aguja", "%"+aguja+"%");
            JasperPrint jp = JasperFillManager.fillReport(jr, parametros,con.getConexion());
            JasperViewer jv= new JasperViewer(jp);
            jv.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Controlador_Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   private void imprimirReporteMascota(){
        Conexion_SGBD con=new Conexion_SGBD();
        try {
            JasperReport jr=(JasperReport)JRLoader.loadObject(getClass().getResource("/vista/Reportes/rptMascotas.jasper"));
            String aguja = vr.getTxtBuscarM().getText();
            Map<String,Object> parametros= new HashMap<String,Object>();
            parametros.put("aguja", "%"+aguja+"%");
            JasperPrint jp = JasperFillManager.fillReport(jr, parametros,con.getConexion());
            JasperViewer jv= new JasperViewer(jp);
            jv.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Controlador_Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   JPanel p1=new JPanel();
   public boolean CamposCompletosInst(){
         if(vr.getTxtIdInsti().getText().isEmpty() ||
                  vr.getTxtNombreInst().getText().isEmpty() || vr.getTxtCallePrincipal().getText().isEmpty() ||
                  vr.getTxtCalleSecundaria().getText().isEmpty() ){
            JOptionPane.showMessageDialog(p1,"No pueden haber campos vacios","ERROR",JOptionPane.ERROR_MESSAGE);
           return false;
         }else{
             return true;
         }
     }
   
   public boolean CamposCompletosRaza(){
         if(vr.getTxtIdRaza().getText().isEmpty() ||
                  vr.getTxtNombreRaza().getText().isEmpty() ){
            JOptionPane.showMessageDialog(p1,"No pueden haber campos vacios","ERROR",JOptionPane.ERROR_MESSAGE);
           return false;
         }else{
             return true;
         }
     }
   
   private void registrarDatosInst(){
        if(CamposCompletosInst()){
            if(new ModeloInstituto().consultaridInst(vr.getTxtIdInsti().getText())){
             ModeloInstituto modIns=new ModeloInstituto(Integer.parseInt(vr.getTxtIdInsti().getText()) , vr.getTxtNombreInst().getText(),
                                                 vr.getTxtCallePrincipal().getText(), vr.getTxtCalleSecundaria().getText());
            if(modIns.grabar()){
             JOptionPane.showMessageDialog(p1,"Registro Correcto","Estado Registro",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("C:\\Users\\HP\\Downloads\\a.png"));
             limpiarInst();
             // setRegistro(true);
            }else{
              JOptionPane.showMessageDialog(p1,"Registro Incorrecto","Estado Registro",JOptionPane.ERROR_MESSAGE);
              //setRegistro(false);
            }
            }else{
                  JOptionPane.showMessageDialog(p1,"Id Instituto ya existente","Estado Registro",JOptionPane.ERROR_MESSAGE); 
         }
       }
    }
   
   
   private void registrarDatosRaza(){
        if(CamposCompletosRaza()){
            if(new ModeloRaza().consultaridRaza(vr.getTxtIdRaza().getText())){
             ModeloRaza modRz=new ModeloRaza(vr.getTxtIdRaza().getText(), vr.getTxtNombreRaza().getText(),
                     Integer.parseInt(vr.getSpnAnosPromedio().getValue()+""), devolverIdTipo(), devolverCategoria());
            if(modRz.grabar()){
             JOptionPane.showMessageDialog(p1,"Registro Correcto","Estado Registro",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("C:\\Users\\HP\\Downloads\\a.png"));
              limpiarRaza();
             // setRegistro(true);
            }else{
              JOptionPane.showMessageDialog(p1,"Registro Incorrecto","Estado Registro",JOptionPane.ERROR_MESSAGE);
              //setRegistro(false);
            }
            }else{
                  JOptionPane.showMessageDialog(p1,"Id Raza ya existente","Estado Registro",JOptionPane.ERROR_MESSAGE); 
         }
       }
    }
   public String devolverIdTipo(){
        String id=null;
        if(vr.getRbPerro().isSelected()){
            id="0101";
        }else{
            id="0102";
        }
        return id;
    }
    
    public String devolverCategoria(){
        String categoria=null;
        if(vr.getRbPerro().isSelected()){
            categoria="perro";
        }else{
            categoria="gato";
        }
        return categoria;
    }
   private void limpiarRaza(){
       vr.getTxtIdRaza().setText("");
       vr.getTxtNombreRaza().setText("");
   }
   private void limpiarInst(){
       vr.getTxtIdInsti().setText("");
       vr.getTxtNombreInst().setText("");
       vr.getTxtCallePrincipal().setText("");
       vr.getTxtCalleSecundaria().setText("");
   }
   private void verdlgRaza(){
    vr.getDlgRaza().setSize(400, 300);
    vr.getDlgRaza().setLocationRelativeTo(null);
    limpiarRaza();

    vr.getDlgRaza().setVisible(true);
   }

   private void verdlgInst(){
    vr.getDlgInstituto().setSize(400, 300);
    vr.getDlgInstituto().setLocationRelativeTo(null);
    limpiarInst();
    vr.getDlgInstituto().setVisible(true);
   }


   
    
}
