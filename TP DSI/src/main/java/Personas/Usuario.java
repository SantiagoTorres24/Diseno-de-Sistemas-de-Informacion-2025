package Personas;

import Estructuras.Coleccion;
import Estructuras.Hecho;

import java.util.List;

abstract public class Usuario {
    private List<Solicitud> solicitudes;
    private Usuario tipoUsuario;
    //private List<Hecho> hechosCreados;

    //El usuario accede a los Hechos de una Coleccion
    public List<Hecho> obtenerHechos(Coleccion coleccion){
        return coleccion.getHechos();
    }

    //El usuario filtra Hechos de la Coleccion.
    //Ejemplo: Filtrar solo Hechos cercanos a < 5km\
    //TODO
    /* public List<Hecho> obtenerHechosSegunFiltro(Coleccion coleccion, Condicion condicion) {
        return coleccion.getHechos().stream().filter(hecho ->
                condicion.hechoCumple(hecho));
    }*/


    public void solicitarEliminacionDeUnHecho(Hecho hecho, Administrador administrador){
        administrador.eliminarHecho(hecho);
    }
}
