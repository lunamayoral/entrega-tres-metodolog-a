package Ejercicios;

public class Main2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<args.length;i++)
            sb.append("Argumento " + i + ": " + args[i] + "\n");
        System.out.println("Argumentos: \n" + sb);

        String rutaArchivo = "usuario.json";
        Usuario usuarioCargado = GsonUtilEjemplo.cargarObjetoDesdeArchivo(rutaArchivo, Usuario.class);
        if (usuarioCargado != null) {
            System.out.println("Usuario cargado: " + usuarioCargado.nombre);
            System.out.println("Edad: " + usuarioCargado.edad);
            System.out.println("Correo: " + usuarioCargado.correo);
        } else {
            System.out.println("No se pudo cargar el usuario.");
        }
    }

    static class Usuario {
        String nombre;
        int edad;
        String correo;

        public Usuario(String nombre, int edad, String correo) {
            this.nombre = nombre;
            this.edad = edad;
            this.correo = correo;
        }
    }

}
