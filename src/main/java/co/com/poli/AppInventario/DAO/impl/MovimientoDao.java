/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.AppInventario.DAO.impl;


import co.com.poli.AppInventario.DAO.IMovimientoDao;
import co.com.poli.AppInventario.Data.MovimientoData;
import co.com.poli.AppInventario.Model.Movimiento;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class MovimientoDao implements IMovimientoDao {

  public MovimientoDao() {
  }
  
  @Override
  public ArrayList<Movimiento> listarMovimientos() {
    return (ArrayList<Movimiento>) MovimientoData.getListaMovimientos();
  } 
  
   @Override
    public String crearMovimiento(Movimiento movimiento) {
        List<Movimiento> listado = MovimientoData.getListaMovimientos();

        listado.add(movimiento);
        MovimientoData.setListaMovimientos(listado);

        return "Movimiento Registrado";
    }
@Override
    public String modificarMovimiento(Movimiento movimiento) {

        String respuesta = "Movimiento Actualizado";
        List<Movimiento> listado = MovimientoData.getListaMovimientos();
        listado.set(listado.indexOf(movimiento), movimiento);
        MovimientoData.setListaMovimientos(listado);
        return respuesta;
    }
     @Override
    public String eliminarMovimiento(String codigo) {

        String respuesta = "Producto Eliminado";
        List<Movimiento> listado = MovimientoData.getListaMovimientos();
        Movimiento movimiento = new Movimiento(codigo,"", null,"",null);
        listado.remove(movimiento);
        MovimientoData.setListaMovimientos(listado);
        return respuesta;

    }
}
