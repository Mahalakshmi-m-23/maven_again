package com.example.maven;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class triangleTest {

    @Test
    void testGetAreaWithValidDimensions() {
        triangle t = new triangle();
        double result = t.getArea(10.0, 5.0);
        // Expected: 0.5 * 10 * 5 = 25.0
        assertEquals(25.0, result, 0.0001, "Area calculation for standard dimensions failed.");
    }

    @Test
    void testGetAreaWithZeroDimensions() {
        triangle t = new triangle();
        assertEquals(0.0, t.getArea(0.0, 5.0), 0.0001, "Area with zero base should be 0.");
        assertEquals(0.0, t.getArea(10.0, 0.0), 0.0001, "Area with zero height should be 0.");
    }

    @Test
    void testGetAreaWithNegativeDimensionsThrowsException() {
        triangle t = new triangle();
        
        assertThrows(IllegalArgumentException.class, () -> {
            t.getArea(-4.0, 5.0);
        }, "Expected IllegalArgumentException for negative base.");
        
        assertThrows(IllegalArgumentException.class, () -> {
            t.getArea(4.0, -5.0);
        }, "Expected IllegalArgumentException for negative height.");
    }
}