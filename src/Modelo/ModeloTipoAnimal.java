
package Modelo;


public class ModeloTipoAnimal extends Clase_TipoAnimal{
    private static Conexion_SGBD con=new Conexion_SGBD();

    public ModeloTipoAnimal() {
    }

    public ModeloTipoAnimal(String idtipo, String categoria) {
        super(idtipo, categoria);
    }
    
    public boolean grabar() {
        String sql;
        sql="INSERT INTO tipo_animal (id_tipo,categoria)";
        sql+= "VALUES('"+getIdtipo()+"','"+getCategoria()+"');";
        if(con.noquery(sql)==null){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean editar(){
        String sql="Update tipo_animal SET  categoria='"+getCategoria()+"' where id_tipo="+getIdtipo();
        if (con.noquery(sql)==null) {
               System.err.println("Datos actualizados crud");
            return true;
        } else {
             System.err.println("Datos no actualizados crud");
           return false;
        }
    }
    
    public boolean eliminar(String id){
        String sql="Delete from tipo_mascota where id_tipo = '"+ id +"'";
        if (con.noquery(sql)== null) {
            return true;
        }else{
            return false;
        }
    }
    
}
