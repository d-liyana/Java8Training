package com.company.Exam.testQuestions;

public class TestQJava2s {

    public static void addToInt(int x,int addToInt){
        x = x+ addToInt;

    }

    public static void main(String[] args) {
        int a= 10;
        int b=15;
        TestQJava2s.addToInt(a,b);
        System.out.println(a);
    }
}
