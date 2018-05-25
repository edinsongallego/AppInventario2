/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.AppInventario.Data;

/**
 *
 * @author ACER
 */
import co.com.poli.AppInventario.Model.Movimiento;
import co.com.poli.AppInventario.Model.Producto;
import java.util.List;
import java.util.ArrayList;

public class MovimientoData {
  
  
  private static List<Movimiento> listaMovimientos;
 
 Producto producto = new Producto("001", "chicle",50D,30D));
     static {
         listaMovimientos = new ArrayList<Movimiento>() {
             {
              
               
                   add (new Movimiento("001", producto,50D,"entrada",50D));
                         
 
             }
         };
     }
 
     public static List<Movimiento> getListaMovimientos() {
         return listaMovimientos;
     }
 
     public static void setListaMovimientos(List<Movimiento> listaMovimientos) {
         MovimientoData.listaMovimientos = listaMovimientos;
     }

    public static void setlistaMovimientos(List<Movimiento> listado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}
