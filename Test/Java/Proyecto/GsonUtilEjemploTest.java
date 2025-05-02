package Proyecto;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class GsonUtilEjemploTest {
    private static final String RUTA_ARCHIVO = "test_usuario.json";

    @Test
    void guardarObjetoEnArchivo() {
        DatosAlumno alumno = new DatosAlumno("Carlos", 25, "carlos@example.com");
        String rutaInvalida = "/ruta/que/no/existe/test.json";

        GsonUtilEjemplo.guardarObjetoEnArchivo(RUTA_ARCHIVO, alumno);
        GsonUtilEjemplo.guardarObjetoEnArchivo(RUTA_ARCHIVO, null);

        assertTrue(Files.exists(Paths.get(RUTA_ARCHIVO)), "El archivo no fue creado.");
        assertDoesNotThrow(() -> GsonUtilEjemplo.guardarObjetoEnArchivo(rutaInvalida, alumno));
}


    @Test
    void cargarObjetoDesdeArchivo() {
        DatosAlumno usuarioEsperado = new DatosAlumno("Ana", 28, "ana@example.com");
        GsonUtilEjemplo.guardarObjetoEnArchivo(RUTA_ARCHIVO, usuarioEsperado);
        String rutaInvalida = "/ruta/que/no/existe/test.json";

        DatosAlumno usuarioCargado = GsonUtilEjemplo.cargarObjetoDesdeArchivo(RUTA_ARCHIVO, DatosAlumno.class);

        assertDoesNotThrow(() -> {
            Object result = GsonUtilEjemplo.cargarObjetoDesdeArchivo(rutaInvalida, Object.class);
            assertNull(result, "El resultado debe ser null si ocurre IOException.");
        assertNotNull(usuarioCargado, "El usuario cargado no debe ser nulo.");
        assertEquals(usuarioEsperado.getNombre(), usuarioCargado.getNombre(), "Los nombres deben coincidir.");
        assertEquals(usuarioEsperado.getEdad(), usuarioCargado.getEdad(), "Las edades deben coincidir.");
        assertEquals(usuarioEsperado.getCorreo(), usuarioCargado.getCorreo(), "Los correos deben coincidir.");
        });
    }


    @Test
    void main() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        String[] args = {"arg1", "arg2", "arg3"};
        GsonUtilEjemplo.main(args);

        System.setOut(originalOut);

        String output = outputStream.toString();
        assertTrue(output.contains("Argumento 0: arg1"), "La salida debe contener el primer argumento.");
        assertTrue(output.contains("Argumento 1: arg2"), "La salida debe contener el segundo argumento.");
        assertTrue(output.contains("Argumento 2: arg3"), "La salida debe contener el tercer argumento.");
        assertTrue(output.contains("Usuario cargado: Juan"), "La salida debe indicar que el usuario fue cargado.");

        DatosAlumno usuarioCargado = GsonUtilEjemplo.cargarObjetoDesdeArchivo(RUTA_ARCHIVO, DatosAlumno.class);
        assertNotNull(usuarioCargado, "El usuario cargado no debe ser nulo.");
        assertEquals("Ana", usuarioCargado.getNombre(), "El nombre del usuario debe ser Ana.");
        assertEquals(28, usuarioCargado.getEdad());
        assertEquals("ana@example.com", usuarioCargado.getCorreo());
    }
}