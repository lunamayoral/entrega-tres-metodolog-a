package Ejercicio1.C;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point3DTest {

    @Test
    void getZ() {
        Point3D d= new Point3D();
        assertEquals(0.0f, d.getZ());
    }

    @Test
    void setZ() {
        Point3D d= new Point3D();
        d.setZ(4.0f);
        assertEquals(4.0f, d.getZ());
    }

    @Test
    void setXY() {
        Point3D d= new Point3D();
        d.setXY(1.0f,3.0f);
        assertEquals(1.0f,d.getX());
        assertEquals(3.0f,d.getY());



    }

    @Test
    void setXYZ() {
        Point3D d= new Point3D();
        d.setXYZ(1.0f,3.0f,5.0f);

        assertEquals(1.0f,d.getX());
        assertEquals(3.0f,d.getY());
        assertEquals(5.0f,d.getZ());
    }

    @Test
    void getXYZ() {
        Point3D d = new Point3D();
        float[] coord = d.getXYZ();
        assertEquals(0.0f, coord[0]);
        assertEquals(0.0f, coord[1]);
        assertEquals(0.0f, coord[2]);
    }


    @Test
    void testToString() {
        Point3D d = new Point3D(2.0f,4.0f,5.9f);
        assertEquals("(2.0,4.0,5.9)", d.toString());
    }

    @Test
    void main() {
        Point3D.main(null);
    }
}