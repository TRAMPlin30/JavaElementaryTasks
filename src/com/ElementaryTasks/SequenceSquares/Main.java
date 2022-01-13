package com.ElementaryTasks.SequenceSquares;

public class Main {
    public static void main(String[] args) {
        // 7. Числовая последовательность
        sequence(27);

    }
    public static void sequence(int n) {

        double sqrt_from_n = Math.sqrt(n);
        int sqr = (int) sqrt_from_n;

        for (int i=1; i <= sqr; i+=1) {

            System.out.printf("%s, ", i);
        }
    }
}
