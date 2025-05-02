package Ejercicios;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
class Main2Test {

    @Test
    void main() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        String[] args = {"test1", "test2"};
        Main2.main(args);
        System.setOut(originalOut);

        String output = outputStream.toString();
        assertTrue(output.contains("Argumento 0: test1"));
        assertTrue(output.contains("Argumento 1: test2"));

        assertTrue(output.contains("Argumentos:"));

        Main2.Usuario usuario = new Main2.Usuario("Luna", 22, "luni@example.com");
        assertEquals("Luna", usuario.nombre);
        assertEquals(22, usuario.edad);
        assertEquals("luni@example.com", usuario.correo);
    }

    @Test
    void main_usuarioNoCargado() {
        File archivo = new File("usuario.json");
        if (archivo.exists()) {
            boolean eliminado = archivo.delete();
            if (!eliminado) {
                throw new RuntimeException("No se pudo eliminar usuario.json para el test");
            }
        }
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        String[] args = {};
        Main2.main(args);
        System.setOut(originalOut);
        String output = outputStream.toString();
        assertTrue(output.contains("No se pudo cargar el usuario."));
    }
}