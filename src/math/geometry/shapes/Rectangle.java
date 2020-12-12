package math.geometry.shapes;

import math.geometry.exception.InvalidBreathException;
import math.geometry.exception.InvalidLengthException;

public class Rectangle {

    private final double length;
    private final double breadth;

    private Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public static Rectangle create(double length, double breadth) throws InvalidLengthException, InvalidBreathException {
        if (length <= 0) {
            throw new InvalidLengthException();
        }
        if (breadth <= 0) {
            throw new InvalidBreathException();
        }
        return new Rectangle(length, breadth);
    }

    public static Rectangle createSquare(double length) throws InvalidLengthException {
        if (length <= 0) {
            throw new InvalidLengthException();
        }
        return new Rectangle(length, length);
    }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.length, length) == 0 &&
            Double.compare(rectangle.breadth, breadth) == 0;
    }
}
