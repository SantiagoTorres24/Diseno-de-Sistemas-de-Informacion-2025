import Estructuras.Coleccion;
import Estructuras.Hecho;
import Personas.Administrador;
import Personas.Contribuyente;
import Personas.Visualizador;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Visualizador v = new Visualizador();
        Administrador admin = new Administrador();

        Coleccion coleccion = new Coleccion("Titulo", "Descripcion", admin);
        Hecho h = new Hecho("TituloHecho1", "dd", "Categoria1");
        Hecho h2 = new Hecho("TituloHecho2", "Descripcion", "Categoria2");
        Hecho h3  = new Hecho("TituloHecho3", "Descripcion", "Categoria3");

        coleccion.agregarHecho(h,h2,h3);
        Predicate<Hecho> filtroDescripcion = hecho -> hecho.getDescripcion().contains("Descripcion");

        v.navegarHechosSegunFiltro(coleccion, filtroDescripcion);
    }
}
