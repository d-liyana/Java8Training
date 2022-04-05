package com.company.Exam.testQuestions.p3;

import com.company.Exam.testQuestions.p1.DoInterface;

public class DoClass implements DoInterface {
    int x,x1;

    public DoClass() {
        this.x = x;
        this.x1 = x1;
    }

    public void m1(int a){
        x+=a;
        System.out.println(x);
    }
    public void m2(int b){
        x1+=b;
        System.out.println(x1);
    }
}
