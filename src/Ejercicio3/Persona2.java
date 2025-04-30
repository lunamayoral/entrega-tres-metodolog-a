package Ejercicio3;
import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Persona2 {

    String nombre;
    int edad;
    String[] hobbies; // Array dentro del objeto

    public Persona2(String nombre, int edad, String[] hobbies) {
        this.nombre = nombre;
        this.edad = edad;
        this.hobbies = hobbies;
    }

    public static void savePersona2(String rutaArchivo, Persona2 l) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            gson.toJson(l, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String loadPersona2(String rutaArchivo, Persona2 l) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(rutaArchivo)) {
            gson.fromJson(reader, Persona2.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return rutaArchivo;
    }

    public static void main(String[] args) {
        Gson gson = new Gson();
        Persona2 persona = new Persona2("Juan", 30, new String[]{"Fútbol", "Cine", "Lectura"});
        String json = gson.toJson(persona);
        System.out.println(json);
        String rutaArchivo = "src/Ejercicio3/JSON/Persona2.json";
        savePersona2(rutaArchivo, persona);
        loadPersona2(rutaArchivo, persona);
    }
}