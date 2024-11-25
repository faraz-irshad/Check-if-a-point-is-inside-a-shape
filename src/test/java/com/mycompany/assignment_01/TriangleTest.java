/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.assignment_01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author tHeCoder
 */
public class TriangleTest {
    
    public TriangleTest() {
    }

    @Test
    public void testIsInside() {
        Triangle triangle = new Triangle(new Point(5, 5), 6);

        assertTrue(triangle.isInside(new Point(5, 5)), "Center should be inside the triangle");
        assertTrue(triangle.isInside(new Point(6, 4)), "Point should be inside the triangle");

        assertFalse(triangle.isInside(new Point(10, 10)), "Point should be outside the triangle");
        assertFalse(triangle.isInside(new Point(1, 1)), "Point should be outside the triangle");
    }
    
}
