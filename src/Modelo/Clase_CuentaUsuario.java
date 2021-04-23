package Modelo;

public class Clase_CuentaUsuario {
    
    private String cedula;
    private String cuenta;
    private String contraseña;

    public Clase_CuentaUsuario() {
    }

    public Clase_CuentaUsuario(String cedula, String cuenta, String contraseña) {
        this.cedula = cedula;
        this.cuenta = cuenta;
        this.contraseña = contraseña;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    
}
