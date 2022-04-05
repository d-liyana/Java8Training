package com.company.Exam.examTopics;

import java.util.ArrayList;

public class TestQ45 {
    public static void main(String[] args) {
        ArrayList myList=new ArrayList();
        String myArray;
        try {
            while (true) {
                myList.add("My String");
            }
        }catch (RuntimeException re){
            System.out.println("Runtime Exception");
        }catch (Exception e){
            System.out.println("Caught an Exception");
        }
        System.out.println("Ready to use");
    }
}
//This outputs "Exception in thread "main" java.lang.OutOfMemoryError: Java heap space"