package Controlador;

import Modelo.Modelo_CuentaUsuario;
import Modelo.Modelo_Persona;
import Vista.Actualizacion_Datos;
import Vista.Cuenta_Adoptante;
import Vista.Interfaz_principal;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Controlador_ActualizacionDatos {
    
    private Actualizacion_Datos vista;
    private Modelo_Persona persona;
    private Controlador_Cuenta_Adoptante d1;
    private Modelo_CuentaUsuario modelo;

    public Controlador_ActualizacionDatos(Actualizacion_Datos vista, Modelo_Persona persona,Controlador_Cuenta_Adoptante d1) {
        this.vista = vista;
        this.persona = persona;
        this.d1=d1;
        iniciaControl();
    }
     
    public void iniciaControl(){
        
        KeyAdapter c2=new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
               char c=e.getKeyChar();
               if(Character.isLetter(c) || c=='\b' ){}else{
                    e.consume();
                   Toolkit.getDefaultToolkit().beep();
               }
               
                if(vista.getNombre().getText().length()>49 ){
                   Toolkit.getDefaultToolkit().beep();
                   e.consume();
               }
                if(vista.getApellido().getText().length()>49){
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
               
               if( vista.getE_contraseña().getText().length()>9 ){
                    e.consume();
                   Toolkit.getDefaultToolkit().beep();
               }
               
               if( vista.getE_repetircontraseña().getText().length()>9 ){
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
         
               if( vista.getE_repetircontraseña().getText().length()>9 ){
                    e.consume();
                   Toolkit.getDefaultToolkit().beep();
               }
            }
        };  
        
       vista.getNombre().addKeyListener(c2);
       vista.getApellido().addKeyListener(c2);
       vista.getE_contraseña().addKeyListener(c6);
       vista.getE_repetircontraseña().addKeyListener(c7);

       vista.getCedula().setText(persona.getCedula());
       vista.getNombre().setText(persona.getNombre());
       vista.getApellido().setText(persona.getApellido());
       vista.getFecha_nacimiento().setDate(persona.getFecha_nacimiento());
       
       vista.getActualizar_datos().addActionListener(l->actualizarDatos());
       
       modelo=new Modelo_CuentaUsuario(persona.getCedula(),"","").devolverModelo();
       vista.getUsuario().setText(modelo.getCuenta());
       
       vista.getCerrar().addActionListener(l->cerrar());
       vista.getCerrar_actualizacion().addActionListener(l->cerrarActualizacion());
       
       vista.getAbrir_editar_cuenta().addActionListener(l->abrirEdicionCuenta());
       
       
             DocumentListener documento=new DocumentListener() {
           @Override
           public void insertUpdate(DocumentEvent e) {
                 if(vista.getE_contraseña().getText().length()>=1 && vista.getE_contraseña().getText().length()<=3){
                     vista.getBajo().setOpaque(true);
                     vista.getBajo().setBackground(new Color(211,8,8));                    
                 }
                  if(vista.getE_contraseña().getText().length()>=4 && vista.getE_contraseña().getText().length()<=7){
                      vista.getMedio().setOpaque(true);
                      vista.getMedio().setBackground(new Color(240,184,26));
                 }
                   if(vista.getE_contraseña().getText().length()>=8 && vista.getE_contraseña().getText().length()<=10){
                       vista.getAlto().setOpaque(true);
                        vista.getAlto().setBackground(new Color(0,178,33));
                 }
           }

           @Override
           public void removeUpdate(DocumentEvent e) {
                  if(vista.getE_contraseña().getText().length()<1 ){
                             vista.getBajo().setBackground(new Color(0,0,0));      
                 }
                  if(vista.getE_contraseña().getText().length()<=4){
                               vista.getMedio().setBackground(new Color(0,0,0));    
                 }
                   if(vista.getE_contraseña().getText().length()<=7){
                       vista.getAlto().setBackground(new Color(0,0,0));    
                 }
           }

           @Override
           public void changedUpdate(DocumentEvent e) {
           }
       };
             
       vista.getCancelar().addActionListener(l->cerrarActualizacion());
       vista.getGuardar_editar_cuenta().addActionListener(l->actualizarDatosUsuario());
             
       vista.getE_contraseña().getDocument().addDocumentListener(documento);
       vista.setLocationRelativeTo(null);
       vista.setVisible(true);
 
    }
    
    public void cerrar(){
        vista.dispose();
    }
    
    public void cerrarActualizacion(){
        vista.getjFrame1().dispose();
    } 
    
    public boolean verficarCamposActualzizacionDatos(){
        if(vista.getNombre().getText().isEmpty() || vista.getApellido().getText().isEmpty()){
            return false;
        }else{
            return true;        
        }
    }
    
    public boolean verficarCamposActualzizacionUsuario(){
        if(vista.getE_usuario().getText().isEmpty() || vista.getE_contraseña().getText().isEmpty() || vista.getE_contraseña().getText().isEmpty()){
            return false;
        }else{
            return true;        
        }
    }
    
    
    private void abrirEdicionCuenta(){
        vista.getE_usuario().setText(modelo.getCuenta());
        vista.dispose();
         vista.getjFrame1().setSize(313,231);
        vista.getjFrame1().setLocationRelativeTo(null);
        vista.getjFrame1().setVisible(true);
    }
    
    private void actualizarDatos(){
        if(verficarCamposActualzizacionDatos()){
            Date d1=new Date(vista.getFecha_nacimiento().getDate().getTime());
            if(new Modelo_Persona(persona.getCedula(),vista.getNombre().getText(),vista.getApellido().getText(),persona.getGenero(),d1).actualizar()){
                JOptionPane.showMessageDialog(vista,"Actualizacion Correcta\nPorfavor Inicie Secion nuevamente","Correcto",JOptionPane.INFORMATION_MESSAGE,new ImageIcon(getClass().getResource("/Vista/Recursos/correcto.png")));
                vista.dispose();
                this.d1.getAdoptant().dispose();
                this.d1.getHilo().stop();
                      new Controlador_Principal(new Interfaz_principal(),new Modelo_CuentaUsuario());
            }else{
                 JOptionPane.showMessageDialog(vista,"Actualizacion Incorrecta","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }else{
             JOptionPane.showMessageDialog(vista,"No pueden haber campos vacios","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void actualizarDatosUsuario(){
        if(verficarCamposActualzizacionUsuario()){
            
            if(vista.getE_contraseña().getText().equals(vista.getE_contraseña().getText())){
                
                Modelo_CuentaUsuario m1=new Modelo_CuentaUsuario(persona.getCedula(),vista.getE_usuario().getText(),vista.getE_contraseña().getText());
                 if(m1.actualizarDatos()){
                      JOptionPane.showMessageDialog(vista.getjFrame1(),"Actualizacion Correcta\nPorfavor Inicie Secion nuevamente","Correcto",JOptionPane.INFORMATION_MESSAGE,new ImageIcon(getClass().getResource("/Vista/Recursos/correcto.png")));
                      vista.getjFrame1().dispose();
                      this.d1.getAdoptant().dispose();
                this.d1.getHilo().stop();
                       new Controlador_Principal(new Interfaz_principal(),new Modelo_CuentaUsuario());
                 }else{
             JOptionPane.showMessageDialog(vista.getjFrame1(),"Actualizacion Incorrecta","ERROR",JOptionPane.ERROR_MESSAGE);
        
                 }
  
            }else{
                 JOptionPane.showMessageDialog(vista.getjFrame1(),"Las contraseñas no coinciden","ERROR",JOptionPane.ERROR_MESSAGE);
            }

        }else{
             JOptionPane.showMessageDialog(vista.getjFrame1(),"No pueden haber campos vacios","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
