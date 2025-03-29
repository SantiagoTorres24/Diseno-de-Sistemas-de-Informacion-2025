package Tests;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import sistemaCorrelativas.Alumno;
import sistemaCorrelativas.Inscripcion;
import sistemaCorrelativas.Materia;

import static org.junit.jupiter.api.Assertions.*;

public class AlumnoTest {
    @Test
    @DisplayName("Test para verificar que una inscripcion a materias fue aprobada")

    public void verificarInscripcionAProbada() {
        Alumno alumno = new Alumno("Santiago Torres");

        Materia AYED = new Materia();
        Materia SyPN = new Materia();
        Materia PdP = new Materia();
        Materia IT1 = new Materia();
        Materia AdS = new Materia();

        Materia DSI = new Materia();
        DSI.agregarCursadaNecesarias(PdP, AdS);
        DSI.agregarAprobadasNecesarias(AYED, SyPN, IT1);

        alumno.agregarMateriasCursadas(PdP, AdS);
        alumno.agregarMateriasAprobadas(AYED, SyPN, IT1);

        Inscripcion inscripcion = new Inscripcion(alumno);
        inscripcion.agregarMateriaAInscripcion(DSI);

        Assertions.assertTrue(inscripcion.aprobada());
    }

    @Test
    @DisplayName("Test para verificar que una inscripción a materias fue rechazada")
    public void verificarInscripcionRechazada() {
        Alumno alumno = new Alumno("Santiago Torres");

        Materia AYED = new Materia();
        Materia SyPN = new Materia();
        Materia PdP = new Materia();
        Materia IT1 = new Materia();
        Materia AdS = new Materia();

        Materia DSI = new Materia();
        DSI.agregarCursadaNecesarias(PdP, AdS);
        DSI.agregarAprobadasNecesarias(AYED, SyPN, IT1);

        alumno.agregarMateriasCursadas(PdP, AdS);
        alumno.agregarMateriasAprobadas(AYED);

        Inscripcion inscripcion = new Inscripcion(alumno);
        inscripcion.agregarMateriaAInscripcion(DSI);

        Assertions.assertFalse(inscripcion.aprobada());
    }


}