package Entidades;

import lombok.Getter;

@Getter

public class Album {
    private String nombre;
    private Integer anioLanzamiento;

    public Album(String nombre, Integer anioLanzamiento) {
        this.nombre = nombre;
        this.anioLanzamiento = anioLanzamiento;
    }
}
