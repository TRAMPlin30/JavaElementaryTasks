package com.ElementaryTasks.SortingTrianglesMap;

import java.util.*;

public class Main {

    public static String yesOrNo;
    public static float sideA, sideB, sideC;
    public static String name;
    public static HashMap<String, Float> map = new HashMap<>();


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

        sortMap(map);

        System.out.println();


        //System.out.println(map);
    }
    private static HashMap<String, Float> sortMap(Map<String, Float> map){
        //DecimalFormat df = new DecimalFormat("0.00");
        HashMap<String, Float> sortedMap = new HashMap<>();
        ArrayList<Float> values = new ArrayList<>();
        for (String key: map.keySet()) { // пробегаемся по каждому ключу
            values.add(map.get(key)); // вытаскиваем значения у каждого ключа и ложим в список
        }
        Collections.sort(values);
        System.out.println(values);

        for (String key: map.keySet()) {
            for (float i : values) {

                float min = Collections.min(values);

                if (i == map.get(key) && map.get(key) == min) {
                    sortedMap.put(key, i);

                    //map.values().remove(i);
                }
            }
        }
        System.out.println(sortedMap);
        return sortedMap;
    }

    private static float calcS(Triangle triangle) {
        //DecimalFormat df = new DecimalFormat("0.00");
        float A = (float) triangle.getSideA();
        float B = (float) triangle.getSideB();
        float C = (float) triangle.getSideC();
        float square;
        float p;
        if (triangle.checkTrue()) {
            p = (float) 0.5 * (A + B + C);
            square = (float) Math.sqrt(p * (p - A) * (p - B) * (p - C));
            //String squareResult = df.format(square);
            return square;
        } else {
            System.out.println("I can't build a triangle with this parameters");
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

    private static void printMap(Map<String, Float> map) {
        Set<String> keys = map.keySet();                                       //Set<K> keySet(): возвращает набор всех ключей отображения (https://metanit.com/java/tutorial/5.8.php)
        for (String key : keys) {
            System.out.printf("[" + "%s" + "]:  %s", key, map.get(key) + " cm \n"); //получаем объект по ключу
        }                                                                      // getKey(): возвращает ключ объекта отображения (https://metanit.com/java/tutorial/5.8.php)
    }
}
