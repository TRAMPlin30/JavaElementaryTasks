package com.ElementaryTasks.LuckyTickets;

import java.io.IOException;
import java.util.ArrayList;


public class MainRunner {

    private static final String PATH_TO_FILE_READ = "D:\\Softserve\\Java_Elementary_Tasks\\Elementary_Tasks\\src\\com\\ElementaryTasks\\LuckyTickets\\Piter.txt";

    public static void main(String[] args) throws IOException {

        ArrayList<String> tickets = FileReader.reader(PATH_TO_FILE_READ);
        String indicator = FileReader.getIndicator(tickets);
        ArrayList<Integer> ticketsDigit = FileReader.removeMethod(tickets);


        if (indicator.equalsIgnoreCase("moscow")) {
            MoscowMethod.calculate(ticketsDigit);
        } else if (indicator.equalsIgnoreCase("piter")){
            PiterMethod.calculate(ticketsDigit);
        } else {
            System.out.println("В файле отсутствует индикатор для выбора способа подсчета");
        }




//        System.out.println(indicator);
//        System.out.println(ticketsDigit);




    }
}
