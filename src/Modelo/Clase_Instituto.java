
package Modelo;


public class Clase_Instituto {
    
    private int idinstituto;
    private String nombreInstituto;
    private String calleprincipal;
    private String callesecundaria;

    public Clase_Instituto() {
    }

    public Clase_Instituto(int idinstituto, String nombreInstituto, String calleprincipal, String callesecundaria) {
        this.idinstituto = idinstituto;
        this.nombreInstituto = nombreInstituto;
        this.calleprincipal = calleprincipal;
        this.callesecundaria = callesecundaria;
    }
    

    public int getIdinstituto() {
        return idinstituto;
    }

    public void setIdinstituto(int idinstituto) {
        this.idinstituto = idinstituto;
    }

    public String getNombreInstituto() {
        return nombreInstituto;
    }

    public void setNombreInstituto(String nombreInstituto) {
        this.nombreInstituto = nombreInstituto;
    }

    public String getCalleprincipal() {
        return calleprincipal;
    }

    public void setCalleprincipal(String calleprincipal) {
        this.calleprincipal = calleprincipal;
    }

    public String getCallesecundaria() {
        return callesecundaria;
    }

    public void setCallesecundaria(String callesecundaria) {
        this.callesecundaria = callesecundaria;
    }
    
    
    
    
    
}
