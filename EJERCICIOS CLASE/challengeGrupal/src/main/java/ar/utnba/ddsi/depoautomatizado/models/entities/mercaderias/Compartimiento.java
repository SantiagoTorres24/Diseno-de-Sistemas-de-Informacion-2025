package ar.utnba.ddsi.depoautomatizado.models.entities.mercaderias;

import ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.Recorrido;
import ar.utnba.ddsi.depoautomatizado.models.entities.robots.Robot;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Compartimiento {
    private String id;
    private Recorrido recorrido;
    private Posicion posicion;
    
    public Compartimiento(String id, Posicion posicion) {
        this.id = id;
        this.posicion = posicion;
    }

    public void serRecorridoPor(Robot robot) {
        this.recorrido.ejecutarRecorrido(robot);
    }
}