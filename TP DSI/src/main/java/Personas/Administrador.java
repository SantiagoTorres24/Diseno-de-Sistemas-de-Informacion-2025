package Personas;

import Estructuras.Coleccion;
import Estructuras.Hecho;
import Fuentes.Fuente;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Setter
@Getter

public class Administrador {
    private List<Solicitud> solicitudesRecibidas;
    private List<Coleccion> coleccionesCreadas; // preguntar si toda coleccion tiene un administrador

    public Administrador() {
        this.solicitudesRecibidas = new ArrayList<Solicitud>();
        this.coleccionesCreadas = new ArrayList<Coleccion>();
    }

    public void resolverSolicitud(){
        //solicitudesRecibidas; //la puede borrar, rechazar etc.
    }

    //public Hecho eliminarHecho(Hecho hecho){}

    public void crearColeccion(String titulo, String descripcion){
        Coleccion coleccion = new Coleccion(titulo, descripcion, this);
        this.coleccionesCreadas.add(coleccion);
    }

    public void eliminarHecho(Hecho hecho) {
        //TODO
    }

    public void mostrarColecciones() {
        for (int i = 0; i < this.coleccionesCreadas.size(); i++) {
            System.out.println("Colección " + (i + 1) + ":");
            Coleccion c = this.coleccionesCreadas.get(i);
            c.mostrar();
            System.out.println(); // Línea en blanco para separar colecciones
        }
    }



    public void recibirSolicitud(Solicitud solicitud) {
        if(solicitud.getMotivoBorrado().length() > 500 ){
            solicitud.getColeccion().eliminarHecho(solicitud.getHecho());
            solicitud.solicitudAceptada();
        } else {

        }
    }
}
