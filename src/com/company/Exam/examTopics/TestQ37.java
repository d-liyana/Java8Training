package com.company.Exam.examTopics;

public class TestQ37 {
    static int count=0;
    int i=0;

    public void changeCount(){
    while (i<5){
        i++;
        count++;
        }
    }

    public static void main(String[] args) {
        TestQ37 tq=new TestQ37();
        TestQ37 tq1=new TestQ37();
        tq.changeCount();
        System.out.println("TQ I: "+tq.count+" : "+tq1.count);
        System.out.println("TQ Count : "+tq.i+" : "+tq1.i);

        tq1.changeCount();
        System.out.println("TQ Count : "+tq.count+" : "+tq1.count);
        System.out.println("TQ I : "+tq.i+" : "+tq1.i);
    }
}
