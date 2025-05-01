package Proyecto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class DatosAlumnoTest {

    @Test
    void getNombre() {
        DatosAlumno alumno=new DatosAlumno("pepe", 23,"pepe@gmail.com");
        assertEquals("pepe", alumno.getNombre());
    }

    @Test
    void getEdad() {
        DatosAlumno alumno=new DatosAlumno("pepe", 23,"pepe@gmail.com");
        assertEquals(23, alumno.getEdad());
    }

    @Test
    void getCorreo() {
        DatosAlumno alumno=new DatosAlumno("pepe", 23,"pepe@gmail.com");
        assertEquals("pepe@gmail.com", alumno.getCorreo());
    }

    @Test
    void testToString() {
        DatosAlumno alumno=new DatosAlumno("pepe", 23,"pepe@gmail.com");
        assertEquals( "Nombre: pepe, Edad: 23, Correo: pepe@gmail.com", alumno.toString());
    }
}