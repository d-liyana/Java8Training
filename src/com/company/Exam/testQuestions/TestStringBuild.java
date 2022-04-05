package com.company.Exam.testQuestions;

public class TestStringBuild {
    String msg;

    TestStringBuild (String msg){
        this.msg=msg;
    }
}

class Test{
    public static void main(String[] args) {
        System.out.println("Hello"+ new StringBuilder("Java 8"));
        System.out.println("Hello"+new TestStringBuild("Java"));
        String s="Java Done";
        String a=s.trim();
        System.out.println(a);
        int len=s.trim().length();
        System.out.println(len);
    }
}