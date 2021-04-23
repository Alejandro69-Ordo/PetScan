package Controlador;

import AppPackage.AnimationClass;
import Modelo.Conexion_SGBD;
import Modelo.ModeloMascota;
import Modelo.Modelo_Adoptante;
import Modelo.Modelo_Localidad;
import Modelo.Modelo_Persona;
import Modelo.Modelo_Solicitud;
import Vista.Solicitud_Adopcion;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Controlador_Solicitud {
    
    ModeloMascota mascota;
    Modelo_Persona persona;
    Modelo_Solicitud solictud;
    Solicitud_Adopcion vista;

    public Controlador_Solicitud(ModeloMascota mascota, Modelo_Persona persona, Modelo_Solicitud solictud,Solicitud_Adopcion vista) {
        this.mascota = mascota;
        this.persona = persona;
        this.solictud = solictud;
        this.vista=vista;
          iniciaControl();
    }

    public void  iniciaControl(){
        vista.getPanel_informacion().setVisible(true);
        vista.getPanel_adopcion().setVisible(false);
        
        vista.getR_provincia().addActionListener(l->devolverCiudades());
        devolverCiudades();
        
       Icon icono=new ImageIcon(mascota.getFoto());
       
        vista.getLabel_foto().setIcon(icono);
        vista.getAño_nacimiento().setText(mascota.getAño_nacimiento().toLocalDate().getYear()+"");
        vista.getDescripcion().setText(mascota.getDescrpcion());
        vista.getTamaño().setText(mascota.getTamano()+"");
        vista.getGenero().setText(mascota.getGenero()+"");
        vista.getTemperamento().setText(mascota.getTemperamento());
        vista.getEsterilizacion().setText(mascota.isEsterilizacion()+"");

        vista.getMenu().addActionListener(l->desplazarMenu());
        vista.getInformacion().addActionListener(l->informacion());
        vista.getSolicitud().addActionListener(l->solicitud());
        
        vista.getLabel_na().setText(persona.getNombre()+" "+persona.getApellido());
        vista.getLabel_cedula().setText(persona.getCedula());

        vista.getCerrar().addActionListener(l->cerrar());
        vista.getMinimizar().addActionListener(l->minimizar());
        vista.getBoton_dez_cerrarseci().addActionListener(l->volverFrameMascotas());
        vista.getEnviar().addActionListener(l->registrar());

         vista.getBoton_movimiento().addActionListener(l->desplazar());
        
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        
    }
    
    private void volverFrameMascotas(){
        vista.dispose();
    }
    
    private void desplazar(){
         if(vista.getjPanel10().getLocation().x==920){
         Animacion.Animacion.mover_izquierda(920, 635, 2,5, vista.getjPanel10());
         Animacion.Animacion.subir(560, 440, 2,7, vista.getBoton_dez_cerrarseci());
         vista.getBoton_movimiento().setContentAreaFilled(true);
         
         }else{   
         Animacion.Animacion.mover_derecha(635,920, 2,5, vista.getjPanel10());
         Animacion.Animacion.bajar(440,560, 2,10, vista.getBoton_dez_cerrarseci());
          vista.getBoton_movimiento().setContentAreaFilled(false);
         }
     }
     private void regresar(){
         if(vista.getjPanel10().getLocation().x==635){
              Animacion.Animacion.mover_derecha(635,920, 2,5, vista.getjPanel10());
         Animacion.Animacion.bajar(440,560, 2,10, vista.getBoton_dez_cerrarseci());
          vista.getBoton_movimiento().setContentAreaFilled(false);
         }
     }
    
    private void registrar(){
        
        int i=JOptionPane.showConfirmDialog(vista,"¿Esta seguro de aceptar la adopcion?");
        if(i==0){
                    Date d1=new Date(new java.util.Date().getTime());
            Modelo_Solicitud mod1=new Modelo_Solicitud(new Modelo_Solicitud().id_solicitud(),mascota.getIdmascota(),new Modelo_Adoptante().id_adoptante(persona.getCedula()),
                    new Modelo_Localidad().id_localidad(vista.getR_provincia().getSelectedItem()+"",vista.getR_ciudad().getSelectedItem()+""),
                    d1,vista.getR_tipo_vivienda().getSelectedItem()+"");
            
            if(mod1.registrarSolicitud()){
                JOptionPane.showMessageDialog(vista,"Registro Correcto","Correcto",JOptionPane.INFORMATION_MESSAGE,new ImageIcon(getClass().getResource("/Vista/Recursos/correcto.png")));
                imprimirReporte();
                vista.dispose();
                new ModeloMascota().actualizarMascota(mascota.getIdmascota());
            }else{
                JOptionPane.showMessageDialog(vista,"Registro Incorrecto","Estado Registro",JOptionPane.ERROR_MESSAGE);
            }
                
        }
    }
    
    private void devolverCiudades(){
        Modelo_Localidad l1=new Modelo_Localidad();
        ArrayList<String> ciud=l1.devolverCiudades(vista.getR_provincia().getSelectedItem()+"");
        String[]ciudades=new String[ciud.size()];
         ciudades=ciud.toArray(ciudades);        
         DefaultComboBoxModel modelito = new DefaultComboBoxModel(ciudades);
         vista.getR_ciudad().setModel(modelito);
    }

     private void minimizar(){
          vista.setState(JFrame.ICONIFIED);
    }  
    
     private void cerrar(){
          vista.dispose();
    }
    
    
    private void solicitud(){
        vista.getPanel_informacion().setVisible(false);
        vista.getInformacion().setContentAreaFilled(false);
        vista.getLabelparte1().setText("SOLICITUD DE");
        vista.getLabelparte2().setText("ADOPCIÓN");
        vista.getSolicitud().setContentAreaFilled(true);
        vista.getPanel_adopcion().setVisible(true);
    }
    
    private void informacion(){
        vista.getPanel_adopcion().setVisible(false);
                vista.getSolicitud().setContentAreaFilled(false);
        vista.getLabelparte1().setText("INFORMACIÓN DE");
        vista.getLabelparte2().setText("MASCOTA");
            vista.getInformacion().setContentAreaFilled(true);
        vista.getPanel_informacion().setVisible(true);
       
    }
    
    private void desplazarMenu(){
        regresar();
      AnimationClass mascota=new AnimationClass();
      mascota.jButtonXRight(-60, 0, 10, 5, vista.getSolicitud());
      AnimationClass registro=new AnimationClass();
      registro.jButtonXRight(-60, 0, 10, 5,   vista.getInformacion());
      AnimationClass mascotar=new AnimationClass();
      mascotar.jButtonXLeft(0, -60, 10, 5,  vista.getSolicitud());
      AnimationClass regristroo=new AnimationClass();
      regristroo.jButtonXLeft(0, -60, 10, 5,vista.getInformacion());
    }
    
    private  void imprimirReporte(){
           Conexion_SGBD p1=new  Conexion_SGBD();
           JasperReport r1 = null;
        try {
         r1=(JasperReport)JRLoader.loadObject(getClass().getResource("/Vista/Reportes/adopcion.jasper"));
        } catch (JRException ex) {}


 	Map<String,Object> mapa=new HashMap<String,Object>();
 	mapa.put("aguja",persona.getCedula());
    
        JasperPrint pr1 = null;
        try {
            pr1 = JasperFillManager.fillReport(r1,mapa,p1.getConexion());
        } catch (JRException ex) {
            Logger.getLogger(Controlador_Solicitud.class.getName()).log(Level.SEVERE, null, ex);
        }
            JasperViewer jv1=new JasperViewer(pr1,false);
            jv1.setVisible(true);
           
       }
    
}
