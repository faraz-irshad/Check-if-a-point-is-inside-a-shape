package com.mycompany.assignment_01;

/**
 *
 * @author tHeCoder
 */
public class Triangle extends Shape{
    public Triangle() {}

    public Triangle(Point center, double length) {
        super(center, length);
    }

    private double areaOfATriangle(Point a, Point b, Point c) {

        double area = 0.5 * Math.abs((a.getX() * (b.getY() - c.getY())) + (b.getX() * (c.getY() - a.getY())) + (c.getX() * (a.getY() - b.getY())));
    
        return area;
    }
    

    @Override
    public boolean isInside(Point p) {

        double R = this.length /  Math.sqrt(3);

        Point A = new Point(center.getX() - (R * (Math.sqrt(3) / 2)), center.getY() - (R / 2));
        Point B = new Point(center.getX() + (R * (Math.sqrt(3) / 2)), center.getY() - (R / 2));
        Point C = new Point(center.getX(), center.getY() + R);

        double Area = areaOfATriangle(A, B, C);

        double A1 = areaOfATriangle(p, B, C);
        double A2 = areaOfATriangle(A, p, C);
        double A3 = areaOfATriangle(A, B, p);

        double tolerance = 1e-5;
        
        return Math.abs(Area - (A1 + A2 + A3)) <= tolerance;
    }

    @Override
    public String getType() {
        return "Triangle";
    }
}
