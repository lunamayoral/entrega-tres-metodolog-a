package Ejercicio1.C;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

public class Point2D {
    private float x;
    private float y;
    public Point2D(){
        x=0.0f;
        y=0.0f;
    }
    public Point2D(float x, float y){
        this.x=x;
        this.y=y;
    }
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        float[] coord=new float[2];
        coord[0]=x;
        coord[1]=y;
        return coord;
    }
    public String toString(){
        return "("+x+","+y+")";
    }

    public static void savePoint(String rutaArchivo, Point2D p) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            gson.toJson(p, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        Point2D p1 = new Point2D(123, 456);
        String rutaArchivo = "src/Ejercicio1/JSON/Point2D.json";
        savePoint(rutaArchivo, p1);
    }
}
