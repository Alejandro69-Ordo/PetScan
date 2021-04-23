
package Modelo;

import java.awt.Image;
import java.sql.Date;


public class Clase_InformeSolicitud {
    
    private String id_mascota;
    private String tipo_mascota;
    private String lugar_adopcion;
    private Date fecha_adopcion;
    private Image foto_mascota;
    private String id_adoptante;

    public Clase_InformeSolicitud(String id_mascota, String tipo_mascota, String lugar_adopcion, Date fecha_adopcion,String id_adoptante) {
        this.id_mascota = id_mascota;
        this.tipo_mascota = tipo_mascota;
        this.lugar_adopcion = lugar_adopcion;
        this.fecha_adopcion = fecha_adopcion;
        this.id_adoptante=id_adoptante;
    }

    public Clase_InformeSolicitud() {}

    public String getId_adoptante() {
        return id_adoptante;
    }

    public void setId_adoptante(String id_adoptante) {
        this.id_adoptante = id_adoptante;
    }
    
    public String getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(String id_mascota) {
        this.id_mascota = id_mascota;
    }

    public String getTipo_mascota() {
        return tipo_mascota;
    }

    public void setTipo_mascota(String tipo_mascota) {
        this.tipo_mascota = tipo_mascota;
    }

    public String getLugar_adopcion() {
        return lugar_adopcion;
    }

    public void setLugar_adopcion(String lugar_adopcion) {
        this.lugar_adopcion = lugar_adopcion;
    }

    public Date getFecha_adopcion() {
        return fecha_adopcion;
    }

    public void setFecha_adopcion(Date fecha_adopcion) {
        this.fecha_adopcion = fecha_adopcion;
    }

    public Image  getFoto_mascota() {
        return foto_mascota;
    }

    public void setFoto_mascota(Image  foto_mascota) {
        this.foto_mascota = foto_mascota;
    }
    
    
}
