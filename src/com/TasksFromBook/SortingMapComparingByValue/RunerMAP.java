package com.TasksFromBook.SortingMapComparingByValue;

import java.util.*;


public class RunerMAP {

    public static String yesOrNo;
    public static float sideA, sideB, sideC;
    public static String name;
    public static Map<String, Float> map = new HashMap<>();

    public static void main(String[] args) {


        runProcess();

    }

    private static void runProcess() {

        TriangleMAP trFirst = triangleBuild();
        map.put(trFirst.getName(), trFirst.getSquare());                                  //добавляем первый треугольник

        while (continueBuild()) {                          // спрашиваем у пользователя, хочет ли он добавить еще один и если "Yes", то в цикле добавляем пока не выберет "No"
            TriangleMAP trOther = triangleBuild();
            map.put(trOther.getName(), trOther.getSquare());
        }
//------------------------------------------------------------------------------------------

        map.entrySet().stream().
                sorted(Map.Entry.comparingByValue()).
                forEach(System.out::println);

        System.out.println();

        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);


//------------------------------------------------------------------------------------------

        //Map<String, Float> sortedMap = new TreeMap<>(map);
        printMap(map);
    }

    private static TriangleMAP triangleBuild() {

        System.out.print("Enter name of Triangle: ");
        name = UserMAP.enterName();
        System.out.print("Enter size of side A: ");
        sideA = UserMAP.enter();
        System.out.print("Enter size of side B: ");
        sideB = UserMAP.enter();
        System.out.print("Enter size of side C: ");
        sideC = UserMAP.enter();
        TriangleMAP triangle = new TriangleMAP(name, sideA, sideB, sideC);
        return triangle;
    }

    private static boolean continueBuild() {
        System.out.println("Want to add another triangle? (Y/N) ");
        yesOrNo = UserMAP.yesOrNo();
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

