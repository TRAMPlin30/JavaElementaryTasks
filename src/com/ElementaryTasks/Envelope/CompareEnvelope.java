package com.ElementaryTasks.Envelope;

public class CompareEnvelope {

    public static void compare(Envelopes SomeEnvelopeOne, Envelopes SomeEnvelopeTwo) {

        double a = SomeEnvelopeOne.getWidth();
        double b = SomeEnvelopeOne.getHeight();

        double c = SomeEnvelopeTwo.getWidth();
        double d = SomeEnvelopeTwo.getHeight();

        if (a < c && b < d) {
            System.out.println("Вы можете вложить конверт №1 в конверт №2 ");
        } else if (c < a && d < b) {
            System.out.println("Вы можете вложить конверт №2 в конверт №1 ");
        } else {
            System.out.println("Конверты №1 и №2 невозможно вложить друг в друга.");
        }
    }
}
