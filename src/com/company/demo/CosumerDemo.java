package com.company.demo;

import java.util.function.Consumer;

public class CosumerDemo {

    public static void main(String[] args){
        Consumer<Integer> squareMe=integer -> System.out.println("Consumer Demo"+integer*integer);
        squareMe.accept(9);

    }
}
