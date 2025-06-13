package entities.productos;

import entities.impuestos.Impuesto;
import java.util.List;

public class TipoProducto {
  private String nombre;
  private List<Impuesto> impuestos;

  public Double calcularImpuesto(Producto producto) {
    return this.impuestos.stream().mapToDouble(i -> i.calcular(producto)).sum();
  }

  public void agregarImpuesto(Impuesto impuesto){
    this.impuestos.add(impuesto);
  }
}
