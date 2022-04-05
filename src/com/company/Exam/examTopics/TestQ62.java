package com.company.Exam.examTopics;

public class TestQ62 {
    public static void main(String[] args) {
        int[] a={8,16,32,64,128};

        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println();

        for (int i : a){
            System.out.println(i);
        }

    }
}
