package com.ElementaryTasks.NumberToString;

import java.util.ArrayList;
import java.util.List;

public class InputNumber {

    public static List<Integer> numberList(int number) {        // диапазон int - ( от -2147483648 до 2147483647 )
        List<Integer> digits = new ArrayList<>();
        String str = Integer.toString(number);                  // преобразовываем число, переданное в функцию transform(int number) в строку
        char[] chars = str.toCharArray();                       // делаем из строки массив символов [char(1), char(2),... char(n)]
        for (char ch : chars) {
            String st = Character.toString(ch);                 // из символа в строку
            int stInt = Integer.parseInt(st);                   // из строки в число
            digits.add(stInt);                                  // [4, 5, 2, 0, 1, 5, 4, 7, 8] // число 452015478 в список из отдельных цифр
        }
        return digits;
    }
}
