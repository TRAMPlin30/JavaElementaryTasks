package com.TasksFromBook.SortingMapComparingByValue;

import java.io.*;
import java.util.Scanner;

public class UserMAP {

    public static void instruction() {
        System.out.println("\nThe program displays triangles in descending order of their area.");
        System.out.println("Enter the parameter to create Triangle");
        System.out.println("The program accepts as parameters any positive numbers. \n");
    }

    public static float enter() {

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextFloat()) {
            float parameter = scanner.nextFloat();
            if ((parameter > 0)) {
                return parameter;
            } else {
                System.out.print("Error!!! \n" +
                        "Parameter cannot be negative or zero, \n");
                return enter();
            }
        } else {
            System.out.print("Error!!! \n" +
                    "You didn't enter a number, please enter a number: ");
            return enter();
        }
    }

    public static String enterName() {

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            String param = bufferedReader.readLine();
            return param;
        } catch (IOException e) {  // зачем данный IOException - что он ловит???
            System.out.println("Error!!!  Enter correct parameters! ");
        }
        return enterName();
    }

    public static String yesOrNo() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            String answer = scanner.next();
            boolean answerYes = answer.equalsIgnoreCase("Y");
            boolean answerNo = answer.equalsIgnoreCase("N");
            if (answerYes) {
                return "Yes";
            } else if (answerNo) {
                return "No";
            } else {
                System.out.println("Error!!!  Enter correct parameters! ");
                System.out.println("\"Y\" - continue the program");
                System.out.println("\"N\" - terminate the program");
                return yesOrNo();
            }
        } else {
            System.out.println("Error!!!  Enter correct parameters! ");
            System.out.println("\"Y\" - continue the program");
            System.out.println("\"N\" - terminate the program");
            return yesOrNo();
        }
    }
}


