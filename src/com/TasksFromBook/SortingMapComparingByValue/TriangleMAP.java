package com.TasksFromBook.SortingMapComparingByValue;



public class TriangleMAP implements Comparable<TriangleMAP> {

    private String name;
    private float sideA;
    private float sideB;
    private float sideC;
    private float square;

    public TriangleMAP(String name, float sideA, float sideB, float sideC) {
        /**
         * Треугольник существует только тогда, когда сумма двух его сторон больше третьей.
         * ... Если хотя бы в одном случае сторона окажется больше либо равна сумме двух других,
         * то треугольника с такими сторонами не существует.
         */

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
    public int compareTo (TriangleMAP that){
        if (this.square > that.getSquare()) { //отрицательное, если вызывающий объект меньше объекта, переданного в качестве параметра;
            return -1;
        }
        if (this.square < that.getSquare()) { //положительное, если вызывающий объект больше объекта, переданного в качестве параметра;
            return 1;
        }
        return name.compareTo(that.getName()); // Можно вернуть ноль, если объекты равны. (или по другому параметру сортировать по умолчанию)
    }
}
