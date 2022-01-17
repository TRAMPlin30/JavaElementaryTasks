package com.ElementaryTasks.SortingTrianglesSet;

import java.util.*;


public class RunerSet {

    public static String yesOrNo;
    public static float sideA, sideB, sideC;
    public static String name;
    public static Set<TriangleSet> setT = new HashSet<>();

    public static void main(String[] args) {

        UserSet.instruction();

        runProcess();

    }

    private static void runProcess() {

        TriangleSet trFirst = triangleBuild();
        setT.add(trFirst);                                  //добавляем первый треугольник

        while (continueBuild()) {                          // спрашиваем у пользователя, хочет ли он добавить еще один и если "Yes", то в цикле добавляем пока не выберет "No"
            TriangleSet trOther = triangleBuild();
            setT.add(trOther);
        }

        try {
            Set<TriangleSet> sortSetT = new TreeSet<>(setT);
            print(sortSetT);
        } catch (NullPointerException e) {
            System.out.println("I can't show this triangle because I can't build a triangle with this parameters!!!");
        }
    }


    private static TriangleSet triangleBuild() {

        System.out.print("Enter name of Triangle: ");
        name = UserSet.enterName();
        System.out.print("Enter size of side A: ");
        sideA = UserSet.enter();
        System.out.print("Enter size of side B: ");
        sideB = UserSet.enter();
        System.out.print("Enter size of side C: ");
        sideC = UserSet.enter();
        TriangleSet triangle = new TriangleSet(name, sideA, sideB, sideC);
        return triangle;
    }

    private static boolean continueBuild() {
        System.out.println("Want to add another triangle? (Y/N) ");
        yesOrNo = UserSet.yesOrNo();
        if (yesOrNo.equals("Yes")) {
            return true;
        }
        return false;
    }

    private static void print(Set<TriangleSet> triangles) {
        System.out.println("==========Triangles List==============");
        System.out.printf("%s    %s \n", "Name", "Square");
        for (TriangleSet tr : triangles) {
            System.out.printf("[" + "%s" + "]:  %s", tr.getName(), tr.getSquare() + " cm \n");
        }
    }
}

