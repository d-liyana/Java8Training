package com.company.Exam.examTopics;

public class TestQ28 {
    static  int i;
    int j;
    static int a=11;
    int b=12;

    public static void main(String[] args) {
        TestQ28 tq=new TestQ28();
        TestQ28 tq1=new TestQ28();
        tq.i=3;
        tq.j=4;
        tq1.i=5;
        tq1.j=6;

        System.out.println(tq.i+" : "+ tq.j+" : "+tq1.i+" : "+ tq1.j); // this prints 5 : 4 : 5 : 6
        System.out.println();
        System.out.println(tq.a+" : "+ tq.b+" : "+tq1.a+" : "+ tq1.b); // this prints 11 : 12 : 11 : 12
        tq.a=13;
        tq.b=14;
        tq1.a=15;
        tq1.b=16;
        System.out.println(tq.a+" : "+ tq.b+" : "+tq1.a+" : "+ tq1.b); // this prints 15 : 14 : 15 : 16


        //Assign gain
        tq.i=7;
        tq.j=8;
        System.out.println();
        System.out.println(tq.i+" : "+ tq.j+" : "+tq1.i+" : "+ tq1.j);//this prints 7 : 8 : 7 : 6

        System.out.println();
        tq.a=17;
       // tq.b=18;
        System.out.println(tq.a+" : "+ tq.b+" : "+tq1.a+" : "+ tq1.b); // this prints 17 : 18 : 17 : 16


        tq1.i=9;
        //tq1.j=10;
        System.out.println(tq.i+" : "+ tq.j+" : "+tq1.i+" : "+ tq1.j);//this prints 9 : 8 : 9 : 10
        //tq1.a=19;
        tq1.b=20;
        System.out.println();
        System.out.println(tq.a+" : "+ tq.b+" : "+tq1.a+" : "+ tq1.b); // this prints 5 : 4 : 5 : 6




    }
}
