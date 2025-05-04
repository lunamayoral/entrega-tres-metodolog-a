package Ejercicio1.A;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getLength() {
        Rectangle r=new Rectangle();
        assertEquals(1.0,r.getLength(),"la longitud debería ser 1.0");
    }

    @Test
    void setLength() {
        Rectangle r=new Rectangle();
        r.setLength(2.0f);
        assertEquals(2.0f,r.getLength(),"La longitud debería ser 2.0");
    }

    @Test
    void getWidth() {
        Rectangle r=new Rectangle(2,3);
        assertEquals(3,r.getWidth(),"la altura debería ser 3.0");
    }

    @Test
    void setWidth() {
        Rectangle r=new Rectangle();
        r.setWidth(2.5f);
        assertEquals(2.5f,r.getWidth(),"la altura debería ser 2.5");
    }

    @Test
    void getArea(){
        Rectangle r=new Rectangle();//si pongo este constructor es con los valores predeterminados, sino añades en el parentesis y utilizas los valores que quieras
        assertEquals(1,r.getArea(),"el area deberia ser 1");
    }

    @Test
    void getPerimeter() {
        Rectangle r=new Rectangle();
        assertEquals(4,r.getPerimeter(),"el perimetro debería ser 4");
    }

    @Test
    void testToString() {
        Rectangle r=new Rectangle();
        assertEquals("Rectangle [length=" + 1.0 +", width=" + 1.0 +"]", r.toString(),"el mensaje debería ser :Rectangle [length= 1.0 , width=1.0]" );
    }

    @Test
    void main() {
        Rectangle.main(null);
    }
}