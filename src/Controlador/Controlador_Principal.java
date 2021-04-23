
package Controlador;

import AppPackage.AnimationClass;
import Modelo.Clase_Persona;
import Modelo.ModeloInstituto;
import Modelo.ModeloMascota;
import Modelo.ModeloRaza;
import Modelo.Modelo_CuentaUsuario;
import Modelo.Modelo_Persona;
import Modelo.Modelo_Adoptante;
import Vista.Administrador;
import Vista.Cuenta_Adoptante;
import Vista.Interfaz_principal;
import Vista.Registro_Adoptante;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.input.KeyCode;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Controlador_Principal {
     
    Interfaz_principal p1;
    Modelo_CuentaUsuario p2;
     private int x;
     private int y;
    
    public Controlador_Principal(Interfaz_principal p1,Modelo_CuentaUsuario p2) {
        this.p1 = p1;
        this.p2=p2;
        inicialControl();
    }

    public void inicialControl(){
        
        KeyAdapter c1=new KeyAdapter() {
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
        
        KeyAdapter c2=new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
               char c=e.getKeyChar();
               if(Character.isDigit(c) || Character.isLetter(c) || c=='\b'  ||  c=='_' ||  c=='-' 
                       || Character.isSpaceChar(c) ){}else{
                   e.consume();
                   Toolkit.getDefaultToolkit().beep();
               }
            }
        };        
        
        MouseAdapter l2=new MouseAdapter(){
            @Override
            public void mouseDragged(MouseEvent e) {
                  Point point = MouseInfo.getPointerInfo().getLocation();
                p1.setLocation(point.x -x, point.y-y );
            }

            @Override
            public void mousePressed(MouseEvent e) {
                  x = e.getX();
                y = e.getY();
            }

        };

       WindowAdapter l1=new WindowAdapter() {
           @Override
           public void windowOpened(WindowEvent e) {
               establecerTamañoImagen(e);
              
           }
       };
       
       p1.getjLabel4().addMouseMotionListener(l2);
       p1.getTextcorreo().addKeyListener(c1);
       p1.getTextcntra().addKeyListener(c2);
       p1.getBotoncerrar().addActionListener(l->cerrar());
       p1.getBotonminimizar().addActionListener(l->minimizar());
       p1.addWindowListener(l1);
       p1.getBotonabajo().addActionListener(l->abajo());
       p1.getBotonarriba().addActionListener(l->arriba());
       p1.getBotonregistrar().addActionListener(l->abrirRegistro());
       p1.getBotoniniciar().addActionListener(l->iniciarSecion());
        //___________________________________
       p1.setLocationRelativeTo(null);
         this.p1.setVisible(true);
    }
   
    
    private boolean verificarCampos(){
        if(p1.getTextcorreo().getText().isEmpty() || p1.getTextcntra().getText().isEmpty()){
            JOptionPane.showMessageDialog(p1,"Porfavor, no dejar campos vacíos","Login",JOptionPane.ERROR_MESSAGE);
            return false;
        }else{
             return true;
        }
    }

    private void iniciarSecion(){
        Modelo_CuentaUsuario pr=new Modelo_CuentaUsuario("",p1.getTextcorreo().getText(),p1.getTextcntra().getText());
        pr.devolverCedula();
        if(verificarCampos()){
        if(pr.obtenerDatos()){
            if(consultarTipo(pr.devolverCedula()).equals("Adoptante")){
                  Clase_Persona clase1=new Modelo_Persona().obtenerDatos(pr.devolverCedula());
                  new Controlador_Cuenta_Adoptante(new ModeloMascota(),new Cuenta_Adoptante(),new Modelo_Persona(clase1.getCedula(),clase1.getNombre(),clase1.getApellido(),clase1.getGenero(),clase1.getFecha_nacimiento()));
                  p1.dispose();
            }else{
                new Controlador_Administrador(new Modelo_Adoptante(),new ModeloInstituto(),new Administrador(),new ModeloRaza());
                p1.dispose();
            //ADMINISTRADOR
            } 
        }else{
            JOptionPane.showMessageDialog(p1,"Datos Erroneos","Error",JOptionPane.ERROR_MESSAGE);
            p1.getTextcorreo().setText("");
            p1.getTextcntra().setText("");
        }
        }
    }
    
    public String consultarTipo(String cedula){
          Modelo_CuentaUsuario pr=new Modelo_CuentaUsuario(cedula,p1.getTextcorreo().getText(),p1.getTextcntra().getText());
          return pr.obtenerTipo();
    }
    
    private void minimizar(){
        p1.setState(JFrame.ICONIFIED);
    }
    
    private void cerrar(){
        p1.dispose();
    }
    
    private void abrirRegistro(){
        Controlador_registro c1=new Controlador_registro(new Registro_Adoptante(),new Modelo_Adoptante());
         p1.dispose();
    }
    
    private void arriba(){
        if(p1.getFoto1().getLocation().y==0 && p1.getFoto3().getLocation().y==1000){
              AnimationClass ac=new AnimationClass();
        ac.jLabelYUp(0,-1000, 15, 5, p1.getFoto1());
         AnimationClass ac2=new AnimationClass();
        ac.jLabelYUp(1000,0, 15, 5, p1.getFoto3());
        }else{
            Toolkit.getDefaultToolkit().beep();
        }
      
    }
    
    private void abajo(){
      if(p1.getFoto1().getLocation().y==-1000 && p1.getFoto3().getLocation().y==0){
       AnimationClass ac2=new AnimationClass();
      ac2.jLabelYDown(0,1000, 15, 5, p1.getFoto3());
       AnimationClass ac=new AnimationClass();
      ac.jLabelYDown(-1000,0, 15, 5, p1.getFoto1());
      }else{
             Toolkit.getDefaultToolkit().beep();
       }
    }
    
    
    private void establecerTamañoImagen(WindowEvent evt){
         p1.getFoto1().setLocation(50,1000);
        p1.getFoto3().setLocation(50,0);
        AnimationClass ac2=new AnimationClass();
        ac2.jLabelYDown(0,1000, 25,5, p1.getFoto3());
        AnimationClass ac=new AnimationClass();
        ac.jLabelYUp(1000,0,15,5, p1.getFoto1());
    }
}
