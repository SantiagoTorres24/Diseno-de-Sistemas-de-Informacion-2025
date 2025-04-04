package Popularidades;

import Entidades.Cancion;

public interface Popularidad {
    String icono();
    String leyenda(Cancion cancion);
    Popularidad cambiarEstado(Cancion cancion);

}
