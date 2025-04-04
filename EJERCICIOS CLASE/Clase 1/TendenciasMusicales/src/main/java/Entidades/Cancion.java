package Entidades;

import Popularidades.EnAuge;
import Popularidades.Normal;
import Popularidades.Popularidad;


import Popularidades.Tendencia;
import lombok.Getter;


import java.time.LocalDateTime;

@Getter

public class Cancion {
    private String titulo;
    private Integer cantReproducciones;
    private Integer cantLikes;
    private Integer cantDislikes;
    private LocalDateTime ultReproduccion;
    private Artista artista;
    private Album album;
    private Popularidad popularidad;

    public Cancion(String titulo, Artista artista, Album album) {
        this.titulo = titulo;
        this.cantReproducciones = 0;
        this.cantLikes = 0;
        this.cantDislikes = 0;
        this.ultReproduccion = LocalDateTime.now();
        this.artista = artista;
        this.album = album;
        this.popularidad = new Normal(); // la cancion arranca siendo normal
    }

    public String reproducirCancion() {
        cantReproducciones++;
        this.ultReproduccion = LocalDateTime.now();
        this.evaluarCambioPopularidad();

        return "La popularidad es " + this.getPopularidad() + System.lineSeparator() +
                popularidad.icono() + " - " + popularidad.leyenda(this);

    }

    public void evaluarCambioPopularidad() {
        this.popularidad = popularidad.cambiarEstado(this);
    }

    public void likearCancion() {
        cantLikes++;
    }

    public void dislikearCancion() {
        cantDislikes++;
    }

    public boolean puedeSerTendencia() {
        Tendencia tendencia = new Tendencia();
            if(this.getCantReproducciones() > tendencia.getCantReproduccionesMin() &&
            this.getCantLikes() > tendencia.getCantLikesMin()){
                return true;
            }
        return false;
    }

    public boolean puedeSerNormal() {
        Normal normal = new Normal();
        if (this.getPopularidad().equals("En Auge")) {
            if (this.getCantDislikes() > normal.getDislikesMin()) {
                return true;
            } else { return false; }
        } else {
            return this.noFueReproducidaEnLasUltimas24Hs();
        }
    }

    public boolean puedeSerEnAuge(){
        EnAuge enAuge = new EnAuge();
        if(this.getCantReproducciones() > enAuge.getReproduccionesMin() &&
        this.getCantLikes() > enAuge.getLikesMin()){
            return true;
        } else {
            return false;
        }
    }

    public boolean noFueReproducidaEnLasUltimas24Hs() {
        //TODO
        return true;
    }

    public void setCantReproducciones(Integer cantReproducciones) {
        this.cantReproducciones = cantReproducciones;
    }

    public void setCantLikes(Integer cantLikes) {
        this.cantLikes = cantLikes;
    }

    public void setCantDislikes(Integer cantDislikes) {
        this.cantDislikes = cantDislikes;
    }

    public void setPopularidad(Popularidad popularidad) {
        this.popularidad = popularidad;
    }
}
