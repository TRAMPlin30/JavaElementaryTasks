package com.ElementaryTasks.LuckyTickets;

import java.util.ArrayList;

public class PiterMethod {

    /**
     * Ленинградский, или Питерский (менее распространённый) — если сумма цифр, стоящих на чётных местах билета,
     * равна сумме цифр, стоящих на нечётных местах билета, то билет считается счастливым (в Санкт-Петербурге,
     * напротив, именно этот способ называют «московским»).
     */

    public static int counter = 0;
    public static int[] tiketsD = new int[6];
    public static ArrayList<Integer> even = new ArrayList<>();
    public static ArrayList<Integer> odd = new ArrayList<>();

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

                for (int i = 0; i < tiketsD.length; i++ ) { //пробегаемся ао списку из цифр (номера билета)
                    int divide = tiketsD[i]%2;
                    if (divide == 0 ) {
                        even.add(tiketsD[i]); //забираем четные элементы в список even
                    } else {
                        odd.add(tiketsD[i]); //забираем четные элементы в список odd
                    }
                }

                int sum1 = 0;
                for (int i = 0; i < even.size(); i++) {
                    sum1 = sum1 + even.get(i); // находим сумму четных элементов
                }

                int sum2 = 0;
                for (int i = 0; i < odd.size(); i++) {
                    sum2 = sum2 + odd.get(i); // находим сумму нечетных элементов
                }


                if (sum1 == sum2) { // сравниваем обе суммы
                    counter = counter + 1;
                    System.out.printf("%d%d%d%d%d%d  - Найден счастливый билет!!! (сумма четных цифр билета равна сумме нечетных цифр билета) \n", f, e, d, c, b, a);
                }
            }
        }System.out.println("Счастливых билетов Питерским методом определения найдено: " + counter + " шт");
    }
}
