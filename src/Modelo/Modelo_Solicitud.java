package Modelo;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Modelo_Solicitud extends Clase_Solicitud{
    
    Conexion_SGBD c1=new Conexion_SGBD() ;

    public Modelo_Solicitud(int id_adopcion, String id_mascota, String id_adoptante, String id_localidad, Date fecha_adopcion, String tipo_vivienda) {
        super(id_adopcion, id_mascota, id_adoptante, id_localidad, fecha_adopcion, tipo_vivienda);
    }

    
    public Modelo_Solicitud() {
    }
    
    public boolean registrarSolicitud(){
        String sql="INSERT INTO `adopcion`(`id_adopcion`, `id_mascota`, `id_adoptante`, `id_localidad`, `fecha_adopcion`, `tipo_vivienda`) "
                + "VALUES ("+id_solicitud()+",'"+this.getId_mascota()+"','"+this.getId_adoptante()+"','"+this.getId_localidad()+"','"+this.getFecha_adopcion()+"','"+this.getTipo_vivienda()+"')";
        if(c1.noquery(sql)==null){
            return  true;
        }else{
            return false;
        }
    }
    
        public int id_solicitud(){
        int mayor=0;
        String sql="SELECT MAX(adopcion.id_adopcion) from adopcion";
        ResultSet rs=c1.query(sql);
        
        try {
            if(!rs.next()){
                return mayor=0;
            }else{
                try {
                    rs.beforeFirst();
                    while(rs.next()){
                        mayor=rs.getInt("MAX(adopcion.id_adopcion)");
                        break;
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Modelo_Adoptante.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Solicitud.class.getName()).log(Level.SEVERE, null, ex);
        }
            return mayor+1;
    }

}
