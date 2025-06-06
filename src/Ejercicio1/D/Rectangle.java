package Ejercicio1.D;

import static Ejercicios.GsonUtilEjemplo.guardarObjetoEnArchivo;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    //Constructors
    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    //Setters and getters
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * width + 2 * length;
    }

    @Override
    public String toString() {
        return "Rectangle [" + super.toString() + "width=" + width + ", length=" + length + "]";
    }

    public static void main(String[] args){
        Rectangle r1 = new Rectangle(7, 9);
        String rutaArchivo = "src/Ejercicio1/JSON/RectangleD.json";
        guardarObjetoEnArchivo(rutaArchivo, r1);
    }
}
