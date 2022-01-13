package com.ElementaryTasks.Envelope;

public class Calculation {

    private double a;
    private double b;
    private double c;
    private double d;

    public Calculation(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public void calculate() {
        double square_1 = a * b;
        double square_2 = c * d;
        if (a < c && b < d && square_1 < square_2) {
            System.out.println("Вы можете вложить конверт №1 в конверт №2 ");
        } else if (c < a && d < b && square_2 < square_1) {
            System.out.println("Вы можете вложить конверт №2 в конверт №1 ");
        } else {
            System.out.println("Конверты №1 и №2 невозможно вложить друг в друга.");
        }
    }
}
