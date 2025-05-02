package Ejercicio3;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class Persona2Test {

    @Test
    void main() {
        String RUTA_ARCHIVO = "src/Ejercicio3/JSON/Persona2.json";

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        Persona2.main(new String[]{});

        System.setOut(originalOut);


        String output = outputStream.toString();
        String expectedJson = "{\"nombre\":\"Juan\",\"edad\":30,\"hobbies\":[\"Fútbol\",\"Cine\",\"Lectura\"]}";
        assertTrue(output.contains(expectedJson), "La salida debe contener el JSON esperado.");


        assertTrue(Files.exists(Paths.get(RUTA_ARCHIVO)), "El archivo JSON no fue creado.");
        try {
            String jsonFromFile = new String(Files.readAllBytes(Paths.get(RUTA_ARCHIVO)));
            assertEquals(expectedJson, jsonFromFile, "El contenido del archivo JSON debe coincidir con el JSON esperado.");
        } catch (IOException e) {
            fail("No se pudo leer el archivo JSON: " + e.getMessage());
        }
    }

}