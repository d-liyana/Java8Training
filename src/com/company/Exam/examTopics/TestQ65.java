package com.company.Exam.examTopics;

public class TestQ65 {
    public static void main(String[] args) {
        int val=200;
        System.out.println("DoCal "+doCal(val));
        System.out.println("Value is "+val);

    }
    public static int doCal(int val){
        val=val*2;
        return val;
    }
}
//Outputs DoCal 400
//Value is 200
