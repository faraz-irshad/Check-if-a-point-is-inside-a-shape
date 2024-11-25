package com.mycompany.assignment_01;

/**
 *
 * @author tHeCoder
 */
public class Circle extends Shape{
    public Circle() {}

    public Circle(Point center, double length) {
        super(center, length);
    }

    @Override
    public boolean isInside(Point p) {
        return distanceBetweenPoints(this.center, p) <= this.length;
    }

    @Override
    public String getType() {
        return "Circle";
    }
}
