package Ejercicio1.A;

import static Ejercicios.GsonUtilEjemplo.guardarObjetoEnArchivo;

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

    public static void main(String[] args){
        Rectangle r1 = new Rectangle(7, 9);
        String rutaArchivo = "src/Ejercicio1/JSON/RectangleA.json";
        guardarObjetoEnArchivo(rutaArchivo, r1);
    }
}
