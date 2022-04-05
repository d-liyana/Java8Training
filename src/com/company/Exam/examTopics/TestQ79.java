package com.company.Exam.examTopics;

public class TestQ79 {
    public static void main(String[] args) {
        int n[][]={{1,3},{2,3}};
        for (int i=n.length-1;i>=0;i--){
            for (int b : n[i]){
                System.out.println(b);
            }
        }
    }
}
