package Ejercicio4;

public class Estudiante {
    private String nombre;
    private int edad;
    private String correo;

    public Estudiante(String nombre, int edad, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;

    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getCorreo(){
        return correo;
    }
    public void setCorreo(String correo){
        this.correo = correo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Estudiante that = (Estudiante) obj;
        //System.out.println("Comparando estudiante: " + this + " con " + obj);
        return edad == that.edad && nombre.equals(that.nombre) && correo.equals(that.correo);
    }

    public String toString() {
        return "Estudiante[ nombre:" + getNombre() + " edad: " + getEdad() + " correo: " + getCorreo() + "]";
    }
}
