package com.ElementaryTasks.ChessBoard;

import java.util.Scanner;

public class UserInteraction {

    public void printInstruction() {
        System.out.println("This program will build a chessboard. \n");
        System.out.println("Enter width and height to build. \n");
        System.out.println("The program accepts as parameters any positive numbers in the range from 1 to 100. \n");
    }


    public int enterParameters() {

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int parameter = scanner.nextInt();
            if ((parameter > 0) && (parameter <= 100)) {
                return parameter;
            } else {
                System.out.print("Error!!! \n" +
                        "Dimensions cannot be negative or zero, \n" + "or mo then 100, please enter a correct parameter: ");
                return enterParameters();
            }
        } else {
            System.out.print("Error!!! \n" +
                    "You didn't enter an integer number, please enter an integer number: ");
            return enterParameters();
        }
    }
}


