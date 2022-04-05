package com.company.Exam.testQuestions.t1;

public class TestArray {
    public static void main(String[] args) {
        int []a={10,20,30,40,50};
        int x=a.length;
/*
        do {
            x--;
            System.out.println(a[x]);
        }while (x>0);*/

        while (x>0){
            System.out.println(a[x]);
            x--;
        }
    }
}
