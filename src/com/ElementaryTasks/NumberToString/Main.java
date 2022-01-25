package com.ElementaryTasks.NumberToString;

public class Main {

    public static void main(String[] args) {

        UserInteraction.printInstruction();
        int number = UserInteraction.enterNumber();

        /**
         * Метод transform(); на данный момент принимает в себя любое число от 0 до 1000000000.
         * Дальнейший функционал в доработке
         */

        Number_to_String.transform(number);
    }

}
