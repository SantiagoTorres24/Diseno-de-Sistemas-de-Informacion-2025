package Fuentes;

import java.time.LocalDate;
import java.util.*;
import Estructuras.Hecho;
import Estructuras.HechoDeTexto;

public class FuenteEstatica extends Fuente{
    private String archivo;

    public FuenteEstatica(){
       //listaHechos = this.leerArchivo(archivo);
    }

    //Se requiere diseñar e implementar el componente que posibilite la lectura de estos datasets y que extraiga los hechos de los mismos.
    //En esta primera iteración estaremos incorporando un lote de datos estático de tipo archivo .csv.

    //TODO
    //servicio de solo lectura para publicar información estática,
    //utilizando datasets que provengan de archivos u otras fuentes de datos provistas
    /* public List<Hecho> leerArchivo(archivo){
        String titulo = archivo.getTitulo();
        String descripcion = archivo.getDescripcion();
        String categoria = archivo.getCategoria();
        Integer latitud = archivo.getLatitud();
        Integer longitud = archivo.getLongitud();
        String ubicacion = this.obtenerUbicacion(longitud, latitud);
        LocalDate fechaHecho = archivo.getFechaHecho();
        LocalDate fechaCarga = LocalDate.now();
        HechoDeTexto hecho = new Hecho(titulo, descripcion, categoria, fechaHecho, fechaCarga);
    } */


    //public obtenerUbicacion(longitud, latitud);

}
