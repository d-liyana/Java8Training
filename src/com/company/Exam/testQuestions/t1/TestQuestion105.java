package com.company.Exam.testQuestions.t1;

public class TestQuestion105 {
    public static void main(String[] args) {
        int var1=-5;
        int var2=var1--;
        int v3=0;
        System.out.println("Var1 "+var1);
        System.out.println("Var2 "+var2);
        System.out.println();
        if(var2<0){
            v3=var2++;
        }else {
            v3=--var2;
        }
        System.out.println(v3);
    }
}
