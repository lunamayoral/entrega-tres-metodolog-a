package Ejercicio1.A;

import static Ejercicios.GsonUtilEjemplo.guardarObjetoEnArchivo;

public class Circle {
    private double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "es.uah.matcomp.mp.el1.eja.ejerciciosclases.e1.Circle[radius=" + radius + "]";
    }

    public static void main(String[] args){
        Circle c1 = new Circle(1.1);
        String rutaArchivo = "src/Ejercicio1/JSON/CircleA.json";
        guardarObjetoEnArchivo(rutaArchivo, c1);
    }
}