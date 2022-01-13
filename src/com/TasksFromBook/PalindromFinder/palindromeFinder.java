package com.TasksFromBook.PalindromFinder;

import java.util.Scanner;

/**
 * Напишите программу которая  проверяет введенное с клавиатуры число и говорит
 * является ли данное число палиндромом.
 * Палиндром - это число которое читается одинаково и спереди назад и сзади наперед.
 * Примеры 12321, 45654, 787 и т.д.
 * Дополнительное условие: программа принимает только числа длинной 5 знаков.
 * В случае если было введено число длинной != 5, программа должна выполнить еще
 * одно прохождение цикла и попросить снова ввести значение с клавиатуры.
 */
public class palindromeFinder {
    public static int f, lengh;

    public static void main(String[] args) {

        do_loop();

        String to_string = Integer.toString(f);
        lengh = to_string.length();

        if (lengh != 5) {
            do {
                System.out.println("Вы ввели не пятизначное число...");

                do_loop();

                String to_string_1 = Integer.toString(f); // преобразовываем число f в строку
                lengh = to_string_1.length();
            } while (lengh != 5);
        }
        System.out.println("Вы ввели пятизначное число : " + f);

        String string_result = Integer.toString(f);
        char a, b, c, d, e;
        a = string_result.charAt(0); // функция charAt() извлекает символ по индексу и возвращает его
        b = string_result.charAt(1);
        c = string_result.charAt(2);
        d = string_result.charAt(3);
        e = string_result.charAt(4);
        //System.out.println(a + "," + b + "," + c + "," + d + "," + e);
        if (a == e && b == d) {
            System.out.println("Введенное вами число " + f + " является палиндромом.");
        } else {
            System.out.println("Введенное вами число " + f + " не является палиндромом.");
        }
    }

    static int is_digit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пятизначное число для проверки: ");
        if (scanner.hasNextInt()) {
            return scanner.nextInt();

        } else {
            System.out.println("Вы ввели не целое пятизначное число!!!");
            return is_digit();
        }
    }

    static int do_loop() {
        do {
            f = is_digit();
        } while (f == 0);
        return f;
    }

}
