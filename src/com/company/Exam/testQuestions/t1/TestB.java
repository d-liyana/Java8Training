package com.company.Exam.testQuestions.t1;

public class TestB {


    protected int doStuff(){
         int x=10;
        return x++;
    }

    public static void main(String[] args) {
        String a=new String("A");
        String b=new String("A");

        System.out.println(a==b);
        System.out.println(a.equals(b));
    }
}
