package com.mycompany.assignment_01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tHeCoder
 */
public class Assignment_01 {

    public static void main(String[] args) {
        ArrayList<Shape> shapes = FileReaderClass.getData();
        Scanner console = new Scanner(System.in);
        
        System.out.println("================================================");
        
        double x = 0;
        double y = 0;
        
        boolean correct = true;
        
        do {
            System.out.print("Enter the X-coordinate of the point: ");
            String str1 = console.nextLine();

            System.out.print("Enter the Y-coordinate of the point: ");
            String str2 = console.nextLine();

            try {
                x = Double.parseDouble(str1);
                y = Double.parseDouble(str2);
                correct = true;
            } catch (NumberFormatException e) {
                correct = false;
                System.out.println("Invalid input: The entered coordinates are not numbers.");
            }
            
        } while(!correct);
        
        System.out.println("================================================");
        System.out.println("The points on the boundary are inside.");
        System.out.println("================================================");

        Point point = new Point(x, y);

        int counter = 0;

        for (Shape shape : shapes) {
            if (shape.isInside(point)) {
                counter++;
            }
        }

        System.out.println("P " + point +" is contained within " + (counter == 1 ? "1 shape." : (counter == 0 ? "no shapes." : counter + " shapes.")));

        System.out.println("================================================");
        console.close();
    }
}
