import java.util.ArrayList;
import java.util.List;


class Inscripcion {
    private final Alumno alumno;
    private final List<Materia> materias;

    public Inscripcion(Alumno alumno, List<Materia> materias) {
        this.alumno = alumno;
        this.materias = materias != null ? materias : new ArrayList<>();
    }

    public boolean aprobada(){
        return materias.stream().allMatch(materia -> materia.alumnoPuedeCursar(alumno));
    }

}

class Alumno {
    String nombre;
    List<Materia> materiasCursadas;
    List<Materia> materiasAprobadas;

    public Alumno(String nombre, List<Materia> materiasCursadas, List<Materia> materiasAprobadas) {
        this.nombre = nombre;
        this.materiasCursadas = materiasCursadas != null ? materiasCursadas : new ArrayList<>(); // Evitar NullPointerException
        this.materiasAprobadas = materiasAprobadas != null ? materiasAprobadas : new ArrayList<>();
    }

    public boolean curso(Materia materia){
        return materiasCursadas.contains(materia);
    }

    public boolean aprobo(Materia materia){
        return materiasAprobadas.contains(materia);
    }

}

class Materia {
    List<Materia> cursadasNecesarias;
    List<Materia> aprobadasNecesarias;

    public Materia(List<Materia> cursadasNecesarias, List<Materia> aprobadasNecesarias) {
        this.cursadasNecesarias = cursadasNecesarias != null ? cursadasNecesarias : new ArrayList<>();
        this.aprobadasNecesarias = aprobadasNecesarias != null ? aprobadasNecesarias : new ArrayList<>();
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
