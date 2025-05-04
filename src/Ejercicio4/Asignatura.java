package Ejercicio4;
import Ejercicio3.ListaSimplementeEnlazada;


import static Ejercicios.GsonUtilEjemplo.cargarObjetoDesdeArchivo;
import static Ejercicios.GsonUtilEjemplo.guardarObjetoEnArchivo;

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

    public ListaSimplementeEnlazada<Estudiante> deleteEstudiante(Estudiante student) {
        estudiantes.delete(student);
        return estudiantes;
    }

    public ListaSimplementeEnlazada<Estudiante> getTodosLosEstudiantes() {

        return this.estudiantes;
    }

    public int ratioAsignatura() {
        return estudiantes.getNumElementos();
    }
     @Override

    public String toString() {
        return "Asignatura[ nombreAsingatura:" + getNombreAsignatura()  +
                " todos los estudiantes " + getTodosLosEstudiantes() + " ratio " + ratioAsignatura() + "]";
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
        l1.deleteEstudiante(alumno1);
        l1.addEstudiante(alumno3);

        System.out.println(l1.getEstudiante(alumno1));
        System.out.println(l1.getTodosLosEstudiantes());
        System.out.println(l1);



        String rutaArchivo = "src/Ejercicio4/JSON/Asignatura.json";
        guardarObjetoEnArchivo(rutaArchivo, l1);
        cargarObjetoDesdeArchivo(rutaArchivo, ListaSimplementeEnlazada.class);


    }
}