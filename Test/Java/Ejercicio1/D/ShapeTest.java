package Ejercicio1.D;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void getColor() {
        Shape s1 = new Circle();
        assertEquals("red", s1.getColor());
    }

    @Test
    void setColor() {
        Shape s1 = new Circle(4.0, "green", true);
        s1.setColor("blue");
        assertEquals("blue", s1.getColor());
    }

    @Test
    void isFilled() {
        Shape s1 = new Circle(4.0, "green", true);
        assertTrue(s1.isFilled());
    }

    @Test
    void setFilled() {
        Shape s1 = new Circle(4.0, "green", true);
        s1.setFilled(false);
        assertFalse(s1.isFilled());
    }

    @Test
    void getArea() {
        Shape s1 = new Circle(4.0, "green", true);
        assertEquals(16.0 * Math.PI, s1.getArea());
    }

    @Test
    void getPerimeter() {
        Shape s1 = new Circle(4.0, "green", true);
        assertEquals(8.0 * Math.PI, s1.getPerimeter());
    }

    @Test
    void testToString() {
        Shape s1 = new Circle(4.0, "green", true);
        assertEquals("Circle [Shape [color=green, filled=true]radius=4.0]", s1.toString());
    }
}