package Proyecto;

public class DatosAlumno {
    private String nombre;
    private int edad;
    private String correo;
    public DatosAlumno(String nombre, int edad, String correo){
        this.nombre=nombre;
        this.edad=edad;
        this.correo=correo;
    }
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Correo: " + correo;
    }
}

