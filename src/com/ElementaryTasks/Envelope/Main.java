package com.ElementaryTasks.Envelope;

public class Main {

    public static String go_on;
    public static double sideA, sideB, sideC, sideD;

    public static void main(String[] args) {

        runCalculate();

        go_onCalculate();
    }

    public static void runCalculate() {
        System.out.print("Введите ширину конверта №1 (сторона - \"а\"): ");
        sideA = DataFromUser.data_AnySideOfEnvelope();
        System.out.print("Введите длину конверта №1 (сторона - \"b\"): ");
        sideB = DataFromUser.data_AnySideOfEnvelope();

        System.out.print("Введите ширину конверта №2 (сторона - \"c\"): ");
        sideC = DataFromUser.data_AnySideOfEnvelope();
        System.out.print("Введите длину конверта №2 (сторона - \"d\"): ");
        sideD = DataFromUser.data_AnySideOfEnvelope();

        Calculation calculation = new Calculation(sideA, sideB, sideC, sideD);
        calculation.calculate();
    }

    public static void go_onCalculate() {
        System.out.println("Продолжить работу программы (Y/N) ?");
        go_on = DataFromUser.go_on_or_not();
        if (go_on.equals("Yes")) {
            runCalculate();
            go_onCalculate();
        }
    }
}
