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
public class HexagonTest {
    
    public HexagonTest() {
    }

    @Test
    public void testIsInside() {
        Hexagon hex = new Hexagon(new Point(10, 10), 5);

        assertTrue(hex.isInside(new Point(10, 10)), "Center should be inside the hexagon");
        assertTrue(hex.isInside(new Point(12, 10)), "Point should be inside the hexagon");
        assertTrue(hex.isInside(new Point(8, 10)), "Point should be inside the hexagon");

        assertFalse(hex.isInside(new Point(15, 10)), "Point should be outside the hexagon");
        assertFalse(hex.isInside(new Point(20, 20)), "Point should be outside the hexagon");
    }
    
}
