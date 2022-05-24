package com.trsting;

public class Year {
    public static void main(String[] args) {

        System.out.println(century(1705));
        System.out.println(century(1900));
        System.out.println(century(701));
        System.out.println(century(2012));
        System.out.println(century(89));

    }
    public static int century(int year) {

        if (year % 100 == 0) {
            return (year/100);
        }
        return (year/100)+1;
    }
}
