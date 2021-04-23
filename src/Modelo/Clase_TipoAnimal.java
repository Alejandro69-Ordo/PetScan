
package Modelo;

public class Clase_TipoAnimal {
    private String idtipo;
    private String categoria;

    public Clase_TipoAnimal() {
    }

    public Clase_TipoAnimal(String idtipo, String categoria) {
        this.idtipo = idtipo;
        this.categoria = categoria;
    }
    

    public String getIdtipo() {
        return idtipo;
    }

    public void setIdtipo(String idtipo) {
        this.idtipo = idtipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    
}
