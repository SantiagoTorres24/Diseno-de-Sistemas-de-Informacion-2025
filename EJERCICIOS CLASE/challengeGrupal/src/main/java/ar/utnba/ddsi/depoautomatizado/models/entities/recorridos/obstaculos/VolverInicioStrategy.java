package ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.obstaculos;

import static java.util.Collections.reverse;

import ar.utnba.ddsi.depoautomatizado.models.entities.mercaderias.Posicion;
import ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.Obstaculo;
import ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.Recorrido;
import ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.comando.Avanzar;
import ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.comando.Comando;
import ar.utnba.ddsi.depoautomatizado.models.entities.robots.Robot;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VolverInicioStrategy implements EstrategiaObstaculo {
    @Override
    public void manejarObstaculo(Robot robot, Obstaculo obstaculo){
        List<Comando> comandosInversos = robot.getComandos();
        Collections.reverse(comandosInversos);

        //List<Comando> comandos = comandosInversos.forEach(c->c.getPosicion().inversa());

        List<Obstaculo> obstaculos = new ArrayList<>();
        Recorrido recorridoInverso = new Recorrido(comandosInversos, obstaculos);

        recorridoInverso.ejecutarRecorrido(robot);
    }
}