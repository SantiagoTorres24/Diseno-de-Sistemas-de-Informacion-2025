package entities.impuestos;

import entities.productos.Producto;
import lombok.Getter;
import lombok.Setter;

@Getter

public class EI implements Impuesto{
  @Setter
  private Double gananciasImpositivas;
  @Setter
  private static Double factorGananciasImpositivas;
  @Setter
  private static Double factorPrecioBase;

  @Override
  public Double calcular(Producto producto) {
    return (producto.getPrecioBase() / factorPrecioBase) +
            factorGananciasImpositivas * gananciasImpositivas;
  }
}
