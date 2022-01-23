package com.ElementaryTasks.LuckyTickets;

import java.util.ArrayList;

public class MoscowMethod {
    /**
     * Московский — если на автобусном билете напечатано шестизначное число,
     * и сумма первых трёх цифр равна сумме последних трёх, то этот билет считается счастливым.
     */

    public static int counter = 0;

    public static void calculate(ArrayList<Integer> tickets) {

        int a, b, c, d, e, f;
        for (Integer ticket : tickets) {

            if (ticket.toString().length() == 6) {

                a = ticket % 10; ticket = ticket / 10;
                b = ticket % 10; ticket = ticket / 10;
                c = ticket % 10; ticket = ticket / 10;
                d = ticket % 10; ticket = ticket / 10;
                e = ticket % 10;ticket = ticket / 10;
                f = ticket % 10;
                //System.out.printf("%-5d, %-5d, %-5d, %-5d, %-5d, %-5d \n", f, e, d, c, b, a);
                if (f + e + d == c + b + a) {
                    counter = counter + 1;
                    System.out.printf("%d%d%d%d%d%d  - Найден счастливый билет!!! (сумма первых трех цифр равна сумме последних трех цифр) \n", f, e, d, c, b, a);
                }
            }
        }System.out.println("Счастливых билетов Московским методом определения найдено: " + counter + " шт");
    }
}
