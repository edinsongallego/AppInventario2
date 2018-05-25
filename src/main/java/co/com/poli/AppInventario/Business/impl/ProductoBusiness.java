/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.AppInventario.Business.impl;

import co.com.poli.AppInventario.Business.IProductoBusiness;
import org.springframework.stereotype.Service;
import co.com.poli.AppInventario.Model.Producto;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import co.com.poli.AppInventario.DAO.IProductoDAO;

@Service
public class ProductoBusiness implements IProductoBusiness {
  
  @Autowired
  private IProductoDAO dao;

  public ProductoBusiness() {
  }

  @Override
  public ArrayList<Producto> listarProducto() {
    return this.dao.listarProductos();
  }
  
   
  
}
