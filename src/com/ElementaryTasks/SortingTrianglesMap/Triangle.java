package com.ElementaryTasks.SortingTrianglesMap;

public class Triangle {

    private String name;
    private float sideA;
    private float sideB;
    private float sideC;

    public Triangle(String name, float sideA, float sideB, float sideC) {
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


    public boolean checkTrue() {
        /**
         * Треугольник существует только тогда, когда сумма двух его сторон больше третьей.
         * ... Если хотя бы в одном случае сторона окажется больше либо равна сумме двух других,
         * то треугольника с такими сторонами не существует.
         */
        if ((sideA + sideB)> sideC && (sideB + sideC)> sideA && (sideC + sideA)> sideB) {
            return true;
        } else {
            return false;
        }
    }
}


