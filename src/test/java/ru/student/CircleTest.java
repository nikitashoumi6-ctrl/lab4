package ru.student;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {

    @Test
    public void testAreaAndPerimeter() {
        Circle c = new Circle(2.0);
        assertEquals(Math.PI * 4.0, c.area(), 0.0001);
        assertEquals(Math.PI * 4.0, c.perimeter(), 0.0001);
    }

    @Test
    public void testInvalidRadius() {
        assertThrows(InvalidShapeException.class, () -> new Circle(0));
        assertThrows(InvalidShapeException.class, () -> new Circle(-5));
        assertThrows(InvalidShapeException.class, () -> new Circle(Double.NaN));
        assertThrows(InvalidShapeException.class, () -> new Circle(Double.POSITIVE_INFINITY));
    }

    @Test
    public void testGettersAndToString() {
        Circle c = new Circle(5.0);
        assertEquals(5.0, c.getRadius());
        assertTrue(c.toString().contains("Circle"));
        assertTrue(c.toString().contains("5.0"));
    }
}