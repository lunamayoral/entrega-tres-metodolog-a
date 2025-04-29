package Ejercicio3;
import com.google.gson.Gson;


public class Persona2 {

        String nombre;
        int edad;
        String[] hobbies; // Array dentro del objeto

        public Persona2(String nombre, int edad, String[] hobbies) {
            this.nombre = nombre;
            this.edad = edad;
            this.hobbies = hobbies;

            Gson gson = new Gson();
            Persona2 persona = new Persona2("Juan", 30, new String[]{"Fútbol", "Cine", "Lectura"});
            String json = gson.toJson(persona);
            System.out.println(json);


        }
    }

//Si el array forma parte de un objeto, Gson sigue funcionando sin problemas.

