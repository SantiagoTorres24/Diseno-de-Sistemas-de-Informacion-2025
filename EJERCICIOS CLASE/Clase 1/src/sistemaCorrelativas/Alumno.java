package sistemaCorrelativas;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Setter
@Getter

public class Alumno {
        String nombre;
        List<Materia> materiasCursadas;
        List<Materia> materiasAprobadas;

        public Alumno(String nombre) {
            this.nombre = nombre;
            this.materiasCursadas = new ArrayList<Materia>();
            this.materiasAprobadas = new ArrayList<Materia>();
        }

        public void agregarMateriasCursadas(Materia ... materiasCursadas) {
            Collections.addAll(this.materiasCursadas, materiasCursadas);
        }

        public void agregarMateriasAprobadas(Materia ... materiasAprobadas) {
            Collections.addAll(this.materiasAprobadas, materiasAprobadas);
        }

        public boolean curso(Materia materia){
            return materiasCursadas.contains(materia);
        }

        public boolean aprobo(Materia materia){
            return materiasAprobadas.contains(materia);
        }

    }

