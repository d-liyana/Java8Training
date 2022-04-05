package com.company.demo;

import java.util.function.Predicate;

public class PredicateFunctionDemo {

    public static void main(String[] args){
        Predicate<String>checkLength= s -> s.length()>=5;
        System.out.println("string lengh is " +checkLength.test("I am Dinusa"));

    }
}
