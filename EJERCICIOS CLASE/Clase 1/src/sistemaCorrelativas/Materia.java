package sistemaCorrelativas;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Setter
@Getter

public class Materia {
    private List<Materia> cursadasNecesarias;
    private List<Materia> aprobadasNecesarias;

    public Materia() {
        this.cursadasNecesarias = new ArrayList<Materia>();
        this.aprobadasNecesarias = new ArrayList<Materia>();
    }

    public void agregarCursadaNecesarias(Materia ... materiasCursadas) {
        Collections.addAll(this.cursadasNecesarias, materiasCursadas);
    }

    public void agregarAprobadasNecesarias(Materia ... materiasAprobadas) {
        Collections.addAll(this.aprobadasNecesarias, materiasAprobadas);
    }

    public boolean alumnoPuedeCursar(Alumno alumno){
        return this.cumpleCursadas(alumno) && this.cumpleAprobadas(alumno);
    }

    public boolean cumpleCursadas(Alumno alumno){
        return cursadasNecesarias.stream().allMatch(cursada -> alumno.curso(cursada));
    }

    public boolean cumpleAprobadas(Alumno alumno){
        return aprobadasNecesarias.stream().allMatch(aprobada -> alumno.aprobo(aprobada));
    }
}

