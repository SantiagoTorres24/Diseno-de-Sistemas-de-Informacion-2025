package Test;

import Entidades.Album;
import Entidades.Artista;
import Entidades.Cancion;
import Popularidades.EnAuge;
import Popularidades.Normal;
import Popularidades.Tendencia;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class CancionTest {
    private static Cancion scientist;

    @BeforeAll
    static void setup() {
        Artista coldplay = new Artista("Coldplay");
        Album albumColdplay = new Album("A Rush of Blood to the Head", 2002);
        scientist = new Cancion("The Scientist", coldplay, albumColdplay);
    }

    @Test
    @DisplayName("The Scientist recién se lanza (tiene popularidad normal)")
    public void verificarCancionNormal() {

        Assertions.assertNotEquals("Normal", scientist.getPopularidad());
    }

    @Test
    @DisplayName("The Scientist está en auge por superar el mínimo de reproducciones esperadas.")
    public void verificarCancionEnAuge() {
        scientist.setCantReproducciones(60001);
        scientist.evaluarCambioPopularidad();

        Assertions.assertEquals(EnAuge.class, scientist.getPopularidad().getClass());

    }

    @Test
    @DisplayName("The Scientist baja del auge por tener muchos dislikes.")
    public void verificarCancionBajaANormal(){
        scientist.setPopularidad(new EnAuge());
        scientist.setCantDislikes(5001);
        scientist.evaluarCambioPopularidad();

        Assertions.assertEquals(Normal.class, scientist.getPopularidad().getClass());

    }

    @Test
    @DisplayName("The Scientist es tendencia por récord de reproducciones y cantidad de personas que le gusta el tema.")
    public void verificarCancionEsTendencia() {
        scientist.setCantReproducciones(50001);
        scientist.setCantLikes(20001);
        scientist.evaluarCambioPopularidad();

        Assertions.assertEquals(Tendencia.class, scientist.getPopularidad().getClass());
    }

}
