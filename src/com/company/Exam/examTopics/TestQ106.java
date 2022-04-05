package com.company.Exam.examTopics;

public class TestQ106 {
    public static void main(String[] args) {
        int num[];
        num=new int[2];
        num[0]=10;
        num[1]=20;

        num=new int[4];
        num[2]=30;
        num[3]=40;

        for (int x: num){
            System.out.println(x);
        }
    }
}
