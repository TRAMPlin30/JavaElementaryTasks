package com.ElementaryTasks.Fibonacci;

import java.util.ArrayList;

public class Main {

    public static int start, end;

    public static void main(String[] args) {

        runProgramFibonacci();

    }

    public static void fibonacciNumbers(int start, int end) {

        if (start < end) {
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
        } else {
            System.out.println("Error!!! The start parameter is greater than end the parameter. \n" +
                    "Enter correct parameters!!! ");
            runProgramFibonacci();
        }
    }

    public static void runProgramFibonacci() {
        UserInteraction.printInstruction();

        System.out.println("Enter start: ");
        start = UserInteraction.enterParameters();

        System.out.println("Enter end: ");
        end = UserInteraction.enterParameters();

        fibonacciNumbers(start, end);
    }

}
