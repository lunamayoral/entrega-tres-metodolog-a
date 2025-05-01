package Ejercicio1.B;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLineTest {

    @Test
    void getBegin() {
        MyPoint p1 = new MyPoint(1,2);
        MyPoint p2 = new MyPoint(3,4);
        MyLine l = new MyLine(p1,p2);
        assertEquals(p1,l.getBegin(),"Deberia ser (1,2)");
    }

    @Test
    void setBegin() {
        MyPoint p1 = new MyPoint(1,2);
        MyPoint p2 = new MyPoint(3,4);
        MyLine l = new MyLine(p1,p2);
        l.setBegin(p2);
        assertEquals(p2,l.getBegin(),"Deberia ser (3,4)");
    }

    @Test
    void getEnd() {
        MyPoint p1 = new MyPoint(1,2);
        MyPoint p2 = new MyPoint(3,4);
        MyLine l = new MyLine(p1,p2);
        assertEquals(p2,l.getEnd(),"Deberia ser (3,4)");
    }

    @Test
    void setEnd() {
        MyPoint p1 = new MyPoint(1,2);
        MyPoint p2 = new MyPoint(3,4);
        MyLine l = new MyLine(p1,p2);
        l.setEnd(p1);
        assertEquals(p1,l.getEnd(),"Deberia ser (1,2)");
    }

    @Test
    void getBeginX() {
        MyPoint p1 = new MyPoint(1,2);
        MyPoint p2 = new MyPoint(3,4);
        MyLine l = new MyLine(p1,p2);
        assertEquals(1,l.getBeginX(),"Deberia ser 1");
    }

    @Test
    void setBeginX() {
        MyPoint p1 = new MyPoint(1,2);
        MyPoint p2 = new MyPoint(3,4);
        MyLine l = new MyLine(p1,p2);
        l.setBeginX(5);
        assertEquals(5,l.getBeginX(),"Deberia ser 5");
    }

    @Test
    void getBeginY() {
        MyPoint p1 = new MyPoint(1,2);
        MyPoint p2 = new MyPoint(3,4);
        MyLine l = new MyLine(p1,p2);
        assertEquals(2,l.getBeginY(),"Deberia ser 2");
    }

    @Test
    void setBeginY() {
        MyPoint p1 = new MyPoint(1,2);
        MyPoint p2 = new MyPoint(3,4);
        MyLine l = new MyLine(p1,p2);
        l.setBeginY(6);
        assertEquals(6,l.getBeginY(),"Deberia ser 6");
    }

    @Test
    void getEndX() {
        MyPoint p1 = new MyPoint(1,2);
        MyPoint p2 = new MyPoint(3,4);
        MyLine l = new MyLine(p1,p2);
        assertEquals(3,l.getEndX(),"Deberia ser 3");
    }

    @Test
    void setEndX() {
        MyPoint p1 = new MyPoint(1,2);
        MyPoint p2 = new MyPoint(3,4);
        MyLine l = new MyLine(p1,p2);
        l.setEndX(7);
        assertEquals(7,l.getEndX(),"Deberia ser 7");
    }

    @Test
    void getEndY() {
        MyPoint p1 = new MyPoint(1,2);
        MyPoint p2 = new MyPoint(3,4);
        MyLine l = new MyLine(p1,p2);
        assertEquals(4,l.getEndY(),"Deberia ser 4");
    }

    @Test
    void setEndY() {
        MyPoint p1 = new MyPoint(1,2);
        MyPoint p2 = new MyPoint(3,4);
        MyLine l = new MyLine(p1,p2);
        l.setEndY(8);
        assertEquals(8,l.getEndY(),"Deberia ser 8");
    }

    @Test
    void getBeginXY() {
        MyPoint p1 = new MyPoint(1,2);
        MyPoint p2 = new MyPoint(3,4);
        MyLine l = new MyLine(p1,p2);
        int[] coord = l.getBeginXY();
        assertEquals(1,coord[0],"Deberia ser 1");
        assertEquals(2,coord[1],"Deberia ser 2");
    }

    @Test
    void setBeginXY() {
        MyPoint p1 = new MyPoint(1,2);
        MyPoint p2 = new MyPoint(3,4);
        MyLine l = new MyLine(p1,p2);
        l.setBeginXY(12,13);
        int[] coord = l.getBeginXY();
        assertEquals(12,coord[0],"Deberia ser 12");
        assertEquals(13,coord[1],"Deberia ser 13");
    }

    @Test
    void getEndXY() {
        MyPoint p1 = new MyPoint(1,2);
        MyPoint p2 = new MyPoint(3,4);
        MyLine l = new MyLine(p1,p2);
        int[] coord = l.getEndXY();
        assertEquals(3,coord[0],"Deberia ser 3");
        assertEquals(4,coord[1],"Deberia ser 4");
    }

    @Test
    void setEndXY() {
        MyPoint p1 = new MyPoint(1,2);
        MyPoint p2 = new MyPoint(3,4);
        MyLine l = new MyLine(p1,p2);
        l.setEndXY(14,15);
        int[] coord = l.getEndXY();
        assertEquals(14,coord[0],"Deberia ser 14");
        assertEquals(15,coord[1],"Deberia ser 15");
    }

    @Test
    void getLength() {
        MyPoint p1 = new MyPoint(1,2);
        MyPoint p2 = new MyPoint(3,2);
        MyLine l = new MyLine(p1,p2);
        assertEquals(2,l.getLength(),"Deberia ser 2");
    }

    @Test
    void getGradient() {
        MyPoint p1 = new MyPoint(4,4);
        MyPoint p2 = new MyPoint(3,4);
        MyLine l = new MyLine(p1,p2);
        assertEquals(Math.PI,l.getGradient(),"Deberia ser pi");
    }

    @Test
    void testToString() {
        MyLine l = new MyLine(1,2,3,4);
        assertEquals("MyLine[begin=(1,2),end=(3,4)]",l.toString(),"Deberia ser MyLine[begin=(1,2),end=(3,4)]");
    }

    @Test
    void main() {
    }
}