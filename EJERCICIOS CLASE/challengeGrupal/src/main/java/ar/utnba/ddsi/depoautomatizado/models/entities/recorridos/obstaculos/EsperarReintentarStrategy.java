package ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.obstaculos;

import ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.Obstaculo;
import ar.utnba.ddsi.depoautomatizado.models.entities.robots.Robot;

public class EsperarReintentarStrategy implements EstrategiaObstaculo {
  private final Integer tiempoAEsperar;

  public EsperarReintentarStrategy(Integer tiempo) {
    this.tiempoAEsperar = tiempo;
  }

  @Override
  public void manejarObstaculo(Robot robot, Obstaculo obstaculo) {
    Thread.sleep(tiempoAEsperar);
    robot.tratarObstaculo(obstaculo);
  }
}