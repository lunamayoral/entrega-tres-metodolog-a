package Proyecto;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void fichero() {
        String testFile = "testfile.json";

        boolean initResult = Main.fichero("init", testFile);
        assertTrue(initResult);
        File file = new File(testFile);
        assertTrue(file.exists());

        boolean showResult = Main.fichero("show", testFile);
        assertTrue(showResult);

        if (file.exists()) {
            file.delete();
        }
    }

    @Test
    void fichero_test_excepciones() {
        String testFile = "testfile.json";

        assertDoesNotThrow(() -> {
            boolean initResult = Main.fichero("init", testFile);
            assertTrue(initResult);
            File file = new File(testFile);
            assertTrue(file.exists());
        });

        assertDoesNotThrow(() -> {
            boolean showResult = Main.fichero("show", testFile);
            assertTrue(showResult);
        });

        assertDoesNotThrow(() -> {
            boolean result = Main.fichero("show", "archivo_inexistente.json");
            assertFalse(result);
        });

        assertDoesNotThrow(() -> {
            String rutaInvalida = "/root/archivo_invalido.json";
            boolean result = Main.fichero("init", rutaInvalida);
        });

        File file = new File(testFile);
        if (file.exists()) {
            file.delete();
        }

        File invalidFile = new File("/root/archivo_invalido.json");
        if (invalidFile.exists()) {
            invalidFile.delete();
        }
    }

    @Test
    void main() {
        String testFile = "testmain.json";
        String[] argsOk = {"init", testFile};
        Main.main(argsOk);
        File file = new File(testFile);
        assertTrue(file.exists());

        if (file.exists()) {
            file.delete();
        }
    }

    @Test
    void main_test_excepciones() {
        String testFile = "testmain.json";
        assertDoesNotThrow(() -> {
            String[] argsOk = {"init", testFile};
            Main.main(argsOk);
            File file = new File(testFile);
            assertTrue(file.exists());
        });
        File file = new File(testFile);
        if (file.exists()) {
            file.delete();
        }
        assertDoesNotThrow(() -> {
            String[] argsBad = {"onlyonearg"};
            Main.main(argsBad);
        });
    }

}





