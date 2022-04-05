package com.company.Exam.examTopics;

public class TestQ20 {
    public static void main(String[] args) {
        int x=5;
        while (isAvailable(x)){
            //for print 43210
            //x--;
            System.out.println(x);
            //For print 54321
            x--;
        }
    }

    public static boolean isAvailable(int x){
        return x --> 0 ? true:false;
    }
}
