import com.marcus.module1_7.Colour;
import com.marcus.module1_7.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleTests {
    /**
     * Tests the herons height method with triangles constructed with width and height
     * 0.00001 is used as the delta to account for rounding error
     */
    @Test
    public void heronsWidthHeight() {
        assertEquals(4, new Triangle(Colour.NONE, 10, 4).heronsHeight(), 0.00001);
        assertEquals(19, new Triangle(Colour.NONE, 13, 19).heronsHeight(), 0.00001);
        // wide triangle
        assertEquals(1, new Triangle(Colour.NONE, 90, 1).heronsHeight(), 0.00001);
        // tall triangle
        assertEquals(79, new Triangle(Colour.NONE, 3, 79).heronsHeight(), 0.00001);
    }

    /**
     * Tests the herons height method with triangles constructed with three side lengths
     * 0.00001 is used as the delta to account for rounding error
     */
    @Test
    public void heronsThreeSides() {
        // scalene triangle
        assertEquals(2.18575, new Triangle(Colour.NONE, 10, 4, 7).heronsHeight(), 0.00001);

        // isosceles triangle
        assertEquals(6.02079, new Triangle(Colour.NONE, 12, 8.5, 8.5).heronsHeight(), 0.00001);

        // equilateral triangle
        assertEquals(8.66025, new Triangle(Colour.NONE, 10, 10, 10).heronsHeight(), 0.00001);
    }

    /**
     * Tests the getArea method on triangles
     * Should equal to w * h / 2, where w is the width and h is the height passed to the constructor
     * 0.00001 is used as the delta to account for rounding error
     */
    @Test
    public void areaTriangle() {
        // w * h / 2
        assertEquals(20.0, new Triangle(Colour.NONE, 10, 4).getArea(), 0.00001);
        assertEquals(123.5, new Triangle(Colour.NONE, 13, 19).getArea(), 0.00001);
        assertEquals(45.0, new Triangle(Colour.NONE, 90, 1).getArea(), 0.00001);
        assertEquals(50.0, new Triangle(Colour.NONE, 1, 100).getArea(), 0.00001);
    }
}
