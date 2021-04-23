
package Modelo;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Modelo_Persona extends Clase_Persona{
    
    static Conexion_SGBD conex1=new Conexion_SGBD();

    public Modelo_Persona(String cedula, String nombre, String apellido, String genero, Date fecha_nacimiento) {
        super(cedula, nombre, apellido, genero, fecha_nacimiento);
    }

    public Modelo_Persona() {
    }
    
    public  Clase_Persona obtenerDatos(String cedula){
        String sql="SELECT * FROM persona WHERE cedula='"+cedula+"'";
        ResultSet r1=conex1.query(sql);
        
        Clase_Persona pr1=null;
        try {
            while(r1.next()){
                pr1=new Clase_Persona(r1.getString("cedula"),r1.getString("nombre"),r1.getString("apellido"),r1.getString("genero"),r1.getDate("fecha_nacimiento"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Persona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pr1;
    }
    
    public boolean consultarCedula(String cedula){
         String sql="SELECT * FROM persona WHERE cedula='"+cedula+"'";
        ResultSet r1=conex1.query(sql);
        
        try {
            if(r1.next()){
                return false;
            }else{
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Persona.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean actualizar(){
          String sql="UPDATE `persona` SET `nombre`='"+this.getNombre()+"',`apellido`='"+this.getApellido()+"',`genero`='"+this.getGenero()+"',"
                  + "`fecha_nacimiento`='"+this.getFecha_nacimiento()+"' WHERE persona.cedula='"+this.getCedula()+"'";
        if(conex1.noquery(sql)==null){
            return  true;
        }else{
            return false;
        }
     }
    
    public static List<Clase_Persona> listarP (String aguja){
    
        try {
            String query="select * from persona WHERE ";
            query+="UPPER(cedula)  LIKE UPPER('%"+aguja+"%') OR ";
            query+="UPPER(nombre)  LIKE UPPER('%"+aguja+"%') OR ";
            query+="UPPER(apellido)  LIKE UPPER('%"+aguja+"%')";
            ResultSet rs=conex1.query(query);
            List<Clase_Persona> listaPer = new ArrayList<Clase_Persona>();
            
            while(rs.next()){
                Clase_Persona per=new Clase_Persona();
                per.setCedula(rs.getString("cedula"));
                per.setNombre(rs.getString("nombre"));
                per.setApellido(rs.getString("apellido"));
                per.setGenero(rs.getString("genero"));
                listaPer.add(per);
            }
            rs.close();
            return listaPer;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Persona.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
