package aulaVirtual;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProfesorPruebas {
    @Test
    public void pruebaCalificarAlumno_ProfesorImparteAsig() {
        Profesor profesor = new Profesor("Roberto Martínez", "roberto@mail.com");
        Alumno alumno = new Alumno("Jose García", "jose@mail.com");
        Asignatura programacion = new Asignatura("Programacion");

        profesor.inscribirAsignatura(programacion);
        alumno.inscribirAsignatura(programacion);

        boolean resultado = profesor.calificarAlumno(alumno, programacion, 90);

        assertTrue(resultado);
        assertEquals(90, alumno.obtenerNota(programacion));
    }
    @Test
    public void pruebaCalificarAlumno_ProfesorNoImparteAsig() {
        Profesor profesor = new Profesor("Francisco Gutierrez", "francisco@mail.com");
        Alumno alumno = new Alumno("Victor Hernández", "victor@mail.com");
        Asignatura historia = new Asignatura("Historia");

        boolean resultado = profesor.calificarAlumno(alumno, historia, 70);

        assertFalse(resultado);
        assertEquals(-1, alumno.obtenerNota(historia));
    }
}
