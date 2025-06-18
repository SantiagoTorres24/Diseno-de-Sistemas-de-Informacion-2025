package ar.utnba.ddsi.depoautomatizado.models.entities.mercaderias;

import ar.utnba.ddsi.depoautomatizado.models.entities.robots.Robot;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mercaderia {
    private String id;
    private String descripcion;
    private Compartimiento compartimiento;

    public Mercaderia(String id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    //Un robot para buscar la mercadería
    //recibe una secuencia de órdenes preestablecidas,
    //porque en sí mismo no es capaz de resolver el recorrido.
    public void serRecogidaPor(Robot robot) {
        this.compartimiento.getRecorrido().ejecutarRecorrido(robot);
    }
}