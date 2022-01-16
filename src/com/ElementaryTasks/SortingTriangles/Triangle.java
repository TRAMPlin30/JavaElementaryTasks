package com.ElementaryTasks.SortingTriangles;

import java.text.DecimalFormat;

public class Triangle {

    private String name;
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String name, double sideA, double sideB, double sideC) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public String getName() {
        return name;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    /**
     * Треугольник существует только тогда, когда сумма двух его сторон больше третьей.
     * ... Если хотя бы в одном случае сторона окажется больше либо равна сумме двух других,
     * то треугольника с такими сторонами не существует.
     */

    public boolean checkTrue() {
        if ((sideA + sideB)> sideC && (sideB + sideC)> sideA && (sideC + sideA)> sideB) {
            return true;
        } else {
            return false;
        }
    }
}
