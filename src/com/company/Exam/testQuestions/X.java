package com.company.Exam.testQuestions;

public class X {
    static int a;
    int j;

    public static void main(String[] args) {
        X x=new X();
        X x1=new X();
        x.a=3;
        x.j=4;
        //x1.a=5;
        x1.j=6;
        System.out.println(x.a+ "xa "+x.j+ "xj "+x1.j+" X2J "+x1.a+"X1A");
    }
}
