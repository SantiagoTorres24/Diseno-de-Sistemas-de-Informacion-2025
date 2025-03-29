package sistemaCorrelativas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import sistemaCorrelativas.Alumno;

@Setter
@Getter


public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias;

    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.materias = new ArrayList<Materia>();
    }

    public boolean aprobada(){
        return materias.stream().allMatch(materia -> materia.alumnoPuedeCursar(alumno));
    }

    public void agregarMateriaAInscripcion(Materia ... materias){
        Collections.addAll(this.materias, materias);
    }

}
