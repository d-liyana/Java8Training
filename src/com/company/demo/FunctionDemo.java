package com.company.demo;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args){
        Function<Integer,Integer> squareMe=integer -> integer+integer;
        System.out.println("Funtion output is "+squareMe.apply(8));


    }
}
