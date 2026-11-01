package ru.student;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CylinderTest {

    @Test
    public void testVolumeWithDifferentBases() {
        Circle circleBase = new Circle(2.0);
        Cylinder c1 = new Cylinder(circleBase, 5.0);
        assertEquals(Math.PI * 4.0 * 5.0, c1.volume(), 0.0001);

        Rectangle rectBase = new Rectangle(3.0, 4.0);
        Cylinder c2 = new Cylinder(rectBase, 5.0);
        assertEquals(60.0, c2.volume(), 0.0001);
    }

    @Test
    public void testInvalidHeightAndNullBase() {
        Circle base = new Circle(2.0);
        assertThrows(InvalidShapeException.class, () -> new Cylinder(base, 0));
        assertThrows(InvalidShapeException.class, () -> new Cylinder(base, -1));
        assertThrows(InvalidShapeException.class, () -> new Cylinder(base, Double.NaN));
        assertThrows(InvalidShapeException.class, () -> new Cylinder(null, 5.0));
    }

    @Test
    public void testGettersAndToString() {
        Circle base = new Circle(2.0);
        Cylinder c = new Cylinder(base, 5.0);
        assertSame(base, c.getBase());
        assertEquals(5.0, c.getHeight());
        assertTrue(c.toString().contains("Cylinder"));
    }
}