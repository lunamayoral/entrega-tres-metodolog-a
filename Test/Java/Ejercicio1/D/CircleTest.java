package Ejercicio1.D;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        Circle circle1 = new Circle();
        assertEquals(1.0, circle1.getRadius());
        Circle circle2 = new Circle(3.5);
        assertEquals(3.5, circle2.getRadius());
        Circle circle3 = new Circle(4.8, "green",true);
        assertEquals(4.8, circle3.getRadius());
    }

    @Test
    void setRadius() {
        Circle circle1 = new Circle();
        circle1.setRadius(8.0);
        assertEquals(8.0, circle1.getRadius());
    }

    @Test
    void getArea() {
        Circle circle1 = new Circle(3.0);
        assertEquals(9.0 * Math.PI, circle1.getArea());
    }

    @Test
    void getPerimeter() {
        Circle circle1 = new Circle(3.0);
        assertEquals(6.0 * Math.PI, circle1.getPerimeter());
    }

    @Test
    void testToString() {
        Circle circle1 = new Circle(3.0, "green",true);
        assertEquals("Circle [Shape [color=green, filled=true]radius=3.0]", circle1.toString());
    }

    @Test
    void main() {
        Circle.main(null);
    }
}