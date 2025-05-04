package Ejercicio4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstudianteTest {

    @Test
    void getNombre() {
        Estudiante student = new Estudiante("Platón", 23, "@elplatonico.com");
        assertEquals(student.getNombre(), "Platón");
    }

    @Test
    void setNombre() {
        Estudiante student = new Estudiante("Platón", 23, "@elplatonico.com");
        student.setNombre("Aristóteles");
        assertEquals(student.getNombre(), "Aristóteles");
    }

    @Test
    void getEdad() {
        Estudiante student = new Estudiante("Platón", 23, "@elplatonico.com");
        assertEquals(student.getEdad(), 23);
    }

    @Test
    void setEdad() {
        Estudiante student = new Estudiante("Platón", 23, "@elplatonico.com");
        student.setEdad(57);
        assertEquals(student.getEdad(), 57);
    }

    @Test
    void getCorreo() {
        Estudiante student = new Estudiante("Platón", 23, "@elplatonico.com");
        assertEquals(student.getCorreo(),"@elplatonico.com" );
    }

    @Test
    void setCorreo() {
        Estudiante student = new Estudiante("Platón", 23, "@elplatonico.com");
        student.setCorreo("@terminomedio.com");
        assertEquals(student.getCorreo(),"@terminomedio.com" );
    }
    @Test
    void equals(){


        Estudiante estudiante1 = new Estudiante("Platón1", 24, "@elplatonico1.com");
        Estudiante estudiante2 = new Estudiante("Platón2", 23, "@elplatonico2.com");
        Estudiante estudiante3 = new Estudiante("Platón3", 25, "@elplatonico3.com");

        assertNotEquals(estudiante1, estudiante2);
        assertEquals(estudiante1, estudiante1);
        assertNotEquals(estudiante1, estudiante3);
        assertNotEquals(estudiante1, null);
        assertNotEquals(estudiante1, new Object());
    }


    @Test
    void testToString() {
        Estudiante student = new Estudiante("Sócrates", 89, "@solosequenosenada.com");
        assertEquals(student.toString(),"Estudiante[ nombre:Sócrates edad: 89 correo: @solosequenosenada.com]");
    }
}