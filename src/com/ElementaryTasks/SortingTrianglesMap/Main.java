package com.ElementaryTasks.SortingTrianglesMap;

import java.util.*;

public class Main {

    public static String yesOrNo;
    public static float sideA, sideB, sideC;
    public static String name;
    public static Map<String, Float> map = new TreeMap<>();

    public static void main(String[] args) {

        User.instruction();
        runProcess();

    }

    private static void runProcess() {
        Triangle trFirst = triangleBuild();
        map.put(trFirst.getName(), calcS(trFirst));

        while (continueBuild()) {
            Triangle trOther = triangleBuild();
            map.put(trOther.getName(), calcS(trOther));
        }

        System.out.println("==========Triangles List==============");
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(Main::printMap);
    }

    private static float calcS(Triangle triangle) {
        float A = (float) triangle.getSideA();
        float B = (float) triangle.getSideB();
        float C = (float) triangle.getSideC();
        float square;
        float p;
        if (triangle.checkTrue()) {
            p = (float) 0.5 * (A + B + C);
            square = (float) Math.sqrt(p * (p - A) * (p - B) * (p - C));
            return square;
        } else {
            System.out.println("I can't build a triangle with this parameters!!!");
            return 0;
        }
    }

    private static Triangle triangleBuild() {
        System.out.print("Enter name of Triangle: ");
        name = User.enterName();
        System.out.print("Enter size of side A: ");
        sideA = User.enter();
        System.out.print("Enter size of side B: ");
        sideB = User.enter();
        System.out.print("Enter size of side C: ");
        sideC = User.enter();
        Triangle triangle = new Triangle(name, sideA, sideB, sideC);
        return triangle;
    }

    private static boolean continueBuild() {
        System.out.println("Want to add another triangle? (Y/N) ");
        yesOrNo = User.yesOrNo();
        if (yesOrNo.equals("Yes")) {
            return true;
        }
        return false;
    }

    public static void printMap(Map.Entry<String, Float> map) {
            System.out.printf("[" + "%s" + "]:  %s", map.getKey(), map.getValue() + " cm \n");
    }
}
