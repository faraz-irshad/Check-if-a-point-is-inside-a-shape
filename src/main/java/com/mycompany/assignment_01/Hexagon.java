package com.mycompany.assignment_01;

import java.util.ArrayList;

/**
 *
 * @author tHeCoder
 */
public class Hexagon extends Shape{
    public Hexagon() {}

    public Hexagon(Point center, double length) {
        super(center, length);
    }

    private ArrayList<Point> verticesOfAHexagon(Point center, double length) {

        ArrayList<Point> vertices = new ArrayList<>(6);

        for (int i = 1; i <= 6; i++) {
            double angle = ((Math.PI / 3) * i); 

            double x = center.getX() + length * Math.cos(angle);
            double y = center.getY() + length * Math.sin(angle);

            vertices.add(new Point(x, y));
        }

        return vertices;
    }

    @Override
    public boolean isInside(Point p) {

        int intersections = 0;
        
        ArrayList<Point> vertices = verticesOfAHexagon(center, length);

        for (int i = 0; i < 6; i++) {
            Point v1 = vertices.get(i);
            Point v2 = vertices.get((i + 1) % 6);

            if ((v1.getY() > p.getY()) != (v2.getY() > p.getY())) {
                double intersectionPoint = v1.getX() + (((p.getY() - v1.getY()) * (v2.getX() - v1.getX())) / (v2.getY() - v1.getY()));

                if (p.getX() < intersectionPoint) {
                    intersections++;
                }
            }
        }

        return intersections % 2 == 1;
    }

    @Override
    public String getType() {
        return "Hexagon";
    }
}
