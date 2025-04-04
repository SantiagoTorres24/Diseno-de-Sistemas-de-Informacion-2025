package Estructuras;

import Fuentes.Fuente;
import Personas.Administrador;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Setter
@Getter

public class Hecho {
    private String titulo;
    private String descripcion;
    private String categoria; // Categoria categoria
    /* private Hecho contenidoMultimediaOpcional;
    private String lugarAcontecimiento;
    private LocalDate fechaAcontecimiento;
    private LocalDate fechaCarga;
    private String origen; // Origen origen*/
    // private List<Fuente> fuentes; necesito las fuentes??

    /*Cualquier hecho
    provisto por contribuyentes de la plataforma
    podrá ser sometido a etapas de etiquetado y
    revisión manual por parte de las personas administradoras.*/

    //La información de quién subió un
    //determinado hecho quedará disponible en caso de que sea necesario una revisión sobre ellos.

    //Cualquier hecho del sistema debe admitir solicitudes de eliminación,
    // para aquellas situaciones adecuadamente fundadas
    // (por ahora, mediante un texto de al menos 500 caracteres)
    // en que se deba eliminar del sitio la información, aún cuando esté en una fuente.

    public Hecho(String titulo, String descripcion, String categoria){
                 //Hecho contenidoMultimediaOpcional, String lugarAcontecimiento,
                 //LocalDate fechaAcontecimiento, LocalDate fechaCarga, String origen) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.categoria = categoria;
       /* this.contenidoMultimediaOpcional = contenidoMultimediaOpcional;
        this.lugarAcontecimiento = lugarAcontecimiento;
        this.fechaAcontecimiento = fechaAcontecimiento;
        this.fechaCarga = fechaCarga;
        this.origen = origen; */
        // this.fuentes = new ArrayList<Fuente>();
    }

    public String mostrar() {
        return "Titulo: " + this.getTitulo() + "\nDescripcion: " + this.getDescripcion() +
                "\nCategoria: " + this.getCategoria();
    }

    /* public void agregarFuentes(Fuente ... fuentes){
        Collections.addAll(this.fuentes, fuentes);
    }*/

}
