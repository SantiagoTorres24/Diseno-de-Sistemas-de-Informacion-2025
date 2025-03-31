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
            Collections.addAll(this.materiasCursadas, materiasAprobadas); // En caso de alguna promoción, tmb agrega la materia a las cursadas          
        }

        public boolean curso(Materia materia){
            List<Materia> cursadasSinRepetidos = this.materiasCursadas..stream().distinct().collect(Collectors.toList());
            return materiasCursadas.contains(materia);
        }

        public boolean aprobo(Materia materia){
            return materiasAprobadas.contains(materia);
        }

    }

