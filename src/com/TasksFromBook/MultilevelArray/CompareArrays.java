package com.TasksFromBook.MultilevelArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class CompareArrays {

    /**
     * Задание 22.26
     * Напишите метод, который получает в качестве параметров два двумерных массива целых чисел.
     * Метод должен проверить, являются ли массивы идентичными, то есть,
     * содержат ли ячейки с одинаковыми индексами одинаковые значения.
     */

    public static void main(String[] args) {

        int[][] arrayOne = {{11, 21, 31, 48, 58}, {67, 73, 83, 90, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        int[][] arrayTwo = {{11, 22, 32, 42, 52}, {67, 73, 83, 93, 12}, {15, 15, 12, 14, 15}, {16, 57, 18, 59, 20}, {21, 62, 73, 24, 75}};

        //printArrays();
        //System.out.println();
        compareArrays(arrayOne, arrayTwo);
    }

    public static void compareArrays(int[][] array_1, int[][] array_2) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                //System.out.print(array_1[i][j] + " ");
                if (array_1[i][j] == array_2[i][j]) {
                    System.out.println("В массивах array_1 и array_2 по индексам:   " + "строка - {"+i+"}" + ": столбец - {"+j+"}"+
                            "  находятся одинаковые элементы");
                    result.add(array_1[i][j]);
                }
            }

        }System.out.println("\n"+"Одинаковые элементы обоих массивов:  " + result);


        // вывод на печать массива
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array_1[i][j] + " "+"");
            } System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array_2[i][j] + " ");
            } System.out.println();
        }
    }

//    public static void printArrays() {
//
//            // заполняем массив
//            Random rnd = new Random();
//            int[][] mass = new int[5][5];
//            for (int i = 0; i < 5; i++) {
//                for (int j = 0; j < 5; j++) {
//                    mass[i][j] = rnd.nextInt(10);
//                }
//            }
//
//            // выводим на экран
//            for (int i = 0; i < 5; i++) {
//                for (int j = 0; j < 5; j++) {
//                    System.out.print(mass[i][j] + " ");
//                }
//                System.out.println();
//            }
//
//
//    }
}
