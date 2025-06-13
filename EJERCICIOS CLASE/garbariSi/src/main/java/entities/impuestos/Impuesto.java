package entities.impuestos;

import entities.productos.Producto;

public interface Impuesto {
  public Double calcular(Producto producto);
}
