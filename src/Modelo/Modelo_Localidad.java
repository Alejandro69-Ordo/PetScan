
package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Modelo_Localidad extends Clase_Localidad{
    
    Conexion_SGBD con1=new Conexion_SGBD(); 

    public Modelo_Localidad(String id_localidad, String provincia, String ciudad) {
        super(id_localidad, provincia, ciudad);
    }

    public Modelo_Localidad() {
    }
    
    public ArrayList<String> devolverCiudades(String provincia){
        ArrayList<String> ciudades=new ArrayList<String>();
        String sql="SELECT localidad.ciudad FROM localidad WHERE localidad.provincia='"+provincia+"'";
         ResultSet r1=con1.query(sql);
        try {
            while(r1.next()){
                ciudades.add(r1.getString("ciudad"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Localidad.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ciudades;
    }
    
    public String id_localidad(String provincia,String ciudad){
     String id=null;
     String sql="SELECT localidad.id_localidad FROM localidad WHERE localidad.provincia='"+provincia+"' AND localidad.ciudad='"+ciudad
             +"'";
      ResultSet r1=con1.query(sql);
      try {
            while(r1.next()){
                id=(r1.getString("id_localidad"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Localidad.class.getName()).log(Level.SEVERE, null, ex);
        }
      return id;
    }
    
}
