package com.trsting;

public class Visoc {

    public static void main(String[] args) {

        System.out.println(isLeapYear(2000));

    }

    public static boolean isLeapYear(int year) {

        if (year % 4 == 0 & year % 100 != 0 & year % 400 != 0 | year == 2000) {
            return true;
        } else
            return false;
    }
}
