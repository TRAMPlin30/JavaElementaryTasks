package com.TasksFromBook.NumberToEven;

import java.util.ArrayList;
import java.util.Scanner;

public class number_to_even {
    /**
     * Задание 15.24
     * Напишите класс, который принимает с клавиатуры целое число и выводит на экран:
     * • в первой строке - все четные (по месту) цифры этого числа, через
     * пробел;
     * • во второй строке - все нечетные (по месту) цифры этого числа,
     * через пробел.
     * Например, для числа 765873 в первой строке будет выведена серия 6 8 3,
     * а во второй строке - 7 5 7.
     */

    public static int number;
    public static ArrayList<Integer> list_of_numbers;

    public static void main(String[] args) {

        number = numberFromUser();

        list_of_numbers = list_of_numbers(number);

        result(list_of_numbers);

    }

    static int numberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите любое положительное число от 1 до 2147483647: ");
        if (scanner.hasNextInt()) { //boolean
            int number = scanner.nextInt(); // int
            if (number < 1) {
                System.out.println("Вы ввели отрицательное число!!!");
                return numberFromUser();
            } else {
                return number;
            }
        } else if (scanner.hasNextDouble()) { // isInteger()
            System.out.println("Вы ввели число, которое превышает диапазон \"Integer\" !!!");
            return numberFromUser();
        } else {
            System.out.println("Вы ввели строку !!!");
            return numberFromUser();
        }
    }

    static ArrayList<Integer> list_of_numbers(int number) {

        ArrayList<Integer> list_of_numbers = new ArrayList<>();

        String number_str = Integer.toString(number); // number to String
        char[] result_char = number_str.toCharArray(); // String to list of char - [char(1), char(2),... char(n)]
        int length_char = result_char.length;

        for (int i = 0; i < length_char; i++) {
            char one_char_from_result_char = result_char[i];
            String string_from_char = Character.toString(one_char_from_result_char);
            int number_of_list = Integer.parseInt(string_from_char);
            list_of_numbers.add(number_of_list); // number/10....1000 ()
        }
        return list_of_numbers;
    }

    static void result(ArrayList<Integer> list_of_numbers) {
        String even = "";
        String odd = "";
        for (int i : list_of_numbers) {
            int x = i % 2;
            if (x == 0) {
                even = even + " " + i;
            } else {
                odd = odd + " " + i;
            }
        }
        System.out.println("Четные составляющие числа "+ number + ": " + even);
        System.out.println("Нечетные составляющие числа "+ number + ": " + odd);
    }
}
