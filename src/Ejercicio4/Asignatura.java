package Ejercicio4;

import Ejercicio3.ElementoSE;
import Ejercicio3.ListaSimplementeEnlazada;
import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Asignatura {
    private String nombreAsignatura;
    private Estudiante student;
    private ListaSimplementeEnlazada<Estudiante> estudiantes;

    public Asignatura(String nombreAsignatura, ListaSimplementeEnlazada<Estudiante> alumnado) {
        this.nombreAsignatura = nombreAsignatura;
        this.estudiantes = alumnado;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public Estudiante getEstudiante(Estudiante student) {
        return student;
    }

    public ListaSimplementeEnlazada<Estudiante> addEstudiante( Estudiante student) {
        estudiantes.add(student);
        return estudiantes;
    }

    public ListaSimplementeEnlazada<Estudiante> deleteEstudiane(Estudiante student) {
        estudiantes.delete(student);
        return estudiantes;
    }

    public ListaSimplementeEnlazada<Estudiante> getTodosLosEstudiantes() {
        return this.estudiantes;
    }

    public int ratioAsignatura() {
        return estudiantes.getNumElementos();
    }

    public String toString() {
        return "Asignatura[ nombreAsingatura:" + getNombreAsignatura() + " student: " + getEstudiante(student) +
                " todos los estudiantes " + getTodosLosEstudiantes() + " ratio " + ratioAsignatura() + "]";
    }

    public static void saveAsignatura(String rutaArchivo, Asignatura l) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            gson.toJson(l, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String loadAsignatura(String rutaArchivo, Asignatura l) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(rutaArchivo)) {
            gson.fromJson(reader, Asignatura.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return rutaArchivo;
    }

    public static void main(String[] args) {


        Estudiante alumno1 = new Estudiante("alumno1", 18, "@alumno1.com");
        Estudiante alumno2 = new Estudiante("alumno2", 19, "@alumno2.com");
        Estudiante alumno3 = new Estudiante("alumno3", 18, "@alumno3.com");
        Estudiante alumno4 = new Estudiante("alumno4", 19, "@alumno4.com");
        ListaSimplementeEnlazada<Estudiante> alumnado = new ListaSimplementeEnlazada<>();
        Asignatura l1 = new Asignatura("Java", alumnado);

        l1.addEstudiante(alumno1);
        l1.addEstudiante(alumno4);
        l1.addEstudiante(alumno2);
        l1.deleteEstudiane(alumno1);
        l1.addEstudiante(alumno3);

        System.out.println(l1.getEstudiante(alumno1));
        System.out.println(l1.getTodosLosEstudiantes());
        System.out.println(l1.toString());



        String rutaArchivo = "src/Ejercicio4/JSON/Asignatura.json";
        saveAsignatura(rutaArchivo, l1);
        loadAsignatura(rutaArchivo, l1);
    }
}