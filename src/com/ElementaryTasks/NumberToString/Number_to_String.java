package com.ElementaryTasks.NumberToString;

import java.util.List;

public class Number_to_String {

    private static final String[] UNITS = {"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь",
            "девять"};
    private static final String[] DIGITS = {"","одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", // пустой элемент - для того что б не отнимать 1 от индекса (строка -39 MainCases)
            "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
    private static final String[] DOZENS = {"","десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", // пустой элемент - для того что б не отнимать 1 от индекса (строка -37 MainCases)
            "восемьдесят", "девяносто"};
    private static final String[] HUNDREDS = {"","сто", "двести", "триста", "четыреста", "пятьсот", // пустой элемент - для того что б не отнимать 1 от индекса (строка -68 MainCases)
            "шестьсот", "семьсот", "восемьсот", "девятьсот"};

    public static void transform(int number) {

        if (number >=0  && number <= 999999999) {

            List<Integer> numList = InputNumber.numberList(number);                       // [4, 5, 2, 0, 1, 5, 4, 7, 8] число 452015478 в список из отдельных цифр
            int size = numList.size();                                                    //длина списка [4, 5, 2, 0, 1, 5, 4, 7, 8]

            switch (size) {

                case 1: { // [9]
                    String oneDigit = MainCases.caseOne(numList, UNITS);
                    System.out.print(oneDigit);
                } break;

                case 2: { // [9,9]
                    String twoDigit = MainCases.caseTwo(numList, UNITS, DIGITS, DOZENS);
                    System.out.println(twoDigit);
                } break;

                case 3: { // [9,9,9]
                    String threeDigit = MainCases.caseThree(numList, UNITS, DIGITS, DOZENS, HUNDREDS);
                    System.out.println(threeDigit);
                } break;

                case 4: { // [9, 9,9,9]
                    List<Integer> part1 = numList.subList(0, 1);          //разбиваем numList на подлисты (от 0 до 1 (без учета 1)) [5]
                    List<Integer> part3 = numList.subList(1,4);         //разбиваем numList на подлисты (от 0 до 4 (без учета 4)) [5,5,5]
                    String oneD = MainCases.caseOne(part1, UNITS);
                    String threeD = MainCases.caseThree(part3, UNITS, DIGITS, DOZENS, HUNDREDS);
                    if (oneD.equals("один")) {
                        System.out.print(oneD.replaceFirst("один", "одна тысяча ") + threeD);
                    } else if (oneD.equals("два")) {
                        System.out.print(oneD.replaceFirst("два", "две тысячи ") + threeD);
                    } else if (oneD.equals("три") || oneD.equals("четыре")) {
                        System.out.print(oneD + " тысячи " + threeD);
                    } else {
                        System.out.print(oneD + " тысяч " + threeD);
                    }
                } break;

                case 5: { // [9,9, 9,9,9]
                    List<Integer> part2 = numList.subList(0, 2);
                    List<Integer> part3 = numList.subList(2,5);
                    String twoD = MainCases.caseTwo(part2, UNITS, DIGITS, DOZENS);
                    String threeD = MainCases.caseThree(part3, UNITS, DIGITS, DOZENS, HUNDREDS);
                    MainCases.maleFemale(twoD, threeD);
                } break;

                case 6: { // [9,9,9, 9,9,9]
                    List<Integer> part3_1 = numList.subList(0, 3);
                    List<Integer> part3_2 = numList.subList(3,6);
                    String threeD_1 = MainCases.caseThree(part3_1, UNITS, DIGITS, DOZENS, HUNDREDS);
                    String threeD_2 = MainCases.caseThree(part3_2, UNITS, DIGITS, DOZENS, HUNDREDS);
                    MainCases.maleFemale(threeD_1,threeD_2);
                } break;

                case 7: { // [9, 9,9,9, 9,9,9]

                }


            }
        }
    }
}
