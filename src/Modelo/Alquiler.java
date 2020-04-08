/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author santi
 */
public class Alquiler 

{
    private Integer id;
    private Integer cantidad;
    private Date fecha;
    private Usuario usuario;
    private Tipohabitacion tipohabitacion;

    public Alquiler() {
    }

    public Alquiler(Integer id, Integer cantidad, Date fecha, Usuario usuario, Tipohabitacion tipohabitacion) {
        this.id = id;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.usuario = usuario;
        this.tipohabitacion = tipohabitacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Tipohabitacion getTipohabitacion() {
        return tipohabitacion;
    }

    public void setTipohabitacion(Tipohabitacion tipohabitacion) {
        this.tipohabitacion = tipohabitacion;
    }
    
  
    

}