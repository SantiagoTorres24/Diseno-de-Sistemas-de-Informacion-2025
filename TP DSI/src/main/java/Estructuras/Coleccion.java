package Estructuras;

import Fuentes.Fuente;
import Personas.Administrador;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Setter
@Getter

public class Coleccion {
    protected List<Hecho> hechos;
    private String titulo;
    private String descripcion;
    private Administrador administrador;

    // Las personas administradoras de un servicio pueden crear tantas colecciones como deseen.
    // Inicialmente, éstas estarán vacías, es decir, no habrá hechos en ellas.

    public Coleccion(String titulo, String descripcion, Administrador administrador) {
        this.hechos = new ArrayList<Hecho>();
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.administrador = administrador;
    }

    public void agregarHecho(Hecho ... hechos){
        Collections.addAll(this.hechos, hechos);
    }

    public void mostrar() {
        System.out.println("Colección: " + this.titulo);
        System.out.println("Descripción: " + this.descripcion);
        System.out.println("Hechos:");
        for (int i = 0; i < hechos.size(); i++) {
            Hecho h = hechos.get(i);
            System.out.println(i + ". " + h.getTitulo() + " - " + h.getDescripcion() + " (" + h.getCategoria() + ")");
        }
    }

    public int cantHechos() {
        return this.getHechos().size();
    }

    public Hecho get(int indice) {
        return this.hechos.get(indice);
    }

    public void eliminarHecho(Hecho hecho) {
        this.hechos.remove(hecho);
    }
}
