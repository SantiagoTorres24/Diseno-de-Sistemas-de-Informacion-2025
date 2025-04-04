import Estructuras.Coleccion;
import Estructuras.Hecho;
import Personas.Administrador;
import Personas.Contribuyente;
import Personas.Visualizador;

public class Main {
    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("santi");
        Administrador admin = new Administrador();

        Coleccion coleccion = new Coleccion("Titulo", "Descripcion", admin);
        Hecho h = new Hecho("TituloHecho1", "Descripcion1", "Categoria1");
        Hecho h2 = new Hecho("TituloHecho2", "Descripcion2", "Categoria2");
        Hecho h3  = new Hecho("TituloHecho3", "Descripcion3", "Categoria3");

        coleccion.agregarHecho(h, h2, h3);

        contribuyente.solicitarEliminarHecho(coleccion, h, "La historia de la humanidad está marcada por constantes avances, descubrimientos y transformaciones que han definido el rumbo de las civilizaciones. Desde el dominio del fuego hasta la revolución digital, cada etapa ha traído consigo un cambio radical en la forma en que vivimos, trabajamos y nos relacionamos. El conocimiento acumulado ha permitido que las sociedades evolucionen, superando obstáculos y alcanzando nuevas metas. Sin embargo, también nos enfrenta a desafíos cada vez más complejos, como el cambio climático, la desigualdad social y el uso responsable de la tecnología. Estos retos exigen cooperación global, conciencia crítica y compromiso con el futuro. A medida que el mundo continúa su camino hacia lo desconocido, el papel de la educación, la ética y la innovación se vuelve más importante que nunca.");

        coleccion.mostrar();
    }
}
