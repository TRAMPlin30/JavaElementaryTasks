package com.ElementaryTasks.SequenceSquares;

import java.util.Scanner;

public class UserInteraction {

    public static void printInstruction() {
        System.out.println("This program displays a sequence of numbers whose square is less than a given.");
        System.out.println("Enter the parameter you need.");
        System.out.println("The program accepts as parameters any positive numbers in the range from 1 to 2147483647.");
    }

    public static int enterParameters() {

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int parameter = scanner.nextInt();
            if ((parameter > 0)) {
                return parameter;
            } else {
                System.out.print("Error!!! \n" +
                        "Parameter cannot be negative or zero, \n");
                return enterParameters();
            }
        } else {
            System.out.print("Error!!! \n" +
                    "You didn't enter an integer number, please enter an integer number: ");
            return enterParameters();
        }
    }
}


