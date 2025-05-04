package Ejercicio4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Ejercicio3.ListaSimplementeEnlazada;




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

        assertEquals(materia.addEstudiante(alumno5).toString(),"Lista de Estudiantes:\n" +
                "Estudiante[ nombre:alumno5 edad: 20 correo: @alumno5.com]\n" +
                "Estudiante[ nombre:alumno3 edad: 18 correo: @alumno3.com]\n" +
                "Estudiante[ nombre:alumno2 edad: 19 correo: @alumno2.com]\n" +
                "Estudiante[ nombre:alumno4 edad: 19 correo: @alumno4.com]");

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

        assertEquals(materia.deleteEstudiante(alumno2).toString(),"Lista de Estudiantes:\n" +
                "Estudiante[ nombre:alumno3 edad: 18 correo: @alumno3.com]\n" +
                "Estudiante[ nombre:alumno4 edad: 19 correo: @alumno4.com]");
    }

    @Test
    void getTodosLosEstudiantes(){
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

        assertEquals(materia.getTodosLosEstudiantes().toString(),"Lista de Estudiantes:\n" +
                "Estudiante[ nombre:alumno3 edad: 18 correo: @alumno3.com]\n" +
                "Estudiante[ nombre:alumno2 edad: 19 correo: @alumno2.com]\n" +
                "Estudiante[ nombre:alumno4 edad: 19 correo: @alumno4.com]");

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
    void testToString(){
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

        assertEquals(materia.toString(),"Asignatura[ nombreAsingatura:Java todos los estudiantes Lista de Estudiantes:\n" +
                "Estudiante[ nombre:alumno3 edad: 18 correo: @alumno3.com]\n" +
                "Estudiante[ nombre:alumno2 edad: 19 correo: @alumno2.com]\n" +
                "Estudiante[ nombre:alumno4 edad: 19 correo: @alumno4.com] ratio 3]");

    }
    @Test
    void main(){Asignatura.main(null);

    }



}