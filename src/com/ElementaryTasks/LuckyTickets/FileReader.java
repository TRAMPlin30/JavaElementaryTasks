package com.ElementaryTasks.LuckyTickets;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;

public class FileReader {

    /**
     * Данный класс читает файл с билетами и индикатором для способа подсчета
     * и возвращает из файла список билетов в формате <Integer>,
     * а также индикатор "Moscow" или "Piter" для дальнейшей работы метода подсчета счастливых билетов
     */

    public static ArrayList<String> reader(String filePath) throws IOException {
        /*
         *  считываем текстовый файл с номерами билетов и индикатором для расчета
         */
        ArrayList<String> tickets = new ArrayList<>();
        BufferedReader readerBuff = new BufferedReader(new java.io.FileReader(filePath));
        String string;
        String newString;

        while ((string = readerBuff.readLine()) != null) {

            newString = string.replaceAll(" ", ""); // убираем пробелы
            tickets.add(newString);
        }
        return tickets; // формируем список <String>
    }

    //----------------------------------------------------------------------------------------------------------------------
    public static String getIndicator(ArrayList<String> tickets) {
        /*
         *  ловим в списке <String> слова "Moscow" или "Piter" для индикатора в функцию способа подсчета
         */
        String indicator = "";
        ListIterator<String> iter = tickets.listIterator();
        String substring;
        while (iter.hasNext()) {
            substring = iter.next();
            if ((substring.equalsIgnoreCase("Moscow"))
                    || (substring.equalsIgnoreCase("Piter"))) {
                indicator = iter.previous();
                break;
            }
        }
        return indicator;
    }

    //----------------------------------------------------------------------------------------------------------------------
    public static ArrayList<Integer> removeMethod(ArrayList<String> tickets) {
        /*
         *  удаляем пробелы и слова "Moscow" или "Piter" из списка <String> билетов для конвертации списка из String в Integer
         */
        ListIterator<String> iter = tickets.listIterator();
        String substring;
        while (iter.hasNext()) {
            substring = iter.next();
            if ((substring.equalsIgnoreCase("Moscow"))
                    || (substring.equalsIgnoreCase("Piter"))
                    || (substring.equalsIgnoreCase(""))) {
                iter.remove();
            }
        }
        /*
         *   конвертируем список из String в Integer для дальнейшей обработки билетов в функции подсчета
         */
        ArrayList<Integer> ticketsNumber = new ArrayList<>();
        for (String i : tickets) {
            int ticket = Integer.parseInt(i);
            ticketsNumber.add(ticket);
        }
        return ticketsNumber;
    }
    //----------------------------------------------------------------------------------------------------------------------
}
