package com.ElementaryTasks.Fibonacci;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        fibonacciNumbers(8, 100);

    }
    public static void fibonacciNumbers(int start, int end) {

        ArrayList<Integer> fibonacciList = new ArrayList<>();
        int fibo_1;
        int fibo_2 = 1;
        int fibo_3 = 1;

        if (start == 1) {System.out.print(start + ", " + fibo_2 + ", ");}

        while (fibo_3 < end) {
            fibo_1 = fibo_2;
            fibo_2 = fibo_3;
            fibo_3 = fibo_1 + fibo_2;
            if (fibo_3 >= start && fibo_3 <= end) {
                fibonacciList.add(fibo_3);
                System.out.print(fibo_3 + ", ");
            }
        }
        System.out.println();
        System.out.println(fibonacciList);
    }
}
