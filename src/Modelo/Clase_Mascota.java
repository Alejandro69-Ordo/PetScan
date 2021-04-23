
package Modelo;

import java.awt.Image;
import java.sql.Date;

public class Clase_Mascota extends Clase_TipoAnimal{
   private String idmascota;
    private String descrpcion;
    private boolean estado;
    private float tamano;
    private String genero;
    private boolean esterilizacion;
    private String temperamento; 
    private Image foto;
    private String id_instituto;
    private Date año_nacimiento;

    public Clase_Mascota() {
    }

    public Clase_Mascota(String idmascota, String descrpcion, boolean estado, float tamano, String genero, boolean esterilizacion, String temperamento, String idtipo, String categoria,String id_instituto,Date año_nacimiento) {
        super(idtipo, categoria);
        this.idmascota = idmascota;
        this.descrpcion = descrpcion;
        this.estado = estado;
        this.tamano = tamano;
        this.genero = genero;
        this.esterilizacion = esterilizacion;
        this.temperamento = temperamento;
        this.id_instituto=id_instituto;
        this.año_nacimiento=año_nacimiento;
    }

    public Date getAño_nacimiento() {
        return año_nacimiento;
    }

    public void setAño_nacimiento(Date año_nacimiento) {
        this.año_nacimiento = año_nacimiento;
    }

    public String getId_instituto() {
        return id_instituto;
    }

    public void setId_instituto(String id_instituto) {
        this.id_instituto = id_instituto;
    }

    
    
    public String getIdmascota() {
        return idmascota;
    }

    public void setIdmascota(String idmascota) {
        this.idmascota = idmascota;
    }


    public String getDescrpcion() {
        return descrpcion;
    }

    public void setDescrpcion(String descrpcion) {
        this.descrpcion = descrpcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public float getTamano() {
        return tamano;
    }

    public void setTamano(float tamano) {
        this.tamano = tamano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isEsterilizacion() {
        return esterilizacion;
    }

    public void setEsterilizacion(boolean esterilizacion) {
        this.esterilizacion = esterilizacion;
    }

    public String getTemperamento() {
        return temperamento;
    }

    public void setTemperamento(String temperamento) {
        this.temperamento = temperamento;
    }

    public Image getFoto() {
        return foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }
    
    

}
