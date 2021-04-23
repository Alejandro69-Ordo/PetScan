package Controlador;

import Modelo.ModeloMascota;
import Vista.xi;
import javax.swing.JFrame;
import AppPackage.AnimationClass;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class x {
   
    xi rm;
    ModeloMascota mm;
    
    public x(xi rm) {
        this.rm = rm;
        this.mm = mm;
        
    }
    
    public void inicialControl(){
        

       rm.getBtnCerrar().addActionListener(l->cerrar());
       rm.getBtnMinimizar().addActionListener(l->minimizar());
       rm.getBtnCerrarRaza().addActionListener(l->cerrar());
       rm.getBtnMinimizarRaza().addActionListener(l->minimizar());
       rm.getBtnCerrarInst().addActionListener(l->cerrar());
       rm.getBtnMinimizarInst().addActionListener(l->minimizar());
       rm.getBtnMenu().addActionListener(l->menu());
       rm.getBtnRegistro().addActionListener(l->registroMascota());
       rm.getBtnMascotas().addActionListener(l->mascotas());
       
       rm.setLocationRelativeTo(null);
        
         this.rm.setVisible(true);
    }
  //Botones Cerrar, Minimizar, Menú ,Registrar, mascotas 
 //-------------------------------------------------------------------------------------------------------  
    
     private void formWindowOpened(WindowEvent evt) {                                  
     //para que al momento de abrir la ventana se muestre el jpanel de mascotas y se oculte el de jpanel de registro
     rm.getMascotas().setVisible(true);
     rm.getRegistro().setVisible(false);
    } 
    private void minimizar(){
        rm.setState(JFrame.ICONIFIED);
    }  
     private void cerrar(){
        rm.dispose();
    }
     private void menu(){
        AnimationClass mascota=new AnimationClass();
      mascota.jButtonXRight(-60, 0, 10, 5, rm.getBtnMascotas());
      AnimationClass registro=new AnimationClass();
      registro.jButtonXRight(-60, 0, 10, 5, rm.getBtnRegistro());
      AnimationClass mascotar=new AnimationClass();
      mascotar.jButtonXLeft(0, -60, 10, 5, rm.getBtnMascotas());
      AnimationClass regristroo=new AnimationClass();
      regristroo.jButtonXLeft(0, -60, 10, 5, rm.getBtnRegistro());
        
    } 
     private void registroMascota(){
        rm.getRegistro().setVisible(true);
        rm.getMascotas().setVisible(false);
     }
     private void mascotas(){
        rm.getRegistro().setVisible(false);
        rm.getMascotas().setVisible(true);
     }     
     
  //
 //-------------------------------------------------------------------------------------------------------  
     private void SoloLetras(JTextField caja){
        caja.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evento){
                char validar = evento.getKeyChar();
                if (Character.isDigit(validar)) {
                    evento.consume();
                }
            }
        });
    }
     private void SoloNumeros(JTextField caja){
        caja.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evento){
                char validar = evento.getKeyChar();
                if (Character.isLetter(validar)) {
                    evento.consume();
                }
            }
        });
    }
     
    
   //Guardar mascota
 //-------------------------------------------------------------------------------------------------------  
     private void grabaPersona(){
        
        String Raza = " ";
        String Instituto = " ";
    String idmasota=rm.getTxtIdmascota().getText();




        Image foto = null;

//    ModeloMascota mascota = new ModeloMascota(idmasota, Raza, TipoMasota, Instituto, añonacimiento, Instituto, true, 0, Raza, true, TipoMasota, 0);
//    Foto
//    ImageIcon ic= (ImageIcon)vista.getLblFoto().getIcon();
//    persona.setFoto(ic.getImage());
//    if(mascota.grabar()){
//        JOptionPane.showMessageDialog(rm, "Registro grabado satisfactoriamente");
//        }else{
//       JOptionPane.showMessageDialog(rm, "ERROR");
//    }
    
    }
    
   //
     public String validaEstado(){
        String estado="";
        if (rm.getRbAdoptado().isSelected()) {
            estado="ADOPTADO";   
        }else{
            if(rm.getRbEnAdopcion().isSelected()){
                estado="EN ADOPCION";
            }  }
        return estado;
    }
     public String validaGenero(){
        String genero="";
        
        if (rm.getRbHembra().isSelected()) {
            genero="HEMBRA";
            
        }else{
            if(rm.getRbMacho().isSelected()){
                genero="MACHO";
            }
        }
        
        return genero;
    }
     public String validaEsterilizacion(){
        String esterilizacion="";
        if (rm.getRbSiEstirilizacion().isSelected()) {
            esterilizacion="SI";    
        }else{ 
            if(rm.getRbNoEsterilizacion().isSelected()){
                esterilizacion="NO";
            } }
        return esterilizacion;
    }
     
     String tipo;
     void listaRMascota(){
       
//        if (rm.getRbPerro().isSelected()) {
//            rm.getCbRaza().removeAllItems();
//                  tipo="Perro";
//                Principal.Principal.lperro.forEach((listap)-> {
//                     rm.getCbRaza().addItem(listap);
//                                          });
//                   
//        }else{
//            rm.getCbRaza().removeAllItems();
//        Principal.Principal.lgato.forEach((listag)->{
//            rm.getCbRaza().addItem(listag);
//            
//        });
//        tipo="Gato";
            
        }
        
    }
 

