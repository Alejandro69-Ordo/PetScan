
package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Modelo_CuentaUsuario  extends Clase_CuentaUsuario{
    
    private static Conexion_SGBD con=new Conexion_SGBD();

    public Modelo_CuentaUsuario() {
    }
    

    public Modelo_CuentaUsuario(String cedula, String cuenta, String contraseña) {
        super(cedula, cuenta, contraseña);
    }
    
    public boolean obtenerDatos(){
        boolean bandera=false;
        try {
            String sql="SELECT usuario,contraseña FROM usuario WHERE usuario='"+this.getCuenta()+"' AND contraseña='"+this.getContraseña()+"'";
            ResultSet l1=con.query(sql);
            while(l1.next()){
                bandera=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_CuentaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
       return bandera;
    }

    public String devolverCedula(){
        String cedula=null;
        String sql="SELECT cedula_persona FROM usuario WHERE usuario.usuario='"+this.getCuenta()+"' AND usuario.contraseña='"+this.getContraseña()+"'";
         ResultSet l1=con.query(sql);
        try {
            while(l1.next()){
                cedula=l1.getString("cedula_persona");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_CuentaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cedula;
    }
    
    public String obtenerTipo(){
        String nombre=null;
        String sql=null;
        ResultSet l1=null;
        
        int i=0;
        
        sql="SELECT id_adoptante FROM adoptante WHERE adoptante.cedula='"+this.getCedula()+"'";
       l1=con.query(sql);
        try {
            while(l1.next()){
                i=1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_CuentaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(i==0){
            return "Administrador";
        }else{
            return "Adoptante";
        }
    }
    
    public boolean consultarCorreo(String correo){
        String sql="SELECT * FROM `usuario` WHERE usuario.usuario='"+correo+"'";
          ResultSet l1=con.query(sql);
          
        try {
            if(l1.next()){
                return false;
            }else{
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_CuentaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
            
        }
    }
    
    public Modelo_CuentaUsuario devolverModelo(){
        String sql="SELECT `id_usuario`, `cedula_persona`, `usuario`, `contraseña`, `foto` FROM `usuario` WHERE cedula_persona='"+this.getCedula()+"'";
        ResultSet l1=con.query(sql);
        Modelo_CuentaUsuario m1 = null;
        try {
            if(l1.next()){
                m1=new Modelo_CuentaUsuario(l1.getString("cedula_persona"),l1.getString("usuario"),l1.getString("contraseña"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_CuentaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return m1;
    }
    
    public boolean actualizarDatos(){
        String sql="UPDATE `usuario` SET `usuario`='"+this.getCuenta()+"',`contraseña`='"+this.getContraseña()+"' WHERE usuario.cedula_persona='"+this.getCedula()+"'";
        if(con.noquery(sql)==null){
            return  true;
        }else{
            return false;
        }
    }

}
