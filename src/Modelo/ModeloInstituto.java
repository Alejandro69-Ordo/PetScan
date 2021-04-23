
package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ModeloInstituto extends Clase_Instituto{
    
    private static Conexion_SGBD con=new Conexion_SGBD();

    public ModeloInstituto() {
    }

    public ModeloInstituto(int idinstituto, String nombreInstituto, String calleprincipal, String callesecundaria) {
        super(idinstituto, nombreInstituto, calleprincipal, callesecundaria);
    }

    public ArrayList<String> listar(){
        ArrayList<String> l1=new ArrayList<String>();
        
      String sql="SELECT * FROM instituto";
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
    
    
    public String devolverIdInsituto(String nombre){
        String id=null;
        String sql="SELECT * FROM instituto WHERE nombre='"+nombre+"'";
       ResultSet rs=con.query(sql);
        try {
            while(rs.next()){
                 id=rs.getString("id_insituto");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloInstituto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    
     public boolean grabar() {
        String sql;
        sql="INSERT INTO `instituto`(`id_insituto`, `id_administrador`, `nombre`, `calle_principal`, `calle_secundaria`)";
        sql+= "VALUES('"+getIdinstituto()+"','"+devolverIdInst()+"','"+getNombreInstituto()+"','"+getCalleprincipal()+"','"+getCallesecundaria()+"');";
        if(con.noquery(sql)==null){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean editar(){
        String sql="Update instituto SET  nombre='"+getNombreInstituto()+"', calle_principal='"+getCalleprincipal()+"', calle_secundaria='"+getCallesecundaria()+"' where id_insituto="+getIdinstituto();
        if (con.noquery(sql)==null) {
               System.err.println("Datos actualizados crud");
            return true;
        } else {
             System.err.println("Datos no actualizados crud");
           return false;
        }
    }
    
    public boolean eliminar(String id){
        String sql="Delete from instituto where instituto = '"+ id +"'";
        if (con.noquery(sql)== null) {
            return true;
        }else{
            return false;
        }
    }
    
    public boolean consultaridInst(String id){
        String sql="SELECT * FROM `instituto` WHERE instituto.id_insituto='"+id+"'";
        ResultSet l1=con.query(sql);
        
        try {
            if(l1.next()){
                return false;
            }else{
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloInstituto.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    public String devolverIdInst(){
        
         String id="AD-01";
        
        return id;
    }
    
    
    
    
}
