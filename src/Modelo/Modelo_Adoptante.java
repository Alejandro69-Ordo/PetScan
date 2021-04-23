
package Modelo;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Modelo_Adoptante extends Clase_Adoptante{
    
    private Conexion_SGBD conexion=new  Conexion_SGBD();

    public Modelo_Adoptante(String nombre, String genero, Date fecha_nacmiento, String calle_principal, String calle_secundaria, int numero_casa, String telefono, int numero_mascotas, String cedula, String cuenta, String contraseña, String apellido, byte[] foto) {
        super(nombre, genero, fecha_nacmiento, calle_principal, calle_secundaria, numero_casa, telefono, numero_mascotas, cedula, cuenta, contraseña, apellido, foto);
    }

    public Modelo_Adoptante() {
    }

    public boolean registrarPersona(){
        String sql="INSERT INTO `persona`(`cedula`, `nombre`, `apellido`, `genero`, `fecha_nacimiento`) VALUES ('"+this.getCedula()+"','"+this.getNombre()+"','"+getApellido()+"','"+this.getGenero()+"','"+this.getFecha_nacmiento()+"')";
         if(conexion.noquery(sql)==null){
            return  true;
        }else{
            return false;
        }
    }
    
    public boolean crearAdoptante(){
        String sql="INSERT INTO `adoptante`(`id_adoptante`, `cedula`, `calle_principal`, `calle_secundaria`, `numero_casa`, `telefono`, `numero_mascotas`) "
                + "VALUES ('AD-"+this.getCedula()+"','"+this.getCedula()+"','"+this.getCalle_principal()+"','"+this.getCalle_secundaria()+"',"+this.getNumero_casa()+",'"+this.getTelefono()+"',"+this.getNumero_mascotas()+")";
       if(conexion.noquery(sql)==null){
            return  true;
        }else{
            return false;
        }
    }
    
    public int id_cuenta(){
        int mayor=0;
        String sql="SELECT MAX(id_usuario) FROM usuario";
        ResultSet rs=conexion.query(sql);
        
        try {
            if(!rs.next()){
                mayor=1;
            }else{
                try {
                    rs.beforeFirst();
                    while(rs.next()){
                        mayor=rs.getInt("MAX(id_usuario)");
                        break;
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Modelo_Adoptante.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Adoptante.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mayor+1; 
    }
    
    public boolean crearUsuario(){
         String sql="INSERT INTO `usuario`(`id_usuario`, `cedula_persona`, `usuario`, `contraseña`, `foto`) VALUES ("+id_cuenta()+",'"+this.getCedula()+"','"+this.getCuenta()+"','"+this.getContraseña()+"',"+this.getFoto()+")";
         if(conexion.noquery(sql)==null){
            return  true;
        }else{
            return false;
        }
    }
     
    public String id_adoptante(String cedula){
        String id=null;
        String sql="SELECT adoptante.id_adoptante FROM adoptante WHERE adoptante.cedula='"+cedula+"'";
        ResultSet r1=conexion.query(sql);
        try {
            while(r1.next()){
               id=r1.getString("id_adoptante");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Adoptante.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    
}
