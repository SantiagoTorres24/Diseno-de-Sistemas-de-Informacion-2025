package Domain.lugares;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pais {
    private String nombre;
    private Continente continente;
    private List<Ciudad> ciudades;

    public Pais(){
        this.ciudades = new ArrayList<Ciudad>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Continente getContinente() {
        return continente;
    }

    public void setContinente(Continente continente) {
        this.continente = continente;
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public void agregarCiudades(Ciudad ... ciudades){ // con el ... permito de 0 a n variables
        Collections.addAll(this.ciudades, ciudades);
    }
}
