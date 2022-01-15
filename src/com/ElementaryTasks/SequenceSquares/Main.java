package com.ElementaryTasks.SequenceSquares;

public class Main {

    public static int parameter;

    public static void main(String[] args) {

        UserInteraction.printInstruction();
        System.out.println("Enter parameter: ");
        parameter = UserInteraction.enterParameters();

        sequence(parameter);
    }
    public static void sequence(int parameter) {
        double sqrt_from_n = Math.sqrt(parameter);
        int sqr = (int) sqrt_from_n;
        for (int i=1; i <= sqr; i+=1) {
            System.out.printf("%s, ", i);
        }
    }
}
