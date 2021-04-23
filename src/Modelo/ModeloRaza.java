
package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ModeloRaza extends Clase_Raza{
    
    private static Conexion_SGBD con=new Conexion_SGBD();

    public ModeloRaza() {
    }

    public ModeloRaza(String idraza, String nombreraza, int anospromedio, String idtipo, String categoria) {
        super(idraza, nombreraza, anospromedio, idtipo, categoria);
    }
    
    public boolean grabar() {
        String sql;
        sql="INSERT INTO `raza`(`id_raza`, `id_tipo_animal`, `nombre`, `anos_promedio`) "
        + "VALUES ('"+this.getIdraza()+"','"+this.getIdtipo()+"','"+this.getNombreraza()+"','"+this.getAnospromedio()+"')";
        if(con.noquery(sql)==null){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean editar(){
        String sql="Update raza SET  nombre='"+getNombreraza()+"', anos_promedio='"+getAnospromedio()+"' where id_raza="+getIdraza();
        if (con.noquery(sql)==null) {
               System.err.println("Datos actualizados crud");
            return true;
        } else {
             System.err.println("Datos no actualizados crud");
           return false;
        }
    }
    
    public ArrayList<String> listar(String nombre){
        ArrayList<String> l1=new ArrayList<String>();
        
      String sql="SELECT raza.nombre FROM raza,tipo_animal where raza.id_tipo_animal=tipo_animal.id_tipo AND upper(tipo_animal.categoria)='"+nombre+"'";
       ResultSet rs=con.query(sql);
        try {
            while(rs.next()){
                 l1.add(rs.getString("nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloInstituto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return l1;
    }
    
    public boolean eliminar(String id){
        String sql="Delete from raza where id_raza = '"+ id +"'";
        if (con.noquery(sql)== null) {
            return true;
        }else{
            return false;
        }
    }
    
    public boolean consultaridRaza(String id){
        String sql="SELECT * FROM `raza` WHERE raza.id_raza='"+id+"'";
        ResultSet l1=con.query(sql);
        
        try {
            if(l1.next()){
                return false;
            }else{
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloRaza.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    
}
