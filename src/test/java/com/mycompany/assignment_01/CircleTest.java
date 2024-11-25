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
public class CircleTest {
    
    public CircleTest() {
    }

    @Test
    public void testIsInside() {
        Circle circle = new Circle(new Point(0, 0), 5);

        assertTrue(circle.isInside(new Point(0, 0)), "Center should be inside the circle");
        assertTrue(circle.isInside(new Point(3, 4)), "Point should be inside the circle (3-4-5 triangle)");

        assertFalse(circle.isInside(new Point(10, 10)), "Point should be outside the circle");
        assertFalse(circle.isInside(new Point(6, 6)), "Point should be outside the circle");
    }
    
}
