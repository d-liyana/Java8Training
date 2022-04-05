package com.company.Exam.examTopics;

public class TestQ76 {
    int id;
    String name;

    public TestQ76(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        TestQ76 tq=new TestQ76(101,"Pen");
        TestQ76 tq1=new TestQ76(101,"Pen");
        TestQ76 tq3=tq;
        boolean ans1=tq==tq1;
        boolean ans2=tq.name.equals(tq1.name);
        System.out.println(ans1+"  "+ans2);
    }
}
