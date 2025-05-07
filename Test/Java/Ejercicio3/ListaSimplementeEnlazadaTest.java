package Ejercicio3;

import org.junit.jupiter.api.Test;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class ListaSimplementeEnlazadaTest {

    @Test
    void add() {
        ElementoSE<Integer> elemento1 = new ElementoSE<>(1);
        ListaSimplementeEnlazada<Integer> lista = new ListaSimplementeEnlazada<>(elemento1);
        assertTrue(lista.add(4));
        assertTrue(lista.add(5));
        assertEquals(3, lista.getNumElementos());
        assertEquals(5, lista.getCabeza().getDato());
        ListaSimplementeEnlazada<Integer> lista2 = new ListaSimplementeEnlazada<>();
        assertTrue(lista2.add(4));
        assertEquals(1, lista2.getNumElementos());
    }

    @Test
    void delete() {
        ListaSimplementeEnlazada<Integer> lista = new ListaSimplementeEnlazada<>();
        // Caso 1: Eliminar un elemento del medio
        lista.add(1); // 1
        lista.add(2); // 2 -> 1
        lista.add(3); // 3 -> 2 -> 1
        lista.delete(2);
        assertEquals(2, lista.getNumElementos());
        assertEquals(3, lista.getCabeza().getDato()); // Ahora la cabeza debe ser 3

        // Caso 2: Eliminar el primer elemento
        lista.delete(3);
        assertEquals(1, lista.getNumElementos());
        assertEquals(1, lista.getCabeza().getDato()); // Ahora la cabeza debe ser 1

        // Caso 3: Eliminar el último elemento
        lista.delete(1);
        assertTrue(lista.isEmpty()); // La lista debe estar vacía

        // Caso 4: Intentar eliminar un elemento que no existe
        assertFalse(lista.delete(5)); // No debe eliminar nada, ya que la lista está vacía

        // Caso 5: Eliminar de una lista vacía
        ListaSimplementeEnlazada<Integer> listaVacia = new ListaSimplementeEnlazada<>();
        assertFalse(listaVacia.delete(1)); // No debe eliminar nada, ya que la lista está vacía

        // Caso 6: Eliminar un elemento que no existe en una lista no vacía
        lista.add(4); // 4
        lista.add(3); // 3 -> 4
        assertFalse(lista.delete(5)); // No debe eliminar nada, ya que 5 no está en la lista
        assertEquals(2, lista.getNumElementos()); // La lista debe seguir teniendo 2 elementos
        assertEquals(3, lista.getCabeza().getDato()); // La cabeza debe seguir siendo 3

    }

    @Test
    void getNumElementos() {
        ListaSimplementeEnlazada<Integer> lista = new ListaSimplementeEnlazada<>();
        lista.add(4);
        lista.add(3);
        assertEquals(2, lista.getNumElementos());
    }

    @Test
    void getIterador() {
        ListaSimplementeEnlazada<Integer> lista = new ListaSimplementeEnlazada<>();
        // Agregar elementos a la lista
        lista.add(1);
        lista.add(2);
        lista.add(3);

        // Obtener el iterador
        IIterador<Integer> iterador = lista.getIterador();

        // Verificar que el iterador tiene elementos
        assertTrue(iterador.hasNext());

        // Verificar los elementos en el orden correcto
        assertEquals(3, iterador.next());
        assertEquals(2, iterador.next());
        assertEquals(1, iterador.next());

        // Verificar que no hay más elementos
        assertFalse(iterador.hasNext());
    }

    @Test
    void getCabeza() {
        ListaSimplementeEnlazada<Integer> lista = new ListaSimplementeEnlazada<>();
        lista.add(4);
        lista.add(3);
        assertEquals(3, lista.getCabeza().getDato());
    }

    @Test
    void setCabeza() {
        ListaSimplementeEnlazada<Integer> lista = new ListaSimplementeEnlazada<>();
        lista.add(4);
        lista.add(3);
        ElementoSE<Integer> elemento1 = new ElementoSE<>(1);
        lista.setCabeza(elemento1);
        assertEquals(1, lista.getCabeza().getDato());
    }

    @Test
    void isEmpty() {
        ListaSimplementeEnlazada<Integer> lista = new ListaSimplementeEnlazada<>();
        assertTrue(lista.isEmpty());
        lista.add(4);
        assertFalse(lista.isEmpty());
    }

    @Test
    void getUltimo() {
        ListaSimplementeEnlazada<Integer> lista = new ListaSimplementeEnlazada<>();
        assertNull(lista.getUltimo());
        lista.add(4);
        lista.add(3);
        assertEquals(4, lista.getUltimo().getDato());
    }

    @Test
void testToString(){
    ListaSimplementeEnlazada<String> lista = new ListaSimplementeEnlazada<>();
       lista.add("Alumno1");
       lista.add("Alumno2");
       assertEquals( lista.toString(),"Lista de Estudiantes:\n" +
             "Alumno2\n" +
              "Alumno1");
       lista = new ListaSimplementeEnlazada<>();
       assertNull(lista.toString());
}



    @Test
    void main() {
        String RUTA_ARCHIVO = "src/Ejercicio3/JSON/ListaSimplementeEnlazada.json";
        // Call the main method that builds the list and saves it
        ListaSimplementeEnlazada.main(new String[]{}); // <--- Replace YourClassName with actual class name holding main

        // Check file was created
        assertTrue(Files.exists(Paths.get(RUTA_ARCHIVO)), "The JSON file was not created.");

        try {
            String jsonContent = new String(Files.readAllBytes(Paths.get(RUTA_ARCHIVO)));
            // Basic checks for the presence of list values in JSON string
            assertTrue(jsonContent.contains("\"0\""), "JSON should include the first node value '0'.");
            assertTrue(jsonContent.contains("\"1\""), "JSON should include the value '1'.");
            assertTrue(jsonContent.contains("\"2\""), "JSON should include the value '2'.");
            assertTrue(jsonContent.contains("\"3\""), "JSON should include the value '3'.");
            assertTrue(jsonContent.contains("\"5\""), "JSON should include the value '5'.");
            assertTrue(jsonContent.contains("\"8\""), "JSON should include the value '8'.");
        } catch (Exception e) {
            fail("Could not read JSON file: " + e.getMessage());
        }
    }
}
