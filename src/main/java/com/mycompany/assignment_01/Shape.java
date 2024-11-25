package com.mycompany.assignment_01;

/**
 *
 * @author tHeCoder
 */
public abstract class Shape {
    protected Point center;
    protected double length;

    public Shape() {}

    public Shape(Point center, double length) {
        this.center = center;
        this.length = length;
    }

    public Point getCenter() {
        return center;
    }

    public double getLength() {
        return length;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setLength(double length) {
        this.length = length;
    }

    protected double distanceBetweenPoints(Point a, Point b) {
        return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
    }

    public abstract boolean isInside(Point p);

    public abstract String getType();

    @Override
    public String toString() {
        if (this.getType().equals("Triangle")) {
            return this.getType() + "\t(" + center.getX() + ", " + center.getY() + ")\t" + length;
        } else {
            return this.getType() + "\t\t(" + center.getX() + ", " + center.getY() + ")\t" + length;
        }
    }
}
