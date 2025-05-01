package Proyecto;
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.SplittableRandom;


public class Main {
    public static boolean fichero(String archivo, String fichero) {
        boolean res = false;
        Gson gson = new Gson();
        switch (archivo) {
            case "init": {
                DatosAlumno alumno = new DatosAlumno("pepe", 2, "pepe@gmail.com");
                guardarfichero(fichero, alumno);
                res = true;
            }
            case "show": {
                DatosAlumno alumnocargado = cargarObjetoDesdeArchivo(fichero, DatosAlumno.class);
                if (alumnocargado != null) {
                    System.out.println("correctamente cargado");
                    System.out.println("nombre: " + alumnocargado.getNombre());
                    System.out.println("edad: " + alumnocargado.getEdad());
                    System.out.println("correo: " + alumnocargado.getCorreo());

                    res = true;

                }

            }
        }
        return res;
    }

    private static <T> void guardarfichero(String rutaArchivo, T objeto) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            gson.toJson(objeto, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static <T> T cargarObjetoDesdeArchivo(String rutaArchivo, Class<T> clase) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(rutaArchivo)) {
            return gson.fromJson(reader, clase);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < args.length; i++)
            sb.append("Argumento " + i + ": " + args[i] + "\n");
        System.out.println("Argumentos: \n" + sb);

        if (args.length == 2) {
            fichero(args[0], args[1]);

        } else {
            System.out.println("Error, la estructura es la siguiente;java -jar NombreDeTuProyecto.jar init dato.json");
        }
    }
}




// Pregunta: ¿Dónde se guarda el fichero de datos?
// C:\Users\Usuario\IdeaProjects\entrega-tres-metodolog-a\\usuario.json