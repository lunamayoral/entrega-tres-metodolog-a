package Ejercicio1.A;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        Circle circle = new Circle(2.0);
        assertEquals(2.0, circle.getRadius());
    }

    @Test
    void setRadius() {
        Circle circle = new Circle();
        circle.setRadius(3.0);
        assertEquals(3.0, circle.getRadius());
    }

    @Test
    void getArea() {
        Circle circle = new Circle(5.0);
        double expectedArea = Math.PI * 5.0 * 5.0;
        assertEquals(expectedArea, circle.getArea(), 0.00001);
    }

    @Test
    void getCircumference() {
        Circle circle = new Circle(5.0);
        double expectedCircumference = Math.PI * 5.0 * 2.0;
        assertEquals(expectedCircumference, circle.getCircumference(), 0.00001);
    }

    @Test
    void testToString() {
        Circle circle = new Circle(5.0);
        String expectedString = "es.uah.matcomp.mp.el1.eja.ejerciciosclases.e1.Circle[radius=5.0]";
        assertEquals(expectedString, circle.toString());
    }

    @Test
    void main() {
    }
}