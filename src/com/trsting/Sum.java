package com.trsting;

import java.util.List;
import java.util.OptionalInt;

public class Sum {
    public static void main(String[] args) {
        sumOfDigits(528);

    }

    public static int sumOfDigits(int number) {
        int result = 0;
        String num = Integer.toString(number);
        char[] chars = num.toCharArray();
        for (char ch: chars) {
                String st = Character.toString(ch);
                int it = Integer.parseInt(st);
                result = result + it;
        }
        return result;
    }
}
