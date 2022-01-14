package com.TasksFromBook.MultilevelArray;

public class MinElement {
    public static void main(String[] args) {
        int[][] MyArray = {{5, 2, 6},
                {7, 5, 1},
                {8, 7, 3}};

        System.out.println("Минимальный элемент : " + calcMin(MyArray));
    }

    private static int calcMin(int[][] MyArray) {
        int min = 10;  // найти максимум int max = 0;
        for (int[] row : MyArray) {
            for (int i : row) {
                if (i < min) { // (i > max)
                    min = i;
                }
            }
        }
        return min;
    }


}


