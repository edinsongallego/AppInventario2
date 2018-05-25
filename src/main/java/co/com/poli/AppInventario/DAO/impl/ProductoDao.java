/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.AppInventario.DAO.impl;
import co.com.poli.AppInventario.Model.Producto;
import co.com.poli.AppInventario.Data.ProductoData;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import co.com.poli.AppInventario.DAO.IProductoDAO;


@Repository
public class ProductoDao implements IProductoDAO {

  public ProductoDao() {
  }
  
  @Override
  public ArrayList<Producto> listarProductos() {
    return (ArrayList<Producto>) ProductoData.getListaProductos();
  } 
  
   @Override
    public String crearProducto(Producto producto) {
        List<Producto> listado = ProductoData.getListaProductos();

        listado.add(producto);
        ProductoData.setListaProductos(listado);

        return "Producto Registrado";
    }
@Override
    public String modificarProducto(Producto producto) {

        String respuesta = "Producto Actualizado";
        List<Producto> listado = ProductoData.getListaProductos();
        listado.set(listado.indexOf(producto), producto);
        ProductoData.setListaProductos(listado);
        return respuesta;
    }
     @Override
    public String eliminarProducto(String codigo) {

        String respuesta = "Producto Eliminado";
        List<Producto> listado = ProductoData.getListaProductos();
        Producto producto = new Producto(codigo, "", null,null);
        listado.remove(producto);
        ProductoData.setListaProductos(listado);
        return respuesta;

    }
}
