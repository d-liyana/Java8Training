package com.company.Exam.examTopics;

public class TestQ51 {
    public static void doSum(Integer a,Integer b){
        System.out.println("Sum is in Integer : "+a+b);
    }

    public static void doSum(float a,float b){
        System.out.println("Sum is in float : "+a+b);
    }

    public static void doSum(double a,double b){
        System.out.println("Sum is in double : "+a+b);
    }

    public static void doSum(int a,int b){
        System.out.println("Sum is in int : "+a+b);
    }

    public static void main(String[] args) {
        doSum(10,20);
        doSum(10.0,20.0); //This wont convert to float, since the numbers not in float
    }
}
