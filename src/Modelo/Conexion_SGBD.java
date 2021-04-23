package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion_SGBD {
    
    private Connection conexion;

    public Conexion_SGBD() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion_SGBD.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        try {
            conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pet-scan","root","");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion_SGBD.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
    public ResultSet query(String sql){
        Statement mistatment=null;
        try {
            mistatment=conexion.createStatement();
            return mistatment.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion_SGBD.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
      }
    
    public Exception noquery(String sql){
          Statement mistatment=null;
        try {
            mistatment=conexion.createStatement();
             mistatment.execute(sql);
              return null;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion_SGBD.class.getName()).log(Level.SEVERE, null, ex);
            return ex;
        }  
    }
    
    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
}
