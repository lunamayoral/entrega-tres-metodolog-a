package Ejercicio1.B;

import static Proyecto.GsonUtilEjemplo.guardarObjetoEnArchivo;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1, int y1, int x2, int y2){
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end){
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public int[] getBeginXY() {
        return begin.getXY();
    }

    public void setBeginXY(int x, int y) {
        begin.setXY(x,y);
    }

    public int[] getEndXY() {
        return end.getXY();
    }

    public void setEndXY(int x, int y) {
        end.setXY(x,y);
    }

    public double getLength(){
        return this.begin.distance(this.end);
    }

    public double getGradient(){
        return Math.atan2(end.getY()-begin.getY(),end.getX()-begin.getX());
    }

    public String toString() {
        return "MyLine[begin=" + begin + ",end=" + end + "]";
    }

    public static void main(String[] args){
        MyPoint p1 = new MyPoint(204, 208);
        MyPoint p2 = new MyPoint(209, 212);
        MyLine l1 = new MyLine(p1, p2);
        String rutaArchivo = "src/Ejercicio1/JSON/MyLine.json";
        guardarObjetoEnArchivo(rutaArchivo, l1);
    }
}
