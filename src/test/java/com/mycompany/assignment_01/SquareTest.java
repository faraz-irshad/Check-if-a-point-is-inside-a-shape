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
public class SquareTest {
    
    public SquareTest() {
    }

    @Test
    public void testIsInside() {
        Square square = new Square(new Point(10, 10), 4);

        assertTrue(square.isInside(new Point(10, 10)), "Center should be inside the square");
        assertTrue(square.isInside(new Point(9, 9)), "Point should be inside the square");

        assertFalse(square.isInside(new Point(15, 15)), "Point should be outside the square");
        assertFalse(square.isInside(new Point(20, 20)), "Point should be outside the square");
    }
    
}
