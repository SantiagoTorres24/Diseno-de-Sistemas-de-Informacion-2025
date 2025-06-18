package ar.utnba.ddsi.depoautomatizado.models.entities.mercaderias;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Posicion {
  private int x;
  private int y;
  private int z;

  public Posicion(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public Posicion movimiento(Posicion posicion) {
    this.x += posicion.x; //avanzar
    this.y += posicion.y; // girar
    this.z += posicion.z; // elevar
    return this;
  }

  public Posicion inversa() {
    this.x *= -1; //retroceder
    this.y *= -1; // girar
    this.z *= -1; // descender (sos de la b)
    return this;
  }

} 