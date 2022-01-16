package com.ElementaryTasks.SortingTriangles;

import java.text.DecimalFormat;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<Triangle> triangles = new HashSet<>();

        Triangle triangle = new Triangle("Mini", 5.5, 5.7, 4.2);
        Triangle triangle1 = new Triangle("Maxi",7.2 , 5.2, 6.3);
        Triangle triangle2 = new Triangle("Mini", 6.5, 6.7, 5.2);

        calcS(triangle);


    }

    private static double calcS(Triangle triangle) {
        DecimalFormat df = new DecimalFormat("0.00");
        double A = triangle.getSideA();
        double B = triangle.getSideB();
        double C = triangle.getSideC();
        double square;
        double p;
        if (triangle.checkTrue()) {
            p = 0.5 * (A + B + C);
            square = Math.sqrt(p * (p - A) * (p - B) * (p - C));
            System.out.println((df.format(square)));
            return square;
        } else {
            System.out.println("Треугольник невозможен");
            return -1;
        }
    }

}
