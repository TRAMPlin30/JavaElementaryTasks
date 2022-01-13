package com.TasksFromBook.GuessGame;

import java.util.Scanner;

/** Задание 10.8
Напишите класс, который принимает с клавиатуры целое число и затем
генерирует («придумывает>>) случайное число из следующего диапазона:
• «центром диапазона» является введенное с клавиатуры число;
• количество чисел в диапазоне равно 11.
Класс должен определять, «угадал» ли компьютер введенное число и
выводить на экран одно из сообщений (в зависимости от соотношения
введенного и «придуманного» чисел):
• угадал - если числа совпали;
• слишком большое - если «придуманное» компьютером число
больше введенного с клавиатуры;
• слишком маленькое - если «придуманное» компьютером число
меньше введенного с клавиатуры.*/

public class guess_game {
    public static void main(String[] args) {
        System.out.println("Введи число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int a = number - 5; // Начальное значение
        int b = number + 5; // Конечное значение

        double c = b - a; // множитель
        double random = Math.random(); // генератор случайного числа в заданном диапазоне (готовый) ?????????
        int random_number1 = ((int) (random * c) + a);

        System.out.println(random_number1);
        System.out.println(c);
        System.out.println(random);
        System.out.println(random * c);
        System.out.println((random * c) + a);

        if (random_number1 > number) {
            System.out.println("сгенерировано слишком большое");
        } else if (random_number1 < number) {
            System.out.println("сгенерировано слишком маленькое");
        } else {
            System.out.println("угадал!!!");
        }

    }
    //Допустим, нам Допустим, нам необходимо получить вещественное число в интервале [ 20; 60) (60 исключительно)
    //public class Test {
    //	public static void main(String[] args){
    //		double a = 20 + Math.random()*40;
    //
    //		System.out.println(a);
    //	}
    //}
}
