/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.AppInventario.DAO;

import co.com.poli.AppInventario.Model.Producto;
import java.util.ArrayList;

/**
 *
 * @author sedinson
 */
public interface IProductoDAO {

    public ArrayList<Producto> listarProductos();

    String crearProducto(Producto producto);

    String modificarProducto(Producto producto);

    String eliminarProducto(String codigo);

}
