package com.ElementaryTasks.AtOnlineLessons;

public class NumberToDigitsList {
    public static void main(String[] args) {
        /**
         * разбиваем число на составляющие (разрады)
         * 789542 -> 7, 8, 9, 5, 4, 2
         */

        dig();
//================================ 1й способ =================================
        int number1 = 789542;
        while (number1 > 0) {

            System.out.println(number1 % 10);

            number1 = number1 / 10;
        }
    }
//================================= 2й способ =================================
    private static void dig() {

        int number = 683453;
        int a, b, c, d, e, f;


            a = number % 10;
            number = number/10;

            b = number % 10;
            number = number/10;

            c = number % 10;
            number = number/10;

            d = number % 10;
            number = number/10;

            e = number % 10;
            number = number/10;

            f = number % 10;
            System.out.printf("%-5d, %-5d, %-5d, %-5d, %-5d, %-5d \n", f, e, d, c, b, a);

    }
}
