package com.company.Exam.examTopics;

public class TestQ25 {
    String name;
    boolean contract;
    double salary;

    public TestQ25() {
        this.name="Joe";
        this.contract=true;
        this.salary=9000;
    }

    public String toString(){
        return name + ":"+contract + ":" +salary +":";
    }
    public static void main(String[] args) {
        TestQ25 tq=new TestQ25();
        tq.name="Joe";
        tq.contract=true;
        tq.salary=9000;
        System.out.println(tq);

    }
}
