package entities.observers;

import entities.observers.adapters.IAdapterSistemaContable;
import entities.productos.Producto;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class OficinaContable implements IObserver{
  private Double totalLibroDiario;
  private IAdapterSistemaContable adapter;

  public OficinaContable(IAdapterSistemaContable adapter) {
    this.totalLibroDiario = 0.0;
    this.adapter = adapter;
  }

  @Override
  public void notificarVenta(Producto producto) {
    this.totalLibroDiario += producto.precioTotal();
    adapter.notificar(producto);
  }

}
