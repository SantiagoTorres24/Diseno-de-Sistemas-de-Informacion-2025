package ar.utnba.ddsi.depoautomatizado.models.entities.recorridos;

import ar.utnba.ddsi.depoautomatizado.models.entities.mercaderias.Posicion;
import ar.utnba.ddsi.depoautomatizado.models.entities.robots.Robot;
import ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.comando.Comando;
import java.util.Collections;
import java.util.List;

public class Recorrido {
  //UN RECORRIDO ES UNA LISTA DE COMANDOS CON OBSTACULOS EN MEDIO
  List<Comando> comandos; //indican ordenes para llegar a la posicion deseada
  List<Obstaculo> obstaculos; //tiene obstaculos en posiciones fijas X,Y,Z

  public Recorrido(List<Comando> comandos, List<Obstaculo> obstaculos){
    this.comandos = comandos;
    this.obstaculos = obstaculos;
  }

  //Un robot sabe ejecutar acciones básicas, dentro del recorrido
  public void ejecutarRecorrido(Robot robot) {
    //PARA CADA POSICION (x,y,z) INDICADA EL ROBOT VA HACIA ALLI
    for (Comando c : comandos) {
      Posicion posicionActual = robot.posicionActual();

      //CHEQUEA SI HAY OBSTACULOS: robot.hacerMovimiento(c) devuelve la futura posicion
      if (obstaculos.stream().anyMatch(o -> robot.hacerMovimiento(c) == o.getPosicion())){
        Obstaculo obstaculoActual = new Obstaculo(posicionActual);
        robot.tratarObstaculo(obstaculoActual);
      }
      robot.hacerMovimiento(c); //HACE EL MOVIMIENTO
    }
  }

  public void ejecutarRecorridoInverso(Robot robot) {
    //DEBO OBTENER EL ULTIMO COMANDO AL CUAL LLEGO EL BOT
    //LOS INVIERTO PARA EJECUTAR PARA ATRAS
    List<Comando> comandosInversos = robot.getComandos();
    Collections.reverse(comandosInversos);

    for (Comando c: comandosInversos) {
      Posicion posicionActual = robot.posicionActual();

      //CHEQUEA SI HAY OBSTACULOS: robot.hacerMovimiento(c) te devuelve una posicion
      if (obstaculos.stream().anyMatch(o -> robot.hacerMovimiento(c) == o.getPosicion())){
        Obstaculo obstaculoActual = new Obstaculo(posicionActual);
        robot.tratarObstaculo(obstaculoActual);
      }
      robot.hacerMovimiento(c); //HACE EL MOVIMIENTO
    }

  }

} 