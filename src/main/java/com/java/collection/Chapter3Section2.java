package com.java.collection;

import java.util.function.BiFunction;

public class Chapter3Section2 {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;

        int r = add.apply(3, 5);

        System.out.println(r);


    }
}
