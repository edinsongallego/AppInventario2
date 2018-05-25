package co.com.poli.AppInventario.Business.impl;

import co.com.poli.AppInventario.Business.IMovimientoBusiness;
import co.com.poli.AppInventario.DAO.IMovimientoDao;
import org.springframework.stereotype.Service;
import co.com.poli.AppInventario.Model.Movimiento;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class MovimientoBusiness implements IMovimientoBusiness {
  
  @Autowired
  private IMovimientoDao dao;

  public MovimientoBusiness() {
  }

  @Override
  public ArrayList<Movimiento> listarMovimiento() {
    return this.dao.listarMovimientos();
  }
}