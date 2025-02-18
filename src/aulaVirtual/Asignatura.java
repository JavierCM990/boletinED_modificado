package aulaVirtual;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una asignatura en el aula virtual.
 * Una asignatura tiene un nombre y un profesor encargado.
 */
public class Asignatura {
    private String nombre;
    private Profesor profesor;
    private List<Alumno> alumnos;

    public Asignatura(String nombre) {
        this.nombre = nombre;
        this.profesor = null;
        this.alumnos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void agreagarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void eliminarAlumno(Alumno alumno) {
        for (Alumno a : this.alumnos) {
            if (a.getNombre().equals(alumno.nombre)) alumnos.remove(a);
        }
    }

    public void calcularPromedioNotas() {
        if (alumnos.isEmpty()) {
            System.out.println("Alumno no encontrado en " + nombre);
            return;
        }

        int sumaNotas = 0;
        int alumnosConNotas = 0;

        for (Alumno alumno : alumnos) {
            int nota = alumno.obtenerNota(this);
            if (nota >= 0) {
                sumaNotas += nota;
                alumnosConNotas++;
            }
        }

        if (alumnosConNotas > 0) {
            double promedio = (double) sumaNotas / alumnosConNotas;
            System.out.println("Promedio de notas con alumno " + nombre + ": " + promedio);
        } else {
            System.out.println("Alumno no encontrado en " + nombre);
        }
    }
}
