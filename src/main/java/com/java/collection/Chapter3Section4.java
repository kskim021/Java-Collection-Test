package com.java.collection;

import java.util.function.Supplier;

public class Chapter3Section4 {

    public static void main(String[] args) {

        Supplier<String> myStringSupplier = () -> {
            return "hello";
        };

        System.out.println(myStringSupplier.get());

        Supplier<Double> myRandomDoubleSupplier = () -> Math.random();
        PrintRandomDoubles(myRandomDoubleSupplier, 5);

    }

    private static void PrintRandomDoubles(Supplier<Double> randomSupplier, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(randomSupplier.get());
        }
    }
}
