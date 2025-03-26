import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Materia SyPN = new Materia(new ArrayList<>(), new ArrayList<>());
        Materia AyED = new Materia(new ArrayList<>(), new ArrayList<>());
        Materia LyED = new Materia(new ArrayList<>(), new ArrayList<>());
        Materia IT1 = new Materia(new ArrayList<>(), new ArrayList<>());

        // Materias con requisitos para cursar y aprobar
        Materia AdS = new Materia(List.of(SyPN, AyED), new ArrayList<>());
        Materia PdP = new Materia(List.of(LyED, AyED), new ArrayList<>());
        Materia DSI = new Materia(List.of(AdS, PdP), List.of(IT1, AyED, SyPN));

        Alumno alumno1 = new Alumno("Juan", List.of(AdS, PdP), List.of(IT1, AyED, SyPN));

        Inscripcion inscripcion = new Inscripcion(alumno1,List.of(DSI));

        System.out.println(inscripcion.aprobada());

    }
}
