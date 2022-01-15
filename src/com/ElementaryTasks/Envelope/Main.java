package com.ElementaryTasks.Envelope;

public class Main {

    public static String yesOrNo;
    public static double sideA, sideB, sideC, sideD;

    public static void main(String[] args) {

        runCompareEnvelope();

        go_onCompareEnvelope();
    }

    public static void runCompareEnvelope() {
        System.out.print("Введите ширину конверта №1 (сторона - \"а\"): ");
        sideA = DataFromUser.data_AnySideOfEnvelope();
        System.out.print("Введите длину конверта №1 (сторона - \"b\"): ");
        sideB = DataFromUser.data_AnySideOfEnvelope();
        Envelopes envelopeOne = new Envelopes(sideA, sideB); // создаем конверт №1 как объект с параметрами

        System.out.print("Введите ширину конверта №2 (сторона - \"c\"): ");
        sideC = DataFromUser.data_AnySideOfEnvelope();
        System.out.print("Введите длину конверта №2 (сторона - \"d\"): ");
        sideD = DataFromUser.data_AnySideOfEnvelope();
        Envelopes envelopeTwo = new Envelopes(sideC, sideD); // создаем конверт №2 как объект с параметрами

        CompareEnvelope.compare(envelopeOne, envelopeTwo);  // передаем в метод compare() оба конверта для сравнения
    }

    public static void go_onCompareEnvelope() {
        System.out.println("Продолжить работу программы (Y/N) ?");
        yesOrNo = DataFromUser.yesOrNo();
        if (yesOrNo.equals("Yes")) {
            runCompareEnvelope();
            go_onCompareEnvelope();
        }
    }
}
