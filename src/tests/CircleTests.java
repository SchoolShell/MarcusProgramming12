import com.marcus.module1_7.Circle;
import com.marcus.module1_7.Colour;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests pertaining to the circle class
 */
public class CircleTests {
    /**
     * Tests the getArea method on circles
     * Should equal to pi * r^2, where r is the radius passed to the constructor
     * 0.00001 is used as the delta to account for rounding error
     */
    @Test
    public void areaCircle() {
        // pi * r^2
        assertEquals(3.1415926, new Circle(Colour.NONE, 1.0).getArea(), 0.00001);
        assertEquals(78.53982, new Circle(Colour.NONE, 5.0).getArea(), 0.00001);
        assertEquals(1385.44236, new Circle(Colour.NONE, 21.0).getArea(), 0.00001);
        assertEquals(58964.55252, new Circle(Colour.NONE, 137.0).getArea(), 0.00001);
    }
}
