package Modelo;

import java.sql.Date;

public class Clase_Adoptante extends Clase_CuentaUsuario{
    
    private String nombre;
    private String apellido;
    private String genero;
    private Date fecha_nacmiento;
    private String calle_principal;
    private String calle_secundaria;
    private int numero_casa;
    private String telefono;
    private int numero_mascotas;
    private byte[] foto;

    public Clase_Adoptante() {}

    public Clase_Adoptante(String nombre, String genero, Date fecha_nacmiento, String calle_principal, String calle_secundaria, int numero_casa, String telefono, int numero_mascotas, String cedula, String cuenta, String contraseña,String apellido,byte[] foto) {
        super(cedula, cuenta, contraseña);
        this.nombre = nombre;
        this.genero = genero;
        this.apellido=apellido;
        this.fecha_nacmiento = fecha_nacmiento;
        this.calle_principal = calle_principal;
        this.calle_secundaria = calle_secundaria;
        this.numero_casa = numero_casa;
        this.telefono = telefono;
        this.numero_mascotas = numero_mascotas;
        this.foto=foto;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFecha_nacmiento() {
        return fecha_nacmiento;
    }

    public void setFecha_nacmiento(Date fecha_nacmiento) {
        this.fecha_nacmiento = fecha_nacmiento;
    }

    public String getCalle_principal() {
        return calle_principal;
    }

    public void setCalle_principal(String calle_principal) {
        this.calle_principal = calle_principal;
    }

    public String getCalle_secundaria() {
        return calle_secundaria;
    }

    public void setCalle_secundaria(String calle_secundaria) {
        this.calle_secundaria = calle_secundaria;
    }

    public int getNumero_casa() {
        return numero_casa;
    }

    public void setNumero_casa(int numero_casa) {
        this.numero_casa = numero_casa;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getNumero_mascotas() {
        return numero_mascotas;
    }

    public void setNumero_mascotas(int numero_mascotas) {
        this.numero_mascotas = numero_mascotas;
    }
    
    
    
}
