package com.company.Exam.examTopics;

public class TestQ59 {
    public String name;
    public int moon;

    public TestQ59(String name, int moon) {
        this.name = name;
        this.moon = moon;
    }

    public static void main(String[] args) {
        TestQ59[] tq= {new TestQ59("Mercury",0),new TestQ59("Venus",0)
                ,new TestQ59("Earth",1),new TestQ59("Mars",2)};

        System.out.println(tq);
        System.out.println(tq[2]);
        System.out.println(tq[2].moon);
    }
}
//outputs [Lcom.company.Exam.examTopics.TestQ59;@677327b6
//com.company.Exam.examTopics.TestQ59@14ae5a5
//1