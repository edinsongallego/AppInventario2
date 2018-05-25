/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.AppInventario.Data;
import co.com.poli.AppInventario.Model.Producto;
import java.util.List;
import java.util.ArrayList;

public class ProductoData {
  
  
  private static List<Producto> listaProductos;
 
     static {
         listaProductos = new ArrayList<Producto>() {
             {
                 add(new Producto("001", "chicle", 30D,50D));
                 add(new Producto("002", "banana",20D, 20D));
                 add(new Producto("003", "papas", 10D,10D));
                 add(new Producto("004", "chocolate",15D,5D));
                 add(new Producto("005", "leche",30D,80D));
             }
         };
     }
 
     public static List<Producto> getListaProductos() {
         return listaProductos;
     }
 
     public static void setListaPedidos(List<Producto> listaProductos) {
         ProductoData.listaProductos = listaProductos;
     }

    public static void setListaProductos(List<Producto> listado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}
