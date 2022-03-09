package com.java.collection;

import com.java.collection.util.TriFunction;

public class Chapter3Section3 {

    public static void main(String[] args) {

        TriFunction<Integer, Integer, Integer, Integer> addThree = (x, y, z) -> x + y + z;

        int r = addThree.apply(3, 4, 5);
        System.out.println(r);

    }
}
