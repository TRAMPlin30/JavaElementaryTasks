package com.TasksFromBook.MultilevelArray;

public class Main {
    public static void main(String[] args) {

        int[][] array = {{}};

        getArray(array);

    }

    public static void getArray(int[][] array) {
        for (int i = 1; i<3; i++) {
            for (int j =0; j < i + 2; j++){
                array[i][j] = array[i][j]+array[i][j];
            }
        }
    }




}
