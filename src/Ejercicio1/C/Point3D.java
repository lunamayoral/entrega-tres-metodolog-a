package Ejercicio1.C;

import static Ejercicios.GsonUtilEjemplo.guardarObjetoEnArchivo;

public class Point3D extends Point2D {
    private float z;
    public Point3D(float x, float y, float z){
        super(x,y);
        this.z=z;
    }
    public Point3D(){
        super();
        z=0.0f;
    }
    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;

    }
    public void setXYZ(float x, float y, float z){
        super.setXY(x,y);
        this.z=z;
    }
    public float[] getXYZ(){
        float[] coord=new float[3];
        coord[0]=getX();
        coord[1]=getY();
        coord[2]=getZ();
        return coord;
    }
    @Override
    public String toString(){
        return "("+getX()+","+getY()+","+z+")";
    }

    public static void main(String[] args){
        Point3D p1 = new Point3D(123, 456, 789);
        String rutaArchivo = "src/Ejercicio1/JSON/Point3D.json";
        guardarObjetoEnArchivo(rutaArchivo, p1);
    }
}
