package entities.observers;

import entities.productos.Producto;

public interface IObserver {
  void notificarVenta(Producto producto);
}
