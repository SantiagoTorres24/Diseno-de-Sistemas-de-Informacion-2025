package Personas;

import Estructuras.Coleccion;
import Estructuras.Hecho;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter

public class Visualizador extends Usuario {

    public void navegarHechosDisponibles(Coleccion coleccion) {
        for (int i = 0; i < coleccion.cantHechos(); i++) {
            Hecho h = coleccion.get(i);
            System.out.println("Hecho " + (i + 1) + " - " + h.mostrar());
        }
    }
}
