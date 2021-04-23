package Modelo;

import static Modelo.ModeloMascota.obtenImagen;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import sun.misc.BASE64Decoder;

public class Modelo_InformeSolicitud extends Clase_InformeSolicitud{
    
     Conexion_SGBD c1=new Conexion_SGBD() ;

    public Modelo_InformeSolicitud() {
    }

    public Modelo_InformeSolicitud(String id_mascota, String tipo_mascota, String lugar_adopcion, Date fecha_adopcion, String id_adoptante) {
        super(id_mascota, tipo_mascota, lugar_adopcion, fecha_adopcion, id_adoptante);
    }
    
    public List<Clase_InformeSolicitud> listar(String aguja){
        List<Clase_InformeSolicitud> array=new ArrayList<Clase_InformeSolicitud>();
        
        String query="SELECT adopcion.id_mascota,adopcion.id_adoptante,adopcion.fecha_adopcion,"
                + "concat_ws(',', localidad.provincia, localidad.ciudad),tipo_animal.categoria,mascota.imagen "
                + "FROM adopcion INNER JOIN localidad ON localidad.id_localidad=adopcion.id_localidad "
                + "INNER JOIN mascota ON mascota.id_mascota=adopcion.id_mascota INNER JOIN tipo_animal "
                + "ON tipo_animal.id_tipo=mascota.id_tipo_animal "
                + "where adopcion.id_adoptante='"+this.getId_adoptante()+"' "
                + "OR UPPER(adopcion.id_mascota) LIKE UPPER('%"+aguja+"%')"
                + "OR UPPER(tipo_animal.categoria) LIKE UPPER('%"+aguja+"%')";
         String bf;
        ResultSet rs=c1.query(query);
        
         try {
             while(rs.next()){
                 Clase_InformeSolicitud clase=new Clase_InformeSolicitud(rs.getString("adopcion.id_mascota"),rs.getString("tipo_animal.categoria"),rs.getString("concat_ws(',', localidad.provincia, localidad.ciudad)"),rs.getDate("adopcion.fecha_adopcion"),rs.getString("adopcion.id_adoptante"));
                  bf=rs.getString("imagen");
                  
                  if(bf!=null){
                    try {
                        clase.setFoto_mascota(obtenImagen(bf));
                    } catch (IOException ex) {
                        clase.setFoto_mascota(null);
                        Logger.getLogger(ModeloMascota.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                 clase.setFoto_mascota(null);
                }
                array.add(clase);
                  
             }
         } catch (SQLException ex) {
             Logger.getLogger(Modelo_InformeSolicitud.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        return array;
    }
    
    public static Image obtenImagen(String imagen)throws IOException{
      BufferedImage image = null;
        byte[] imageByte;
        try {
            BASE64Decoder decoder = new BASE64Decoder();
            imageByte = decoder.decodeBuffer(imagen);
            ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
            image = ImageIO.read(bis);
            bis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return image;
    }
    
}
