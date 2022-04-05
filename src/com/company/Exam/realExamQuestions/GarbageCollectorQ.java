package com.company.Exam.realExamQuestions;

public class GarbageCollectorQ {
    public static void main(String[] args) {
        String a=new String("A");
        String b=new String("B");
        String c=new String("C");

        b=a;
        a=c;
        b=a;

        System.out.println(a+" "+b+" "+c);
    }
}
