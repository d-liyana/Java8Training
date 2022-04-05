package com.company.Exam.examTopics;

public class TestQ82 {
    int x;//100
    int y;//200

    public void doStuff(int x, int y){
        this.x=x;//100
        y=this.y;//0

    }

    public void display(){
        System.out.println("X : "+x+" Y : "+y);
    }
    public static void main(String[] args) {
        TestQ82 tq=new TestQ82();
        tq.x=100;
        tq.y=200;
        TestQ82 tq1=new TestQ82();
        tq1.doStuff(tq.x,tq.y);
        tq.display();
        tq1.display();

    }
}
//outouts 100: 200; 100: 0