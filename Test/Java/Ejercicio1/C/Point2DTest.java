package Ejercicio1.C;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point2DTest {

    @Test
    void getX() {
        Point2D d= new Point2D();
        assertEquals(0.0f, d.getX(),"la x debería ser 0.0f");
    }

    @Test
    void setX() {
        Point2D d= new Point2D();
        d.setX(2.0f);
        assertEquals(2.0f, d.getX(),"la x debería ser 2.0f");

    }

    @Test
    void getY() {
        Point2D d= new Point2D();
        assertEquals(0.0f, d.getY(),"la y debería ser 0.0f");
    }

    @Test
    void setY() {
        Point2D d= new Point2D();
        d.setY(3.0f);
        assertEquals(3.0f, d.getY(),"la y debería ser 3.0f");
    }

    @Test
    void setXY() {
        Point2D d= new Point2D();
        d.setXY(1.0f,3.0f);
        assertEquals(1.0f,d.getX());
        assertEquals(3.0f,d.getY());

    }

    @Test
    void getXY() {
        Point2D d= new Point2D(2.0f, 6.0f);
        float[] coord = d.getXY();
        assertEquals(2.0f, coord[0]);
        assertEquals(6.0f, coord[1]);
    }

    @Test
    void testToString() {
        Point2D d= new Point2D();
        assertEquals("(0.0,0.0)", d.toString());

    }

    @Test
    void main() {
    }
}