package com.ElementaryTasks.NumberToString;

import java.util.Scanner;

public class UserInteraction {

    public static void printInstruction() {
        System.out.println("The program displays a string representation of a number.");

        System.out.println("The program accepts any positive numbers in the range from 0 to 1000000000.");
    }

    public static int enterNumber() {

        System.out.println("Enter your number: ");

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if ((number >= 0) && (number <= 1000000000)) {
                return number;
            } else {
                System.out.print("Error!!! \n" +
                        "Out of range!!!, \n" + "please enter a correct number. \n");
                System.out.print("The program accepts any positive numbers in the range from 0 to 1000000000. \n");
                return enterNumber();
            }
        } else {
            System.out.print("Error!!! \n" +
                    "You didn't enter an integer number, please enter an integer number \n");
            System.out.print("The program accepts any positive numbers in the range from 0 to 1000000000. \n");
            return enterNumber();
        }
    }
}


