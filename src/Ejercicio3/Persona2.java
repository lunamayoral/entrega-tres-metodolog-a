package Ejercicio3;
import com.google.gson.Gson;
import static Ejercicios.GsonUtilEjemplo.guardarObjetoEnArchivo;

public class Persona2 {

    String nombre;
    int edad;
    String[] hobbies; // Array dentro del objeto

    public Persona2(String nombre, int edad, String[] hobbies) {
        this.nombre = nombre;
        this.edad = edad;
        this.hobbies = hobbies;
    }

    public static void main(String[] args) {
        Gson gson = new Gson();
        Persona2 persona = new Persona2("Juan", 30, new String[]{"Fútbol", "Cine", "Lectura"});
        String json = gson.toJson(persona);
        System.out.println(json);
        String rutaArchivo = "src/Ejercicio3/JSON/Persona2.json";
        guardarObjetoEnArchivo(rutaArchivo, persona);
    }
}