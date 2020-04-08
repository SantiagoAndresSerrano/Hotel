/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author santi
 */
public class Tipohabitacion {
    
    public Integer id;
    public String descripcion;
    public Integer tarifa;
    public Integer cantidad;
    
    
    public Tipohabitacion(){
    
    }
    public Tipohabitacion(Integer id, String descripcion, Integer tarifa, Integer cantidad) {
        this.id = id;
        this.descripcion = descripcion;
        this.tarifa = tarifa;
        this.cantidad = cantidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getTarifa() {
        return tarifa;
    }

    public void setTarifa(Integer tarifa) {
        this.tarifa = tarifa;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
}
