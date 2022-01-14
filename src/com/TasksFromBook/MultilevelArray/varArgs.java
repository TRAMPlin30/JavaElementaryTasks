package com.TasksFromBook.MultilevelArray;

public class varArgs {
    public static void main(String[] args) {

        varArgs();

    }

    public static void varArgs() {
        double a = 0.56;
        double b = 2.96;
        double c = 3.46;
        double d = 0.26;

        System.out.println("Среднее арифметическое двух элементов : " + calcAverage(a, b));
        System.out.println("Среднее арифметическое четырех элементов : " + calcAverage(a, b, c, d));

    }

    public static double calcAverage(double... args) { //аргумент переменной длины
        double sum = 0;
        for (double i: args) {
            sum = sum + i;
        }
        return sum/args.length;
    }


}
