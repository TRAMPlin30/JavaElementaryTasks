package com.TasksFromBook.MultilevelArray;

import java.util.Arrays;

public class varArgs_1 {
    public static void main(String[] args) {

        sortArray();
        newArray();
    }

    public static void sortArray() {
        int[] intArray = {2,5,6,8,5,7,9,6,2,1,0,7,8};
        Arrays.sort(intArray);
        System.out.println(intArray); // выведет адрес массива ([I@43a25848)
        System.out.println(Arrays.toString(intArray)); // [0, 1, 2, 2, 5, 5, 6, 6, 7, 7, 8, 8, 9]

    }

    public static void newArray() {
        int[] filedArray = new int[10]; // недостаток массива - фиксированная длинна
        Arrays.fill(filedArray, 8);
        System.out.println(Arrays.toString(filedArray));


        int[] myArray = {1,2,3,5,8,9};
        int[] copyArray = new int[10];

        System.arraycopy(myArray, 0, copyArray, 0, myArray.length);
        System.out.println(Arrays.toString(copyArray)); // [1, 2, 3, 5, 8, 9, 0, 0, 0, 0]



    }





}
