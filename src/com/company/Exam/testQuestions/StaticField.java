package com.company.Exam.testQuestions;

public class StaticField {
    static int a=7;

    public static void main(String[] args) {
        StaticField obj=new StaticField();
        System.out.println("1 "+a);
        obj.a++;
        System.out.println("1 "+a);

        StaticField.a++;
        System.out.println("1 "+a);

        obj.a++;
        System.out.println(obj.a+"  "+StaticField.a);
    }
}
