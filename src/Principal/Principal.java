package Principal;

import Controlador.Controlador_Cuenta_Adoptante;
import Controlador.x;
import Controlador.Controlador_Principal;
import Modelo.Conexion_SGBD;
import Modelo.ModeloMascota;
import Modelo.Modelo_CuentaUsuario;
import Vista.Cuenta_Adoptante;
import Vista.Interfaz_principal;
import Vista.xi;
import java.util.ArrayList;

public class Principal {
     
    public static void main(String args[]){
          try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Controlador_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Controlador_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Controlador_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Controlador_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
Controlador_Principal control1=new Controlador_Principal(new Interfaz_principal(),new Modelo_CuentaUsuario()); 

    }
    
}
