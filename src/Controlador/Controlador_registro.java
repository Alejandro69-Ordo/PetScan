
package Controlador;

import Modelo.Modelo_CuentaUsuario;
import Modelo.Modelo_Adoptante;
import Modelo.Modelo_Persona;
import Vista.Interfaz_principal;
import Vista.Registro_Adoptante;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.event.DocumentEvent;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentListener;

public class Controlador_registro {
    
    private Registro_Adoptante p1;
    private Modelo_Adoptante p2;

    public Controlador_registro(Registro_Adoptante p1,Modelo_Adoptante p2) {
        this.p1 = p1;
        this.p2=p2;
        p1.setLocationRelativeTo(null);
        p1.setVisible(true);
        iniciaControl();
    }
    
    public void iniciaControl(){
       
        KeyAdapter c1=new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
               char c=e.getKeyChar();
               if(Character.isDigit(c) || c=='\b' ){}else{
                    e.consume();
                   Toolkit.getDefaultToolkit().beep();
               }
               
                if(p1.getCedula().getText().length()>9){
                   Toolkit.getDefaultToolkit().beep();
                   e.consume();
               }
            }
        };

         KeyAdapter c2=new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
               char c=e.getKeyChar();
               if(Character.isLetter(c) || c=='\b' ){}else{
                    e.consume();
                   Toolkit.getDefaultToolkit().beep();
               }
               
                if(p1.getNombre().getText().length()>49 ){
                   Toolkit.getDefaultToolkit().beep();
                   e.consume();
               }
                if(p1.getApellido().getText().length()>49){
                   Toolkit.getDefaultToolkit().beep();
                   e.consume();
               }
            }
        };

          KeyAdapter c3=new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
               char c=e.getKeyChar();
               if(Character.isLetter(c) || c=='\b' || Character.isSpaceChar(c) || Character.isDigit(c) || c=='.' || c=='/' 
                       || c=='-' || c=='_'){}else{
                    e.consume();
                   Toolkit.getDefaultToolkit().beep();
               }
               
                if(p1.getCalle_principal().getText().length()>49 || p1.getCalle_secundaria().getText().length()>49){
                   Toolkit.getDefaultToolkit().beep();
                   e.consume();
               }
            }
        };

          KeyAdapter c4=new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
               char c=e.getKeyChar();
               if(Character.isDigit(c)){}else{
                    e.consume();
                   Toolkit.getDefaultToolkit().beep();
               }
               
                if(p1.getTelefono().getText().length()>9 ){
                   Toolkit.getDefaultToolkit().beep();
                   e.consume();
               }
            }
        };
          
           KeyAdapter c5=new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
               char c=e.getKeyChar();
               if(Character.isDigit(c) || Character.isLetter(c) || c=='@'
                        ||  c=='.' ||  c=='_' ||  c=='-' || c=='\b' ){}else{
                    e.consume();
                   Toolkit.getDefaultToolkit().beep();
               }
            }
        };
           
        
        KeyAdapter c6=new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
               char c=e.getKeyChar();
               if(Character.isDigit(c) || Character.isLetter(c) || c=='\b'  ||  c=='_' ||  c=='-' 
                       || Character.isSpaceChar(c) ){}else{
                   e.consume();
                   Toolkit.getDefaultToolkit().beep();
               }
               
               if( p1.getText_Contraseña().getText().length()>9 ){
                    e.consume();
                   Toolkit.getDefaultToolkit().beep();
               }
            }
        };   
        
        KeyAdapter c7=new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
               char c=e.getKeyChar();
               if(Character.isDigit(c) || Character.isLetter(c) || c=='\b'  ||  c=='_' ||  c=='-' 
                       || Character.isSpaceChar(c) ){}else{
                   e.consume();
                   Toolkit.getDefaultToolkit().beep();
               }
               
               if( p1.getContraseñasegundo().getText().length()>9){
                    e.consume();
                   Toolkit.getDefaultToolkit().beep();
               }
            }
        };   
        
          DocumentListener documento=new DocumentListener() {
           @Override
           public void insertUpdate(DocumentEvent e) {
                 if(p1.getText_Contraseña().getText().length()>=1 && p1.getText_Contraseña().getText().length()<=3){
                     p1.getBajo().setOpaque(true);
                     p1.getBajo().setBackground(new Color(211,8,8));                    
                 }
                  if(p1.getText_Contraseña().getText().length()>=4 && p1.getText_Contraseña().getText().length()<=7){
                      p1.getMedio().setOpaque(true);
                      p1.getMedio().setBackground(new Color(240,184,26));
                 }
                   if(p1.getText_Contraseña().getText().length()>=8 && p1.getText_Contraseña().getText().length()<=10){
                       p1.getAlto().setOpaque(true);
                        p1.getAlto().setBackground(new Color(0,178,33));
                 }
           }

           @Override
           public void removeUpdate(DocumentEvent e) {
                  if(p1.getText_Contraseña().getText().length()<1 ){
                             p1.getBajo().setBackground(new Color(0,0,0,70));      
                 }
                  if(p1.getText_Contraseña().getText().length()<=4){
                               p1.getMedio().setBackground(new Color(0,0,0,70));    
                 }
                   if(p1.getText_Contraseña().getText().length()<=7){
                       p1.getAlto().setBackground(new Color(0,0,0,70));    
                 }
           }

           @Override
           public void changedUpdate(DocumentEvent e) {
           }
       };
          
          p1.getText_Contraseña().getDocument().addDocumentListener(documento);
          
        p1.getText_Usuario().addKeyListener(c5);
        p1.getText_Contraseña().addKeyListener(c6);
         p1.getContraseñasegundo().addKeyListener(c7);
         
         
        p1.getNombre().addKeyListener(c2);
        p1.getApellido().addKeyListener(c2);
        p1.getCalle_principal().addKeyListener(c3);
        p1.getCalle_secundaria().addKeyListener(c3);
        p1.getTelefono().addKeyListener(c4);
        p1.getCedula().addKeyListener(c1);
    
        p1.getCerrar().addActionListener(l->cerrar());
        p1.getMinimizar().addActionListener(l->minimizar());
        p1.getCerrar_minif().addActionListener(l->cerrarMin());
        
        p1.getRegistrar().addActionListener(l->registro());
        p1.getButton_registro_usuario().addActionListener(l->registrarBD());
        p1.getCancelar().addActionListener(l->cancelar());
        p1.getButton_cancelar_registro_usuario().addActionListener(l->cancelarRegistro());
    }

    
     private void minimizar(){
        p1.setState(JFrame.ICONIFIED);
    }
    
     private void cuestionar(){
         if (JOptionPane.showConfirmDialog(p1, "¿Desea realmente salir del sistema?",
                "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
             Controlador_Principal p=new Controlador_Principal(new Interfaz_principal(),new Modelo_CuentaUsuario());
             p1.dispose();
              p1.getjFrame1().dispose();
         }
           
    }
     
    private void cerrar(){
        if (JOptionPane.showConfirmDialog(p1, "¿Desea cancelar el Registro?",
                "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
             Controlador_Principal p=new Controlador_Principal(new Interfaz_principal(),new Modelo_CuentaUsuario());
             p1.dispose();
              p1.getjFrame1().dispose();
        }
       
    }
    
    private void cerrarMin(){
        p1.getjFrame1().dispose();
    }

    private void cancelar(){
         if (JOptionPane.showConfirmDialog(p1, "¿Desea cancelar el Registro?",
                "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            Controlador_Principal p=new Controlador_Principal(new Interfaz_principal(),new Modelo_CuentaUsuario());
           p1.dispose();
           p1.getjFrame1().dispose();
         }
    }
    
    private void cancelarRegistro(){
        if (JOptionPane.showConfirmDialog(p1, "¿Desea cancelar el Registro?",
                "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            Controlador_Principal p=new Controlador_Principal(new Interfaz_principal(),new Modelo_CuentaUsuario());
            p1.getjFrame1().dispose();
            p1.dispose();
        }
        
    }   
    
    private void registro(){
        
         if(revisarCampos()){

              if(p1.getCedula().getText().length()<10){
                  JOptionPane.showMessageDialog(p1,"Campo Cedúla Icorrecta","CAMPO INCORRECTO",JOptionPane.ERROR_MESSAGE);  
              }else{
                   Modelo_Persona m1=new  Modelo_Persona();
             if(m1.consultarCedula(p1.getCedula().getText())){
                 p1.getjFrame1().setSize(378,328);
                 p1.getjFrame1().setLocationRelativeTo(null);
                 p1.getjFrame1().setVisible(true);
             }else{
                  JOptionPane.showMessageDialog(p1,"Cedúla ya existente","CAMPO INCORRECTO",JOptionPane.ERROR_MESSAGE);
             }
             
              }
         }else{
        JOptionPane.showMessageDialog(p1,"No pueden haber campos vacios","ERROR",JOptionPane.ERROR_MESSAGE);  
      }
    }
    
    private void registrarBD(){
      if(revisarCamposRegistro()){  
          
          if(p1.getContraseñasegundo().getText().length()>8){
            
                    if(p1.getContraseñasegundo().getText().equals(p1.getText_Contraseña().getText())){
                        
                        Modelo_CuentaUsuario mod1=new Modelo_CuentaUsuario();
                        if(mod1.consultarCorreo(p1.getText_Usuario().getText())){
                            
                                         String sexo=null;

      if(p1.getHombre().isSelected()){
          sexo="Hombre";
      }else{
          sexo="Mujer";
      }
        
        Date d1=new Date(p1.getFecha_nacimiento().getDate().getTime());
        Modelo_Adoptante n1=new  Modelo_Adoptante(p1.getNombre().getText(),sexo,
                d1,p1.getCalle_principal().getText(),p1.getCalle_secundaria().getText(),
                Integer.parseInt(p1.getNumero_casa().getValue()+""),p1.getTelefono().getText(),
                Integer.parseInt(p1.getNumero_mascotas().getValue()+""),p1.getCedula().getText(),
                p1.getText_Usuario().getText(),p1.getText_Contraseña().getText(),p1.getApellido().getText(),null);
        
        
            if(n1.registrarPersona() &&  n1.crearAdoptante() &&  n1. crearUsuario()){
                JOptionPane.showMessageDialog(p1.getjFrame1(),"Registro Correcto","Correcto",JOptionPane.INFORMATION_MESSAGE,new ImageIcon(getClass().getResource("/Vista/Recursos/correcto.png")));
               p1.dispose();
               p1.getjFrame1().dispose();
                Controlador_Principal p=new Controlador_Principal(new Interfaz_principal(),new Modelo_CuentaUsuario());
             }else{
             JOptionPane.showMessageDialog(p1.getjFrame1(),"Registro Incorrecto","ERROR",JOptionPane.ERROR_MESSAGE);
             }  
                        }else{
                              JOptionPane.showMessageDialog(p1.getjFrame1(),"El correo ingresado ya esta registrado","DATOS REPETIDOS",JOptionPane.ERROR_MESSAGE);
                        }

        }else{
             JOptionPane.showMessageDialog(p1.getjFrame1(),"Las claves no coinciden","ERROR en claves",JOptionPane.ERROR_MESSAGE); 
        }

          }else{
               JOptionPane.showMessageDialog(p1,"Campo clave incorrecta/nCaracteres minimos:8","Error de Campo",JOptionPane.ERROR_MESSAGE);  
          }
  
      }else{
            JOptionPane.showMessageDialog(p1,"No pueden haber campos vacios","ERROR",JOptionPane.ERROR_MESSAGE);  
      }
    }
    
    public boolean revisarCamposRegistro(){
        if(p1.getContraseñasegundo().getText().isEmpty() || p1.getText_Contraseña().getText().isEmpty() || 
                p1.getText_Usuario().getText().isEmpty()){
            return false;
        }else{
            return true;
        }
    }
    
    public boolean revisarCampos(){
        if(p1.getCedula().getText().isEmpty() || p1.getNombre().getText().isEmpty() || p1.getApellido().getText().isEmpty()
                || p1.getCalle_principal().getText().isEmpty() || p1.getCalle_secundaria().getText().isEmpty()
                || p1.getTelefono().getText().isEmpty() || p1.getFecha_nacimiento().getDate()==null || (!p1.getHombre().isSelected() && !p1.getMujer().isSelected())){
            
            return false;
        }else{
            return true;
        }
    }
    
}
