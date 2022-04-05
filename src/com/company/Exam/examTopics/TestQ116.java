package com.company.Exam.examTopics;

public class TestQ116 {
    public static final int MIN=1;

    public static void main(String[] args) {
        int x=args.length;
        System.out.println(x);
        if (checkList(x)){
            System.out.println("JAVA SE");
        }else {
            System.out.println("JAVA EE");
        }
    }

    public static boolean checkList(int x ){
        return (x>=MIN) ? true: false;
    }

}
