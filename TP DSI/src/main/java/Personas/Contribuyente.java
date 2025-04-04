package Personas;

import Estructuras.Coleccion;
import Estructuras.Hecho;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Contribuyente extends Usuario {
    private String nombre;
    private String apellido;
    private Integer edad;

    //TODO que es un contribuyente?
    //Visualiza y sube algo, se convierte?
    //Anonimo siempre

    public Contribuyente(String nombre) {
        if(nombre == null){
            throw new NullPointerException("Nombre del persona nulo");
        }
        this.nombre = nombre;
    }

    public void agregarApellido(String apellido){
        this.apellido = apellido;
    }

    public void agregarEdad(int edad){
        this.edad = edad;
    }

    public void solicitarEliminarHecho(Coleccion coleccion, Hecho hecho, String motivoBorrado){
        Solicitud solicitud = new Solicitud(coleccion, hecho, motivoBorrado, this);
        coleccion.getAdministrador().recibirSolicitud(solicitud);
    }
}
