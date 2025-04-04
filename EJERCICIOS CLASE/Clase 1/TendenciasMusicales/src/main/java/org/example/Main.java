package org.example;

import Entidades.Album;
import Entidades.Artista;
import Entidades.Cancion;
import Popularidades.EnAuge;
import Popularidades.Tendencia;
import Popularidades.Normal;
import Popularidades.Popularidad;

public class Main {
    public static void main(String[] args) {
        Artista artista = new Artista("Nicki Nicole");
        Album album = new Album("Alma", 2023);
        Cancion cancion = new Cancion("Honey", artista, album);

        System.out.println(cancion.puedeSerEnAuge());
    }
}