package com.company.Exam.testQuestions.t1;

public class SwitchBreak {
    public static void main(String args[]) {
    int num = 0;

    switch (num) {

        case 0:
            int a=10;
            System.out.println("case1");
            break;
        case 2:
            a=5;
            System.out.println("case2");

        default:
            System.out.println("default");
    }
        System.out.println("Done");
}
}