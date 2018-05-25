/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.AppInventario.DAO;

import co.com.poli.AppInventario.Model.Movimiento;

import java.util.ArrayList;

public interface IMovimientoDao {
   
   

    public ArrayList<Movimiento> listarMovimientos();

    String crearMovimiento(Movimiento movimiento);

    String modificarMovimiento(Movimiento movimiento);

    String eliminarMovimiento(String codigo);

}
