package com.ElementaryTasks.SortingTrianglesSet;

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
        } else {
            System.out.println("I can't build a triangle with this parameters");
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
        if (this.square > that.getSquare()) {
            return -1;
        }
        if (this.square < that.getSquare()) {
            return 1;
        }
        return name.compareTo(that.getName());
    }
}
