package Ejercicio1.A;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

public class Rectangle {
    private float length;
    private float width;
    public Rectangle() {
        length = 1.0f;
        width = 1.0f;
    }
    public Rectangle(float length, float width){
        this.length=length;
        this.width=width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return 2*length+2*width;
    }

    public String toString() {
        return "Rectangle [length=" + length +", width=" + width +"]";
    }

    public static void saveRectangle(String rutaArchivo, Rectangle r) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            gson.toJson(r, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(7, 9);
        String rutaArchivo = "src/Ejercicio1/JSON/RectangleA.json";
        saveRectangle(rutaArchivo, r1);
    }
}
