
package Modelo;

public class Clase_Raza extends Clase_TipoAnimal{
    
    private String idraza;
    private String nombreraza;
    private int anospromedio;

    public Clase_Raza() {
    }

    public Clase_Raza(String idraza, String nombreraza, int anospromedio, String idtipo, String categoria) {
        super(idtipo, categoria);
        this.idraza = idraza;
        this.nombreraza = nombreraza;
        this.anospromedio = anospromedio;
    }

    public String getIdraza() {
        return idraza;
    }

    public void setIdraza(String idraza) {
        this.idraza = idraza;
    }

    public String getNombreraza() {
        return nombreraza;
    }

    public void setNombreraza(String nombreraza) {
        this.nombreraza = nombreraza;
    }

    public int getAnospromedio() {
        return anospromedio;
    }

    public void setAnospromedio(int anospromedio) {
        this.anospromedio = anospromedio;
    }
    
    
    
    
}
