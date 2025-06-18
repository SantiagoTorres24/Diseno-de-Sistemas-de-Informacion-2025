package ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.comando;

import ar.utnba.ddsi.depoautomatizado.models.entities.mercaderias.Posicion;
import ar.utnba.ddsi.depoautomatizado.models.entities.robots.Robot;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Comando {
  private Posicion posicion;  //(x,y,z) -> avanza en x, y, z

  public Posicion ejecutar(Robot robot){
    return posicion;
  }
}
