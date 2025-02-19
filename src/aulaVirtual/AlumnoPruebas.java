package aulaVirtual;

import org.junit.Test;
import static org.junit.Assert.*;

public class AlumnoPruebas {
    @Test
    public void PruebaObtenerNota_AsignaturaConNota() {
        Alumno alumno = new Alumno("Nicolás Caballero", "nicolas@mail.com");
        Asignatura matematicas = new Asignatura("Matemáticas");
        alumno.inscribirAsignatura(matematicas);
        alumno.asignarNota(matematicas, 85);

        assertEquals(85, alumno.obtenerNota(matematicas));
    }
    @Test
    public void pruebaObtenerNota_AsignaturaSinNota() {
        Alumno alumno = new Alumno("Nicolas", "nicolas@mail.com");
        Asignatura historia = new Asignatura("Historia");

        assertEquals(-1, alumno.obtenerNota(historia));
    }
}
