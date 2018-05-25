/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.AppInventario.Controller;

import co.com.poli.AppInventario.Business.IMovimientoBusiness;

import co.com.poli.AppInventario.Model.Movimiento;
import java.util.ArrayList;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/")
public class MovimientoController {
  
  @Autowired
  private IMovimientoBusiness movimientoBusiness;
  
  @GetMapping("/movimientos")
  public ArrayList<Movimiento> getMovimientos(HttpServletResponse hsr) {
    return this.movimientoBusiness.listarMovimiento();
  }
  
}
