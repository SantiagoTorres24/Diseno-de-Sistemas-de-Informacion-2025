package entities.productos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Producto {
  private String nombre;
  private Double precioBase;
  private TipoProducto tipoProducto;

  public Double precioTotal(){
    return this.totalImpuestos() + getPrecioBase();
  }

  public Double totalImpuestos(){
    return this.tipoProducto.calcularImpuesto(this);
  }

}
