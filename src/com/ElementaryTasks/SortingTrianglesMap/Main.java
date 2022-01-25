package com.ElementaryTasks.SortingTrianglesMap;

import java.util.*;
import java.util.stream.Collectors;

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
        map.put(trFirst.getName(), calcS(trFirst));        //добавляем первый треугольник

        while (continueBuild()) {                          // спрашиваем у пользователя, хочет ли он добавить еще один и если "Yes", то в цикле добавляем пока не выберет "No"
            Triangle trOther = triangleBuild();
            map.put(trOther.getName(), calcS(trOther));   // формируем словарь ключей и значений
        }

//========================================== function to sort Map with stream() ==========================================
        /**
         * Коллекции, на основе которых нередко создаются потоки, уже имеют специальные методы для сортировки содержимого.
         * Однако класс Stream также включает возможность сортировки. Такую сортировку мы можем задействовать, когда у
         * нас идет набор промежуточных операций с потоком, которые создают новые наборы данных, и нам надо эти наборы отсортировать.
         *
         * Для простой сортировки по возрастанию применяется метод sorted():
         */

        //--------------- сортировка в порядке возростания значений ---------------
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
/**
 * first=9.165152
 * second=13.63589
 * thirds=25.178116
 * four=50.05934
 */
        //-----------------------------------------------------------------------------

        System.out.println();
        System.out.println("==========Triangles List==============");

        //--------------- сортировка в порядке убывания значений ---------------


        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
        //-----------------------------------------------------------------------------
/**
 * four=50.05934
 * thirds=25.178116
 * second=13.63589
 * first=9.165152
 */
    }

//==================================================================================================================================


    //======================================== function to sort Map ==================================================================



//    private static HashMap<String, String> sortMap(Map<String, Float> map){
//        ArrayList<String> keyList = new ArrayList<>();
//        ArrayList<String> valueList = new ArrayList<>();
//        HashMap<String, String> sortedMap = new HashMap<>();
//
//        for (Map.Entry<String, Float> entry: new ArrayList<>(map.entrySet())) {
//            String key = entry.getKey();
//            keyList.add(key);
//            Float value = entry.getValue();
//            valueList.add(String.valueOf(value));
//
//            Collections.sort(keyList);
//            Collections.sort(valueList);
//        }
//
//            for (String i: keyList) {
//                for (String j : valueList) {
//
//                    sortedMap.put(i, j);
//
//                }
//            }
//        System.out.println(sortedMap);
//        return sortedMap;

//        //DecimalFormat df = new DecimalFormat("0.00");
//-------------------------------------------------------------------------------------------------------------------------------------
//        HashMap<Float, String> sortedMap = new HashMap<>();

//        ArrayList<Float> values = new ArrayList<>();

//        for (String key: map.keySet()) { // пробегаемся по каждому ключу
//            values.add(map.get(key)); // вытаскиваем значения у каждого ключа и пробрасываем в список
//        }
//        Collections.sort(values);
//        System.out.println(values);
//
//        for (String key: map.keySet()) {
//            for (float i : values) {
//
//                //float min = Collections.min(values);
//
//                if (i == map.get(key)) {
//                    sortedMap.put(i, key);
//
//                }
//            }
//        }
//        System.out.println(sortedMap);


    //======================================================================================================================


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

    private static void printMap(Map<String, Float> map) {
        Set<String> keys = map.keySet();                                       //Set<K> keySet(): возвращает набор всех ключей отображения (https://metanit.com/java/tutorial/5.8.php)
        for (String key : keys) {
            System.out.printf("[" + "%s" + "]:  %s", key, map.get(key) + " cm \n"); //получаем объект по ключу
        }                                                                      // getKey(): возвращает ключ объекта отображения (https://metanit.com/java/tutorial/5.8.php)
    }
}
