package com.ElementaryTasks.SortingTrianglesSet;

import java.util.Objects;

public class TriangleSet implements Comparable<TriangleSet> {

    private String name;
    private float sideA;
    private float sideB;
    private float sideC;
    private float square;

    public TriangleSet(String name, float sideA, float sideB, float sideC) {

        if ((sideA + sideB)> sideC && (sideB + sideC)> sideA && (sideC + sideA)> sideB) {
            this.name = name;
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
            float p = (float) 0.5 * (sideA + sideB + sideC);
            this.square = (float) Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        }
    }

    public String getName() {
        return name;
    }


    public float getSquare() {
        return square;
    }


    @Override
    public int compareTo (TriangleSet that){
        if (this.square > that.getSquare()) { //отрицательное, если вызывающий объект меньше объекта, переданного в качестве параметра;
            return -1;
        }
        if (this.square < that.getSquare()) { //положительное, если вызывающий объект больше объекта, переданного в качестве параметра;
            return 1;
        }
        return name.compareTo(that.getName()); //нуль, если объекты равны. (или по другому параметру)
    }
}
