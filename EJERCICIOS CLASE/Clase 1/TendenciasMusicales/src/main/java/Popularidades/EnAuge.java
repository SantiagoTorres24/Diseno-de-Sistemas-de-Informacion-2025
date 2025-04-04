package Popularidades;

import Entidades.Cancion;
import Entidades.Icono;
import lombok.Getter;
import lombok.Setter;

import static Entidades.Icono.ROCKET;

@Setter

public class EnAuge implements Popularidad {
    private Icono icono;
    private Integer reproduccionesMin;
    private Integer likesMin;
    private String nombre;

    public EnAuge() {
        this.nombre = "En Auge";
        this.icono = ROCKET;
        this.reproduccionesMin = 50000;
        this.likesMin = 20000;
    }

    public Integer getReproduccionesMin() {
        return reproduccionesMin;
    }

    public Integer getLikesMin() {
        return likesMin;
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


        return cancion.getArtista().getNombre() + " - " +
                cancion.getTitulo() + "(" + cancion.getAlbum().getNombre() + " - " +
                cancion.getAlbum().getAnioLanzamiento() + ")" + this.getNombre();
    }

    @Override
    public Popularidad cambiarEstado(Cancion cancion) {
        if(cancion.puedeSerTendencia()) {
            Popularidad tendencia = new Tendencia();
            return tendencia;
        } else if(cancion.puedeSerNormal()) {
            Popularidad normal = new Normal();
            return normal;
        }
        return this;
    }
}
