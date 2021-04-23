package Modelo;

public class Clase_Localidad {
    
    private String id_localidad;
    private String provincia;
    private String ciudad;

    public Clase_Localidad(String id_localidad, String provincia, String ciudad) {
        this.id_localidad = id_localidad;
        this.provincia = provincia;
        this.ciudad = ciudad;
    }

    public Clase_Localidad() {
    }
    
    

    public String getId_localidad() {
        return id_localidad;
    }

    public void setId_localidad(String id_localidad) {
        this.id_localidad = id_localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    
    
}
