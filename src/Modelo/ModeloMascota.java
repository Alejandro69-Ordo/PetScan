
package Modelo;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class ModeloMascota extends Clase_Mascota{
    
  private static Conexion_SGBD con=new Conexion_SGBD();  

    public ModeloMascota() {
    }

    public ModeloMascota(String idmascota, String descrpcion, boolean estado, float tamano, String genero, boolean esterilizacion, String temperamento, String idtipo, String categoria, String id_instituto, Date año_nacimiento) {
        super(idmascota, descrpcion, estado, tamano, genero, esterilizacion, temperamento, idtipo, categoria, id_instituto, año_nacimiento);
    }

    public boolean grabar() {
        String foto64=null;
        byte[] imgb=null;
        //Transformar imgagen a base64 para postgresql
        
        ByteArrayOutputStream bos= new ByteArrayOutputStream();
        
        try{
            BufferedImage img =imgBimage(getFoto());
            ImageIO.write(img, "PNG", bos);
            imgb=bos.toByteArray();
               BASE64Encoder encoder = new BASE64Encoder();
           foto64= encoder.encode(imgb);

        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        String sql;
        sql="INSERT INTO `mascota`(`id_mascota`, `id_tipo_animal`, `id_instituto`, `año_nacimiento`, `descripcion`, `imagen`, `estado_adopcion`, `tamaño`, `genero`, `esterilizacion`, `temperamento`) "
                + "VALUES ('"+this.getIdmascota()+"','"+this.getIdtipo()+"',"+this.getId_instituto()+",'"+this.getAño_nacimiento()+"','"+this.getDescrpcion()+"','"+foto64+"',"+this.isEstado()+","+this.getTamano()+",'"+this.getGenero()+"',"+this.isEsterilizacion()+",'"+this.getTemperamento()+"')";
        if(con.noquery(sql)==null){
            return true;
        }else{
            return false;
        }
    }
    
    public ArrayList<Clase_Mascota> listar(){
        ArrayList<Clase_Mascota> array=new ArrayList<Clase_Mascota>();
        String query="SELECT `id_mascota`, `id_tipo_animal`, `id_instituto`, `año_nacimiento`, `descripcion`, `imagen`, `estado_adopcion`, `tamaño`, `genero`, `esterilizacion`, `temperamento`,tipo_animal.categoria FROM mascota,tipo_animal WHERE MASCOTA.id_tipo_animal=tipo_animal.id_tipo "
                + "AND mascota.estado_adopcion='false'";
         ResultSet rs=con.query(query);
          String bf;
          
           try {
            while(rs.next()){
                Clase_Mascota p1=new Clase_Mascota(rs.getString("id_mascota")
                        ,rs.getString("descripcion")
                        ,rs.getBoolean("estado_adopcion")
                        ,rs.getFloat("tamaño")
                        ,rs.getString("genero")
                        ,rs.getBoolean("esterilizacion")
                        ,rs.getString("temperamento")
                        ,rs.getString("id_tipo_animal")
                        ,rs.getString("categoria"),
                        rs.getString("id_instituto")
                        ,rs.getDate("año_nacimiento"));
                bf=rs.getString("imagen");
                if(bf!=null){
                    try {
                        p1.setFoto(obtenImagen(bf));
                    } catch (IOException ex) {
                        p1.setFoto(null);
                        Logger.getLogger(ModeloMascota.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                 p1.setFoto(null);
                }
                array.add(p1);
            }
            rs.close();
            return array;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloMascota.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(ModeloMascota.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return array;
    }
    
     public boolean eliminar(String id){
        String sql="Delete from mascota where id_mascota = '"+getIdmascota()+"'";
        if (con.noquery(sql)== null) {
            return true;
        }else{
            return false;
        }
    }
    
    
    private BufferedImage imgBimage(Image img){
        
        if (img instanceof BufferedImage){
            return (BufferedImage)img;
        }
        BufferedImage bi = new BufferedImage(
                img.getWidth(null),img.getHeight(null),BufferedImage.TYPE_INT_ARGB
        );
        
        Graphics2D bGR = bi.createGraphics();
        bGR.drawImage(img, 0, 0,null);
        bGR.dispose();
        return bi;        
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
    
    public boolean consultarid(String id){
        String sql="SELECT * FROM `mascota` WHERE mascota.id_mascota='"+id+"'";
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
    
    public boolean actualizarMascota(String id_mascota){
        String sql="UPDATE `mascota`  set `estado_adopcion`=true WHERE mascota.id_mascota='"+id_mascota+"'";
          if(con.noquery(sql)==null){
            return true;
        }else{
            return false;
        }
    }
    
    public static List<Clase_Mascota> listarMascota (String aguja){
    
        try {
            String query="select * from mascota WHERE ";
            query+="UPPER(id_mascota)  LIKE UPPER('%"+aguja+"%') OR ";
            query+="UPPER(id_tipo_animal)  LIKE UPPER('%"+aguja+"%')";
            ResultSet rs=con.query(query);
            List<Clase_Mascota> listaM = new ArrayList<Clase_Mascota>();
            
            while(rs.next()){
                Clase_Mascota mascota=new Clase_Mascota();
                mascota.setIdmascota(rs.getString("id_mascota"));
                mascota.setIdtipo(rs.getString("id_tipo_animal"));
                mascota.setAño_nacimiento(rs.getDate("año_nacimiento"));
                mascota.setDescrpcion(rs.getString("descripcion"));
                mascota.setTamano(rs.getFloat("tamaño"));
                mascota.setGenero(rs.getString("genero"));
                mascota.setTemperamento(rs.getString("temperamento"));
                
                listaM.add(mascota);
            }
            rs.close();
            return listaM;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloMascota.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
