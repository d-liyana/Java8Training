package com.company.demo;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args){
        Supplier<Date> todayD= ()-> new Date();
        System.out.println("Today is "+todayD.get());

    }

}
