package com.ElementaryTasks.AtOnlineLessons;

import java.util.*;

import com.TasksFromBook.SortingMapComparingByValue.*;

public class mapSort extends RunerMAP {
    public static void main(String[] args) {

        runProcess();

    }

    public static void runProcess() {

        TriangleMAP trFirst = triangleBuild();
        map.put(trFirst.getName(), trFirst.getSquare());                                  //добавляем первый треугольник

        while (continueBuild()) {                          // спрашиваем у пользователя, хочет ли он добавить еще один и если "Yes", то в цикле добавляем пока не выберет "No"
            TriangleMAP trOther = triangleBuild();
            map.put(trOther.getName(), trOther.getSquare());
        }
        Map<String, Float> sortedMap = new HashMap<>();
        sortedMap = sortByValue(map);
        printMap(sortedMap);
    }

    /**
     * EntrySet - это значения Map (тоесть ключ-значение). Каждая пара ключ-значение представляет собой Entry.
     * Что вообще такое map - это ассоциативный массив, в котором (конкретно в реализации HashMap) по хешу ключа ищется
     * значение. Если возникла коллизия и хеш коды ключей совпадают, значения по этому хешу складываются в односвязный список
     * (до 8 элементов, потом превращается в красно черное дерево, но при норм определении хеш функции такое не происходит,
     * плюс loadfactor частично предотвращает такие ситуэйшн, кароче мелочей много и мы их пока опустим) Но как мы видим,
     * Set и Map это разные коллекции, но не концептуально. Дело в том, что Set под капотом использует Map - наш ассоциативный массив,
     * только в качестве значений он оставляет null. Поэтому, если мы говорим о реализации HashSet в java и почему эта структура данных
     * работает за постоянное O(1) время (при извлечении ключа), то это тот же ассоциативный масчив - Entry, просто ключ - уникальное K,
     * а V - null, и когда мы просим отдать нам такой-то элемент, он заранее знает, на каком индексе он лежит (он вызывает функцию hashCode()
     * класса Object и по модулю деления на длину этого массива определяет на какой ячейке он лежит - тоесть, допустим, hashCode вернул 31,
     * а начальная емность HashSet у нас 16 - > значит мы делаем 31%16=15(остаток от деления). В 15 ячейке нашего массива и лежит наш элемент.
     * И, когда мы его достаем, мы его не ищем, а тупо к нему обращаемся, отсюда и скорость работы)
     * <p>
     * Но если подвести итоги - то Set просто под капотом юзает Map (обратите внимание, map не реализует iterable, в отличие от set,
     * но getValues() и getKeys() методы мапы реализуют)
     *
     *
     */

    public static Map<String, Float> sortByValue(Map<String, Float> map) {
        List<Map.Entry<String, Float>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        Map<String, Float> result = new HashMap<>(); //LinkedHashMap
        for (Map.Entry<String, Float> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
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
        System.out.println("==========Triangles List==============");
        Set<String> keys = map.keySet();                                       //Set<K> keySet(): возвращает набор всех ключей отображения (https://metanit.com/java/tutorial/5.8.php)
        for (String key : keys) {
            System.out.printf("[" + "%s" + "]:  %s", key, map.get(key) + " cm \n"); //получаем объект по ключу
        }                                                                      // getKey(): возвращает ключ объекта отображения (https://metanit.com/java/tutorial/5.8.php)
    }


}
