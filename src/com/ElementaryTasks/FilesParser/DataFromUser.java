package com.ElementaryTasks.FilesParser;

import java.io.*;
import java.util.Scanner;

public class DataFromUser {

    public static String modeSelection() {
        System.out.println("Выберете режим работы парсера текстовых (txt) файлов. \n");
        System.out.println("Введите - 1: парсер найдет указанную Вами строку в указанном Вами файле");
        System.out.println("В данном режиме Вам нужно будет указать искомую строку и путь к файлу с учетом имени. \n");
        System.out.println("Введите - 2: парсер заменит указанную Вами строку в  на необходимую в указанном Вами файле");
        System.out.println("В данном режиме Вам нужно будет указать строки для поиска и замены а также путь к файлу с учетом имени. \n");
        System.out.print("Сделайте Ваш выбор: ");
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
                System.out.println("ОШИБКА !!! (некорректные данные) ");
                System.out.println("Введите:  \"1\" - работа программы в режиме поиска указанной строки в файле");
                System.out.println("Введите:  \"2\" - работа программы в режиме замены указанной строки в файле");
                return modeSelection();
            }
        } else {
            System.out.println("ОШИБКА !!! (некорректные данные) ");
            System.out.println("Введите:  \"1\" - работа программы в режиме поиска указанной строки в файле");
            System.out.println("Введите:  \"2\" - работа программы в режиме замены указанной строки в файле");
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
            System.out.println("ОШИБКА!!!  Введите данные в соответствии с запросом! ");
        }
        return enterParameters();


        //Scanner scanner = new Scanner(System.in);
        //if (scanner.hasNext()) {
        //String answer = scanner.next();
        //return answer;
        //} else {
        //System.out.println("ОШИБКА!!!  Введите данные в соответствии с запросом! ");
        //return enterParameters();
        //}
    }

}
