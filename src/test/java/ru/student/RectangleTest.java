package ru.student;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    public void testAreaSquareAndRectangle() {
        Rectangle square = new Rectangle(3.0, 3.0);
        assertEquals(9.0, square.area(), 0.0001);

        Rectangle rect = new Rectangle(2.0, 4.0);
        assertEquals(8.0, rect.area(), 0.0001);
        assertEquals(12.0, rect.perimeter(), 0.0001);
    }

    @Test
    public void testInvalidDimensions() {
        assertThrows(InvalidShapeException.class, () -> new Rectangle(0, 5));
        assertThrows(InvalidShapeException.class, () -> new Rectangle(5, -1));
        assertThrows(InvalidShapeException.class, () -> new Rectangle(Double.NaN, 5));
        assertThrows(InvalidShapeException.class, () -> new Rectangle(5, Double.NEGATIVE_INFINITY));
    }

    @Test
    public void testGettersAndToString() {
        Rectangle r = new Rectangle(3.0, 4.0);
        assertEquals(3.0, r.getWidth());
        assertEquals(4.0, r.getHeight());
        assertTrue(r.toString().contains("Rectangle"));
    }
}