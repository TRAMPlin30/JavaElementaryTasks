package com.ElementaryTasks.Envelope;

import java.util.Scanner;

public class DataFromUser {

    public DataFromUser() {
    }

    public static double data_AnySideOfEnvelope() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextDouble()) {
            double AnySide = scanner.nextDouble();
            if (AnySide > 0) {
                return AnySide;
            } else {
                System.out.println("ОШИБКА!!!  Размер конверта не может быть отрицательным или равен нулю!!! ");
                return data_AnySideOfEnvelope();
            }
        } else {
            System.out.println("ОШИБКА!!!  Вы ввели не число. Введите число!!! ");
            return data_AnySideOfEnvelope();
        }
    }

    public static String yesOrNo() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            String answer = scanner.next();
            Boolean answerYes = answer.equalsIgnoreCase("Y");
            Boolean answerNo = answer.equalsIgnoreCase("N");
            if (answerYes) {
                return "Yes";
            } else if (answerNo) {
                return "No";
            } else {
                System.out.println("ОШИБКА !!! (некорректные данные) ");
                System.out.println("\"Y\" - продолжить работу программы");
                System.out.println("\"N\" - завершить работу программы");
                return yesOrNo();
            }
        } else {
            System.out.println("ОШИБКА !!! (некорректные данные) ");
            System.out.println("\"Y\" - продолжить работу программы");
            System.out.println("\"N\" - завершить работу программы");
            return yesOrNo();
        }
    }
}
