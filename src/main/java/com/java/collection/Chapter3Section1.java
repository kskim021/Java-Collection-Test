package com.java.collection;

import com.java.collection.util.Adder;

import java.util.function.Function;

public class Chapter3Section1 {

    public static void main(String[] args) {
        // Function<Integer, Integer> myAdder = new Adder();
        Function<Integer, Integer> myAdder = x -> x +10;

        int result = myAdder.apply(5);

        System.out.println(result);
    }
}
