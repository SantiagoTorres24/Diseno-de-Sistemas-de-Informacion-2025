package entities.impuestos;

import entities.productos.Producto;
import lombok.Getter;
import lombok.Setter;


public class IVA implements Impuesto{
  @Setter
  @Getter
  private static Double porcentaje;

  @Override
  public Double calcular(Producto producto){
    return this.porcentaje * producto.getPrecioBase();
  }
}
