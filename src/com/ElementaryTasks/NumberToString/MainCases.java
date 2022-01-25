package com.ElementaryTasks.NumberToString;

import java.util.List;

public class MainCases {

     //-------------------------- случай, когда в списке list одна цифра - [5] ----------------------------------------
        public static String caseOne(List<Integer> list, // подаем на вход список из цифр list (результат работы InputNumber.numberList(int number)
                                 String[] UNITS) {       // и подаем на вход список UNITS (строчное представление чисел от 1 до 9)
        int num1 = list.get(0);                          // смотрим какое число лежит в списке по единственному индексу [0]
        if (num1 >= 0 && num1 <= 9 ) {                   // если число в диапазоне от 0 до 9
            return UNITS[num1];                          // возвращаем соответствующее строчное представление числа согласно индексу UNITS
        } return ("");
    }

    //-------------------------- случай, когда в списке list две цифры - [1,5] или [2,7] -----------------------------
    public static String caseTwo(List<Integer> list,                 // подаем на вход список из цифр list (результат работы InputNumber.numberList(int number)
                                 String[] UNITS,                     // и подаем на вход список UNITS (строчное представление чисел от 1 до 9)
                                 String[] DIGITS,                    // и подаем на вход список DIGITS (строчное представление чисел от 10 до 19)
                                 String[] DOZENS) {                  // и подаем на вход список DOZENS (строчное представление чисел от 20 до 90)
        int num1 = list.get(0);                                      // смотрим какое число лежит в списке по единственному индексу [0]
        int num2 = list.get(1);                                      // смотрим какое число лежит в списке по единственному индексу [1]
        if (num1 >= 1 && num2 == 0) {                                //[1-9,0]// если число из диапазона списка DOZENS [10,20,30,40....90]
            return (DOZENS[num1]);                                   // twoCase берем из списка DOZENS
        } else if (num1 == 1 && num2 > 0) {                          //[1,1-9]// если число из диапазона списка DIGITS [11,12,13....19]
            return (DIGITS[num2]);                                   // twoCase берем из списка DIGITS
        } else {
            return (DOZENS[num1] + " " + UNITS[num2]+" ");               //[2-9,1-9]// если число из диапазона 21 - 99
        }
    }

    //-------------------------- случай, когда в списке list три цифры - [1,5,8] или [7,2,3] -------------------------
    public static String caseThree(List<Integer> list,
                                 String[] UNITS,
                                 String[] DIGITS,
                                 String[] DOZENS,
                                 String[] HUNDREDS) {
        int num1 = list.get(0);
        int num2 = list.get(1);
        int num3 = list.get(2);
        if (num1 >=1 && num2 == 0 && num3 == 0) {
            return HUNDREDS[num1];                                                  // 100 - 900
        } else if (num1 == 1 && num2 == 0 && num3 > 0) {
            return (HUNDREDS[num1] + " " + UNITS[num3]);                           //101 - 109
        } else if (num3 == 0) {
            return (HUNDREDS[num1] + " " + DOZENS[num2]);                          // 110, 130 ...990
        } else if (num2 == 1 && num3 > 0) {
            return (HUNDREDS[num1] + " " + DIGITS[num3]);                          // 111 - 119
        } else {
            return (HUNDREDS[num1] + " " + DOZENS[num2]+" "+UNITS[num3]+" ");         //121...555...965  // пробел в конце нужен для нормальной работы функции maleFemale
        }
    }

    //-------------------------- метод, для замены случаев вывода тысяч ----------------------------------------------
    public static void maleFemale(String str1, String str2) {

        if (!str1.equals(" ")) { // для миллиона - если стотысячные значения нулевые 2000002, 2000587, 1000021, 1000001, 5000521
            if (str1.contains(" один")) {
                System.out.print(str1.replaceFirst(" один", " одна тысяча ")+str2);
            } else if (str1.contains(" два ")) {
                System.out.print(str1.replaceFirst(" два ", " две тысячи ") + str2);
            } else if (str1.contains(" три ") || str1.contains(" четыре ")) {
                System.out.print(str1 + " тысячи " + str2);
            } else {
                System.out.print(str1 + " тысяч " + str2); // str = 5,6,7,8,9,10...
            }
        } else {
            System.out.print(str2);
        }
    }

    //----------------------------------- метод, для замены случаев вывода миллионов ------------------------------------
    public static void maleFemaleM(String str1, String str2, String str3) {
        if (str1.contains(" один ")) {
            int a=1;
            System.out.print(str1 + " миллион ");
            MainCases.maleFemale(str2,str3);
        } else if (str1.contains("два ") || str1.contains("три ") || str1.contains("четыре ")) {
            System.out.print(str1 + " миллиона ");
            MainCases.maleFemale(str2, str3);
        }else if (str1.contains(" два  ") || str1.contains(" три  ") || str1.contains(" четыре  ")) {
            System.out.print(str1 + " миллиона ");
            MainCases.maleFemale(str2, str3);
        } else if (str1.contains(" два ") || str1.contains(" три ") || str1.contains(" четыре ")) {
            System.out.print(str1 + " миллиона ");
            MainCases.maleFemale(str2, str3);
        } else {
            System.out.print(str1 + " миллионов ");
            MainCases.maleFemale(str2, str3);
        }
    }
}
