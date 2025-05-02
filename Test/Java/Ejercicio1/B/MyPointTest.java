package Ejercicio1.B;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPointTest {

    @Test
    void getX() {
        MyPoint p = new MyPoint(3, 4);
        assertEquals(3,p.getX(),"La x deberia ser 3");
    }

    @Test
    void setX() {
        MyPoint p = new MyPoint(3, 4);
        p.setX(5);
        assertEquals(5,p.getX(),"La x deberia ser 5");
    }

    @Test
    void getY() {
        MyPoint p = new MyPoint(3, 4);
        assertEquals(4,p.getY(),"La y deberia ser 4");
    }

    @Test
    void setY() {
        MyPoint p = new MyPoint(3, 4);
        p.setY(6);
        assertEquals(6,p.getY(),"La y deberia ser 6");
    }

    @Test
    void getXY() {
        MyPoint p = new MyPoint(3, 4);
        int[] coord = p.getXY();
        assertEquals(3,coord[0],"La coordenada deberia ser 3");
        assertEquals(4,coord[1],"La coordenada deberia ser 4");
    }

    @Test
    void setXY() {
        MyPoint p = new MyPoint();
        p.setXY(1,2);
        assertEquals(1,p.getX(),"La x deberia ser 1");
        assertEquals(2,p.getY(),"La y deberia ser 2");
    }

    @Test
    void testToString() {
        MyPoint p = new MyPoint(3, 4);
        assertEquals("(3,4)",p.toString(),"El mensaje deberia ser (3,4)");
    }

    @Test
    void distance() {
        MyPoint p = new MyPoint(3, 4);
        assertEquals(10,p.distance(9,12),"La distancia deberia ser 10");
    }

    @Test
    void testDistance() {
        MyPoint p = new MyPoint(3, 4);
        MyPoint p2 = new MyPoint(12, 16);
        assertEquals(15,p.distance(p2),"La distancia deberia ser 15");
    }

    @Test
    void testDistance1() {
        MyPoint p = new MyPoint(3, 4);
        assertEquals(5,p.distance(),"La distancia deberia ser 5");
    }

    @Test
    void main() {
        MyPoint.main(null);
    }
}