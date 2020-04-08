/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import Modelo.Alquiler;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 *
 * @author santi
 */
public class Alquilerservicios {

    
    
    public void guardar(Connection conexion,Alquiler alquiler)throws SQLException{
    
    try{
    PreparedStatement consulta;
    consulta=conexion.prepareStatement("INSERT INTO alquiler(idusuario,idhabitacion,cantidad,fecha)"+"values(?,?,?,?)");
    
    consulta.setString(1,alquiler.getUsuario().getId());
    consulta.setInt(2, alquiler.getTipohabitacion().getId());
    consulta.setInt(3, alquiler.getCantidad());
    consulta.setDate(4, alquiler.getFecha());
    
    
    }catch(SQLException e)
    {
        throw new SQLException(e);
    }
    }
}
