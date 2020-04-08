/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Alquiler;
import Servicios.Conexion;
import Servicios.UsuarioServicios;

/**
 *
 * @author santi
 */
public class Servicios {
    
    public void alquiler(Alquiler alquiler){
    
        try{
        UsuarioServicios us=new UsuarioServicios();
        us.guardar(Conexion.obtener(), alquiler.getUsuario());
        
        }catch(Exception e){}
    }
    
}
