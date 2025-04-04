package Personas;
import Estructuras.Coleccion;
import Estructuras.Hecho;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class Solicitud {
    private Coleccion coleccion;
    private Hecho hecho;
    private String motivoBorrado; //se explica en 500 caracteres por que borrarlo
    private Usuario usuario;
    private Boolean terminada;

    public Solicitud(Coleccion coleccion, Hecho hecho, String motivoBorrado, Usuario usuario) {
        this.coleccion = coleccion;
        this.hecho = hecho;
        this.motivoBorrado = motivoBorrado;
        this.usuario = usuario;
        this.terminada = false;
    }

    public void solicitudAceptada(){ terminada = true; }

}
