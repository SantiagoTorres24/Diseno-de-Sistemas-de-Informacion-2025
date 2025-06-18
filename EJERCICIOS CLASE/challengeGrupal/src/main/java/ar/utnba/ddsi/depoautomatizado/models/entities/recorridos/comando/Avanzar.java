package ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.comando;

import ar.utnba.ddsi.depoautomatizado.models.entities.robots.Robot;
import ar.utnba.ddsi.depoautomatizado.models.entities.mercaderias.Posicion;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Avanzar extends Comando{

  public Avanzar(Posicion posicion) {
    super(posicion);
  }

  @Override
  public Posicion ejecutar(Robot robot){
      robot.posicionActual().movimiento(super.getPosicion());
      return robot.posicionActual();
  } // TODO: rever
}
