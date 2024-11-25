package com.mycompany.assignment_01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author tHeCoder
 */
public class FileReaderClass {
    public static ArrayList<Shape> getData() {

        ArrayList<Shape> shapes = null;


        try {
            BufferedReader br = new BufferedReader(new FileReader("/home/tHeCoder/NetBeansProjects/Assignment_01/src/main/java/com/mycompany/assignment_01/Database.csv"));

            int n = Integer.parseInt(br.readLine().trim());
            shapes = new ArrayList<>(n);

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String shapeType = data[0];
                double cx = Double.parseDouble(data[1]);
                double cy = Double.parseDouble(data[2]);
                double length = Double.parseDouble(data[3]);

                if (shapeType.equals("C")) {
                    shapes.add(new Circle(new Point(cx, cy), length));
                }
                else if (shapeType.equals("S")) {
                    shapes.add(new Square(new Point(cx, cy), length));
                }
                else if (shapeType.equals("T")) {
                    shapes.add(new Triangle(new Point(cx, cy), length));
                }
                else if (shapeType.equals("H")) {
                    shapes.add(new Hexagon(new Point(cx, cy), length));
                }
            }

            br.close();

            return shapes;
        } 
        catch (Exception e) {
            System.out.println("EXCEPTION => " + e);
        }

        return null;
    }
}
