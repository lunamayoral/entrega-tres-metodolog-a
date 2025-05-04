package Ejercicio4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Ejercicio4.Asignatura;
import Ejercicio3.ListaSimplementeEnlazada;
import Ejercicio4.Estudiante;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import com.google.gson.Gson;


class AsignaturaTest {





    @Test
    void getNombreAsignatura() {
        ListaSimplementeEnlazada<Estudiante> alumnado =new ListaSimplementeEnlazada<>();
        Asignatura name = new Asignatura("Java",alumnado);
        assertEquals(name.getNombreAsignatura(),"Java");
    }

    @Test
    void getEstudiante() {
        Estudiante alumno1 = new Estudiante("alumno1", 18, "@alumno1.com");
        Estudiante alumno2 = new Estudiante("alumno2", 19, "@alumno2.com");
        Estudiante alumno3 = new Estudiante("alumno3", 18, "@alumno3.com");
        Estudiante alumno4 = new Estudiante("alumno4", 19, "@alumno4.com");
        ListaSimplementeEnlazada<Estudiante> alumnado = new ListaSimplementeEnlazada<>();
        Asignatura materia = new Asignatura("Java", alumnado);

        materia.addEstudiante(alumno1);
        materia.addEstudiante(alumno4);
        materia.addEstudiante(alumno2);
        materia.deleteEstudiante(alumno1);
        materia.addEstudiante(alumno3);

        assertEquals(materia.getEstudiante(alumno1).toString(), alumno1.toString());
    }


    @Test
    void addEstudiante() {
        Estudiante alumno1 = new Estudiante("alumno1", 18, "@alumno1.com");
        Estudiante alumno2 = new Estudiante("alumno2", 19, "@alumno2.com");
        Estudiante alumno3 = new Estudiante("alumno3", 18, "@alumno3.com");
        Estudiante alumno4 = new Estudiante("alumno4", 19, "@alumno4.com");
        ListaSimplementeEnlazada<Estudiante> alumnado = new ListaSimplementeEnlazada<>();
        Asignatura materia = new Asignatura("Java", alumnado);

        materia.addEstudiante(alumno1);
        materia.addEstudiante(alumno4);
        materia.addEstudiante(alumno2);
        materia.deleteEstudiante(alumno1);
        materia.addEstudiante(alumno3);
        assertEquals(materia.ratioAsignatura(),3);
        Estudiante alumno5 = new Estudiante("alumno5", 20, "@alumno5.com");
        materia.addEstudiante(alumno5);
        assertEquals(materia.ratioAsignatura(),4);

    }

    @Test
    void deleteEstudiante() {
        Estudiante alumno1 = new Estudiante("alumno1", 18, "@alumno1.com");
        Estudiante alumno2 = new Estudiante("alumno2", 19, "@alumno2.com");
        Estudiante alumno3 = new Estudiante("alumno3", 18, "@alumno3.com");
        Estudiante alumno4 = new Estudiante("alumno4", 19, "@alumno4.com");
        ListaSimplementeEnlazada<Estudiante> alumnado = new ListaSimplementeEnlazada<>();
        Asignatura materia = new Asignatura("Java", alumnado);

        materia.addEstudiante(alumno1);
        materia.addEstudiante(alumno4);
        materia.addEstudiante(alumno2);
        materia.deleteEstudiante(alumno1);
        materia.addEstudiante(alumno3);
        assertEquals(materia.ratioAsignatura(),3);

        materia.deleteEstudiante(alumno2);
        assertEquals(materia.ratioAsignatura(),2);
    }



    @Test
    void ratioAsignatura() {
        Estudiante alumno1 = new Estudiante("alumno1", 18, "@alumno1.com");
        Estudiante alumno2 = new Estudiante("alumno2", 19, "@alumno2.com");
        Estudiante alumno3 = new Estudiante("alumno3", 18, "@alumno3.com");
        Estudiante alumno4 = new Estudiante("alumno4", 19, "@alumno4.com");
        ListaSimplementeEnlazada<Estudiante> alumnado = new ListaSimplementeEnlazada<>();
        Asignatura materia = new Asignatura("Java", alumnado);

        materia.addEstudiante(alumno1);
        materia.addEstudiante(alumno4);
        materia.addEstudiante(alumno2);
        materia.deleteEstudiante(alumno1);
        materia.addEstudiante(alumno3);

        assertEquals(materia.ratioAsignatura(),3);
    }




    @Test
    void saveAsignatura() {
        String rutaArchivo = "src/Ejercicio4/JSON/AsignaturaTest.json";
        ListaSimplementeEnlazada<Estudiante> alumnado = new ListaSimplementeEnlazada<>();
        Asignatura asignatura = new Asignatura("Java", alumnado);

        // Agregar estudiantes
        asignatura.addEstudiante(new Estudiante("Alumno1", 18, "@correo1.com"));
        asignatura.addEstudiante(new Estudiante("Alumno2", 19, "@correo2.com"));

        // Guardar en JSON
        Asignatura.saveAsignatura(rutaArchivo, asignatura);

        // Verificar que el archivo existe
        File file = new File(rutaArchivo);
        assertTrue(file.exists(), "El archivo no fue creado correctamente.");
    }



    @Test
    void loadAsignatura() {
        String rutaArchivo = "src/Ejercicio4/JSON/AsignaturaTest.json";
        ListaSimplementeEnlazada<Estudiante> alumnado = new ListaSimplementeEnlazada<>();
        Asignatura asignaturaOriginal = new Asignatura("Java", alumnado);

        // Agregar estudiantes
        asignaturaOriginal.addEstudiante(new Estudiante("Alumno1", 18, "@correo1.com"));
        asignaturaOriginal.addEstudiante(new Estudiante("Alumno2", 19, "@correo2.com"));

        // Guardar en JSON
        Asignatura.saveAsignatura(rutaArchivo, asignaturaOriginal);

        // Cargar desde JSON
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(rutaArchivo)) {
            Asignatura asignaturaCargada = gson.fromJson(reader, Asignatura.class);

            assertNotNull(asignaturaCargada, "El archivo no se cargó correctamente.");
            assertEquals(asignaturaOriginal.getNombreAsignatura(), asignaturaCargada.getNombreAsignatura(), "El nombre de la asignatura no coincide.");
            assertEquals(asignaturaOriginal.ratioAsignatura(), asignaturaCargada.ratioAsignatura(), "El número de estudiantes no coincide.");
        } catch (IOException e) {
            fail("Error al leer el archivo JSON.");
        }
    }



}