package ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.comando;

import ar.utnba.ddsi.depoautomatizado.models.entities.mercaderias.Posicion;
import ar.utnba.ddsi.depoautomatizado.models.entities.robots.Robot;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Girar extends Comando{
  public Posicion ejecutar(Robot robot) {
    return null;
  }
}
