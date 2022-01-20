package com.ElementaryTasks.LuckyTickets;

import java.util.ArrayList;

public class PiterMethod {

    public static int counter = 0;
    public static int[] tiketsD = new int[6];
    public static int[] even = new int[3];
    public static int[] odd = new int[3];

    public static void calculate(ArrayList<Integer> tickets) {

        int a, b, c, d, e, f;
        for (Integer ticket : tickets) {

            if (ticket.toString().length() == 6) {

                a = ticket % 10; ticket = ticket / 10;
                b = ticket % 10; ticket = ticket / 10;
                c = ticket % 10; ticket = ticket / 10;
                d = ticket % 10; ticket = ticket / 10;
                e = ticket % 10; ticket = ticket / 10;
                f = ticket % 10;
                //System.out.printf("%-5d, %-5d, %-5d, %-5d, %-5d, %-5d \n", f, e, d, c, b, a);
                tiketsD = new int[]{f, e, d, c, b, a};
                for (int i = 0; i <= tiketsD.length; i++ ) {
                    int divide = tiketsD[i]%2;
                    if (divide == 0 ) {


                    }
                }
                if (f + e + d == c + b + a) {
                    counter = counter + 1;
                    System.out.printf("%d%d%d%d%d%d  - Найден счастливый билет!!! (сумма четных цифр билета равна сумме нечетных цифр билета) \n", f, e, d, c, b, a);
                }
            }
        }System.out.println("Счастливых билетов Питерским методом определения найдено: " + counter + " шт");
    }
}
