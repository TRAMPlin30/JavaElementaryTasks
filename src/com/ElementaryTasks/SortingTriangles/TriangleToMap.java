package com.ElementaryTasks.SortingTriangles;

import java.util.HashMap;

public class TriangleToMap {

    public static HashMap<String, Integer> Save(String triangleName, Integer square) {

        HashMap<String, Integer> dictionary = new HashMap<>();
        dictionary.put(triangleName, square);
        return dictionary;

    }
}
