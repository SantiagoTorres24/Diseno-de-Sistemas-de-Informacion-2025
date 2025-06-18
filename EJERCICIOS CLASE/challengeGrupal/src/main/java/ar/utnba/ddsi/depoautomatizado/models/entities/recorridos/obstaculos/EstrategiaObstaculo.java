package ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.obstaculos;

import ar.utnba.ddsi.depoautomatizado.models.entities.mercaderias.Posicion;
import ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.Obstaculo;
import ar.utnba.ddsi.depoautomatizado.models.entities.robots.Robot;

public interface EstrategiaObstaculo {
    void manejarObstaculo(Robot robot, Obstaculo obstaculo);
} 