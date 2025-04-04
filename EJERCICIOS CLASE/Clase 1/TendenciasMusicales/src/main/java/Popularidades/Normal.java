package Popularidades;

import Entidades.Cancion;
import Entidades.Icono;
import lombok.Getter;
import lombok.Setter;

import static Entidades.Icono.MUSICAL_NOTE;

@Setter

public class Normal implements Popularidad {
    private String nombre;
    private Integer dislikesMin;
    private Icono icono;

    public Normal() {
        this.nombre = "Normal";
        this.dislikesMin = 5000;
        this.icono = MUSICAL_NOTE;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getDislikesMin() {
        return dislikesMin;
    }

    @Override
    public String icono() {
        return icono.texto();
    }

    @Override
    public String leyenda(Cancion cancion) {
        return cancion.getArtista().getNombre() + " - " +
                cancion.getAlbum().getNombre() + " - " +
                cancion.getTitulo();

    }

    @Override
    public Popularidad cambiarEstado(Cancion cancion) {
        if (cancion.puedeSerTendencia()) {
            Popularidad tendencia = new Tendencia();
            return tendencia;
        } else if (cancion.puedeSerEnAuge()) {
            Popularidad enAuge = new EnAuge();
            return enAuge;
        } else {
            return this;
        }
    }

}