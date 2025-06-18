package ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.obstaculos;

import ar.utnba.ddsi.depoautomatizado.models.entities.mercaderias.Posicion;
import ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.Obstaculo;
import ar.utnba.ddsi.depoautomatizado.models.entities.robots.Robot;

public class EsquivarObstaculoStrategy implements EstrategiaObstaculo {
    
    @Override
    public void manejarObstaculo(Robot robot, Obstaculo obstaculo) {
        robot.formaDeEsquivarObstaculo(obstaculo);
    }
} 