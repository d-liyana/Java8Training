package com.company.demo;

import java.util.function.BiConsumer;

public class LamdaExpressionDemo {

    public static void main(String[] args) {
        BiConsumer<Integer,Integer> sum=(a,b)->System.out.println(a+b);
        sum.accept(8,6);
    }
}
