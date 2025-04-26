package Proyecto;
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < args.length; i++)
            sb.append("Argumento " + i + ": " + args[i] + "\n");
        System.out.println("Argumentos: \n" + sb);


        if (args[0].equals("init")) {
            String nfichero = args[1];
            DatosAlumno alumno = new DatosAlumno("pepe", 2, "pepe@gmail.com");
            guardarfichero(nfichero, alumno);
        } else if (args[0].equals("show")) {
            String nfichero = args[1];
            cargarObjetoDesdeArchivo(nfichero,DatosAlumno.class);
        }

        Gson gson = new Gson();
        Persona p = new Persona("Antonio Moratilla", 97);
        String json = gson.toJson(p);
        System.out.println(json);
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
}



// Pregunta: ¿Dónde se guarda el fichero de datos?
// C:\Users\Usuario\IdeaProjects\entrega-tres-metodolog-a\\usuario.json