package com.mycompany.assignment_01;

/**
 *
 * @author tHeCoder
 */
public class Square extends Shape{
    public Square() {}

    public Square(Point center, double length) {
        super(center, length);
    }

    @Override
    public boolean isInside(Point p) {
        return (center.getX() + (this.length/2) >= p.getX()) && (center.getX() - (this.length/2) <= p.getX()) && (center.getY() + (this.length/2) >= p.getY()) &&  (center.getY() - (this.length/2) <= p.getY());
    }

    @Override
    public String getType() {
        return "Square";
    }
}
