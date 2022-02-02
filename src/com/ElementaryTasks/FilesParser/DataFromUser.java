package com.ElementaryTasks.FilesParser;

import java.io.*;
import java.util.Scanner;

public class DataFromUser {

    public static String modeSelection() {
        System.out.println("Choose the mode of the file parser. \n");
        System.out.println("Enter - 1: parser will find the quantity of string in your file");
        System.out.println("In this case you must enter the path to the file and also you mast determine word or string which you find. \n");
        System.out.println("Enter - 2: parser will replace the existing string with another in your file");
        System.out.println("In this case you must enter the path to the file and also you mast determine word or string which you replace. \n");
        System.out.print("What mode will you choose: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            String answer = scanner.next();
            boolean answerOne = answer.equals("1");
            boolean answerTwo = answer.equals("2");
            if (answerOne) {
                return "1";
            } else if (answerTwo) {
                return "2";
            } else {
                System.out.println("Error!!! (incorrect data) ");
                System.out.println("Enter:  \"1\" - parser will find the quantity of string in your file");
                System.out.println("Enter:  \"2\" - parser will replace the existing string with another in your file");
                return modeSelection();
            }
        } else {
            System.out.println("Error!!! (incorrect data) ");
            System.out.println("Enter:  \"1\" - parser will find the quantity of string in your file");
            System.out.println("Enter:  \"2\" - parser will replace the existing string with another in your file");
            return modeSelection();
        }
    }

    public static String enterParameters() {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            String param = bufferedReader.readLine();
            return param;
        } catch (IOException e) {
            System.out.println("Error!!! (incorrect data) ");
        }
        return enterParameters();
    }
}
