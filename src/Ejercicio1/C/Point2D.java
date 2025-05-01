package Ejercicio1.C;

import static Proyecto.GsonUtilEjemplo.guardarObjetoEnArchivo;

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

    public static void main(String[] args){
        Point2D p1 = new Point2D(123, 456);
        String rutaArchivo = "src/Ejercicio1/JSON/Point2D.json";
        guardarObjetoEnArchivo(rutaArchivo, p1);
    }
}
