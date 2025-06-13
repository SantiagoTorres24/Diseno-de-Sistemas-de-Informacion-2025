package entities.observers;

import entities.productos.Producto;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class ContadorVentas implements IObserver{
  private Integer cantidadVentas;

  public ContadorVentas(){
    this.cantidadVentas = 0;
  }

  @Override
  public void notificarVenta(Producto producto) {
    this.cantidadVentas++;
  }
}
