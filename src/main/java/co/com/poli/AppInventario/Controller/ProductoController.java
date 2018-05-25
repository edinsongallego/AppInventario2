/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.AppInventario.Controller;

import co.com.poli.AppInventario.Business.IProductoBusiness;
import co.com.poli.AppInventario.Model.Producto;
import java.util.ArrayList;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/")
public class ProductoController {
  
  @Autowired
  private IProductoBusiness productoBusiness;
  
  @GetMapping("/productos")
  public ArrayList<Producto> getProductos(HttpServletResponse hsr) {
    return this.productoBusiness.listarProducto();
  }
  
}
