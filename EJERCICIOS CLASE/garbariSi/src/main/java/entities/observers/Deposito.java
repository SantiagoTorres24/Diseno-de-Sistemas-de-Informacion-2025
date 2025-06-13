package entities.observers;

import entities.productos.Producto;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Deposito implements IObserver {
  private List<Producto> productosAPreparar;

  public Deposito() {
    this.productosAPreparar = new ArrayList<>();
  }

  @Override
  public void notificarVenta(Producto producto) {
    this.preparar(producto);
  }

  public void preparar(Producto producto) {
    this.productosAPreparar.add(producto);
  }
}
