package math.geometry.shapes;

import math.geometry.exception.InvalidBreathException;
import math.geometry.exception.InvalidLengthException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RectangleTest {

    @Test
    void shouldThrowExceptionInvalidLengthExceptionForInvalidLength() {
        assertThrows(InvalidLengthException.class, () -> Rectangle.create(-10, -5));
    }

    @Test
    public void shouldThrowInvalidBreathExceptionForInvalidBreath() {
        assertThrows(InvalidBreathException.class, () -> Rectangle.create(3, -2));
    }

    @Test
    void shouldThrowInvalidLengthExceptionWhileCreatingSquare() {
        assertThrows(InvalidLengthException.class, () -> Rectangle.createSquare(-2));
    }

    @Test
    public void shouldCalculateArea() throws InvalidBreathException, InvalidLengthException {
        Rectangle rectangle = Rectangle.create(3, 2);
        assertEquals(6, rectangle.area(), 0.0);
    }

    @Test
    void shouldCalculateAreaOfSquare() throws InvalidLengthException {
        Rectangle square = Rectangle.createSquare(3);
        assertEquals(9, square.area(), 0.0);

    }

    @Test
    public void shouldCalculatePerimeter() throws InvalidBreathException, InvalidLengthException {
        Rectangle rectangle = Rectangle.create(3, 2);
        assertEquals(10, rectangle.perimeter(), 0.0);
    }

    @Test
    public void shouldCalculatePerimeterOfSquare() throws InvalidLengthException {
        Rectangle square = Rectangle.createSquare(3);
        assertEquals(12, square.perimeter(), 0.0);
    }
}