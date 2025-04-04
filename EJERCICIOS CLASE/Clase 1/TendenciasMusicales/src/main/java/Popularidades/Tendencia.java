package Popularidades;

import Entidades.Cancion;
import Entidades.Icono;
import lombok.Getter;
import lombok.Setter;

import static Entidades.Icono.FIRE;

@Setter

public class Tendencia implements Popularidad {
    private Icono icono;
    private Integer cantReproduccionesMin;
    private Integer cantLikesMin;
    private String nombre;

    public Tendencia() {
        this.nombre = "Tendencia";
        this.icono = FIRE;
        this.cantReproduccionesMin = 50000;
        this.cantLikesMin = 20000;
    }

    public Integer getCantReproduccionesMin() {
        return cantReproduccionesMin;
    }

    public Integer getCantLikesMin() {
        return cantLikesMin;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String icono() {
        return icono.texto();
    }

    @Override
    public String leyenda(Cancion cancion) {
        return cancion.getTitulo() + " - " + cancion.getArtista().getNombre() + "(" +
                cancion.getAlbum().getNombre() + " - " +
                cancion.getAlbum().getAnioLanzamiento() + ")";
    }

    @Override
    public Popularidad cambiarEstado(Cancion cancion) {

        return null;
    }

}
