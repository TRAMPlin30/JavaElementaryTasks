package com.ElementaryTasks.SortingTriangles;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Set;

public class Main {

    public static String yesOrNo;
    public static double sideA, sideB, sideC;
    public static String name;
    public static HashMap<String, String> map = new HashMap<>();

    public static void main(String[] args) {

        User.instruction();

        runProcess();

    }

    private static void runProcess() {

        Triangle trFirst = triangleBuild();
        map.put(trFirst.getName(), calcS(trFirst));        //добавляем первый треугольник

        while (continueBuild()) {                          // спрашиваем у пользователя, хочет ли он добавить еще один и если "Yes", то в цикле добавляем пока не выберет "No"
            Triangle trOther = triangleBuild();
            map.put(trOther.getName(), calcS(trOther));
        }
        printMap(map);
        //System.out.println(map);
    }

    private static String calcS(Triangle triangle) {
        DecimalFormat df = new DecimalFormat("0.00");
        double A = triangle.getSideA();
        double B = triangle.getSideB();
        double C = triangle.getSideC();
        double square;
        double p;
        if (triangle.checkTrue()) {
            p = 0.5 * (A + B + C);
            square = Math.sqrt(p * (p - A) * (p - B) * (p - C));
            String squareResult = df.format(square);
            return squareResult;
        } else {
            System.out.println("I can't build a triangle with this parameters");
            return null;
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

    private static void printMap(HashMap<String, String> map) {
        Set<String> keys = map.keySet();                                       //Set<K> keySet(): возвращает набор всех ключей отображения (https://metanit.com/java/tutorial/5.8.php)
        for (String key : keys) {
            System.out.printf("[" + "%s" + "]:  %s", key, map.get(key) + " cm \n");
        }                                                                      // getKey(): возвращает ключ объекта отображения (https://metanit.com/java/tutorial/5.8.php)
    }
}
