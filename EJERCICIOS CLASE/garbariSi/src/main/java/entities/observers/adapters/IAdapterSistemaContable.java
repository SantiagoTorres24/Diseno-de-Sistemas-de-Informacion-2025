package entities.observers.adapters;

import entities.productos.Producto;

public interface IAdapterSistemaContable {
  void notificar(Producto producto);
}
