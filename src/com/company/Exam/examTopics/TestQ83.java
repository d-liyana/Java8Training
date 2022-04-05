package com.company.Exam.examTopics;

public class TestQ83 {
    private char var;

    public static void main(String[] args) {
        char var1='a';
        char var2=var1;
        var2='e';

        TestQ83 tq=new TestQ83();
        TestQ83 tq1=tq;
        tq.var='i';
        tq1.var='o';

        System.out.println(var1+ " "+var2);// a e
        System.out.println(tq.var+" "+tq1.var);// o o

    }
}
