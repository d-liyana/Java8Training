package com.company.Exam.testQuestions;

public class TestBoolean {
    public static void main(String[] args) {
        TestBoolean tb=new TestBoolean();
        System.out.println(isAvailable+"");
        isAvailable=tb.doStuff();
        System.out.println(isAvailable+" Lasttt");
    }
    public static boolean doStuff(){
        return !isAvailable;
    }
    static boolean isAvailable=false;
}
