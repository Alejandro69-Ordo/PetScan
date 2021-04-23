/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;


public class Clase_Solicitud {
    
    private int id_adopcion;
    private String id_mascota;
    private String id_adoptante;
    private String id_localidad;
    private Date fecha_adopcion;
    private String tipo_vivienda;

    public Clase_Solicitud() {
    }

    public Clase_Solicitud(int id_adopcion, String id_mascota, String id_adoptante, String id_localidad, Date fecha_adopcion, String tipo_vivienda) {
        this.id_adopcion = id_adopcion;
        this.id_mascota = id_mascota;
        this.id_adoptante = id_adoptante;
        this.id_localidad = id_localidad;
        this.fecha_adopcion = fecha_adopcion;
        this.tipo_vivienda = tipo_vivienda;
    }

    public int getId_adopcion() {
        return id_adopcion;
    }

    public void setId_adopcion(int id_adopcion) {
        this.id_adopcion = id_adopcion;
    }

    public String getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(String id_mascota) {
        this.id_mascota = id_mascota;
    }

    public String getId_adoptante() {
        return id_adoptante;
    }

    public void setId_adoptante(String id_adoptante) {
        this.id_adoptante = id_adoptante;
    }

    public String getId_localidad() {
        return id_localidad;
    }

    public void setId_localidad(String id_localidad) {
        this.id_localidad = id_localidad;
    }

    public Date getFecha_adopcion() {
        return fecha_adopcion;
    }

    public void setFecha_adopcion(Date fecha_adopcion) {
        this.fecha_adopcion = fecha_adopcion;
    }

    public String getTipo_vivienda() {
        return tipo_vivienda;
    }

    public void setTipo_vivienda(String tipo_vivienda) {
        this.tipo_vivienda = tipo_vivienda;
    }
 
}
