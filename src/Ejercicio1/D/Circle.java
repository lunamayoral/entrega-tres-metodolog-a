package Ejercicio1.D;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

public class Circle extends Shape{
    protected double radius;

    //Constructors
    public Circle() {
        super();
        this.radius = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle [" + super.toString() + "radius=" + radius + "]";
    }

    public static void saveCircle(String rutaArchivo, Circle c) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            gson.toJson(c, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        Circle c1 = new Circle(3, "blue", true);
        String rutaArchivo = "src/Ejercicio1/JSON/CircleD.json";
        saveCircle(rutaArchivo, c1);
    }
}
