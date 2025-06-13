package services;
import entities.Sucursal;
import entities.observers.ContadorVentas;
import entities.observers.Deposito;
import entities.observers.OficinaContable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SucursalService {
  private final OficinaContableFactory oficinaContableFactory;

  @Autowired
  public SucursalService(OficinaContableFactory oficinaContableFactory) {
    this.oficinaContableFactory = oficinaContableFactory;
  }

  public Sucursal crearSucursal(String nombre) {
    Sucursal sucursal = new Sucursal(nombre);
    OficinaContable oficinaContable = oficinaContableFactory.crear();
    Deposito deposito = new Deposito();
    ContadorVentas contadorDeVentas = new ContadorVentas();
    sucursal.agregarObservers(oficinaContable, deposito, contadorDeVentas);
    return sucursal;
  }
}
