package Ejercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    @Test
    void getNombre() {
        Persona personaprueba = new Persona("Luna", 22);
        assertEquals("Luna", personaprueba.getNombre());
    }

    @Test
    void setNombre() {
        Persona personaprueba = new Persona("Luna", 22);
        personaprueba.setNombre("Luni");
        assertEquals("Luni", personaprueba.getNombre());
    }

    @Test
    void getEdad() {
        Persona personaprueba = new Persona("Luna", 22);
        assertEquals(22, personaprueba.getEdad());
    }

    @Test
    void setEdad() {
        Persona personaprueba = new Persona("Luna", 22);
        personaprueba.setEdad(23);
        assertEquals(23, personaprueba.getEdad());
    }
}