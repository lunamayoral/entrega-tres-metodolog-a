package Ejercicio1.B;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint(){
        x=0;
        y=0;
    }

    public MyPoint(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY(){
        int[] coord = new int[2];
        coord[0]=x;
        coord[1]=y;
        return coord;
    }

    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }

    public String toString() {
        return "("+x+","+y+")";
    }

    public double distance(int x, int y){
        int v1 = this.x - x;
        int v2 = this.y - y;
        return Math.sqrt(v1*v1+v2*v2);
    }

    public double distance(MyPoint another){
        int v1 = this.x - another.getX();
        int v2 = this.y - another.getY();
        return Math.sqrt(v1*v1+v2*v2);
    }

    public double distance(){
        return Math.sqrt(this.x*this.x+this.y*this.y);
    }

    public static void savePoint(String rutaArchivo, MyPoint p) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            gson.toJson(p, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        MyPoint p1 = new MyPoint(208, 212);
        String rutaArchivo = "src/Ejercicio1/JSON/MyPoint.json";
        savePoint(rutaArchivo, p1);
    }
}
