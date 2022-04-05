package com.company.Exam.examTopics;

public class TestQ48 {
    public static void main(String[] args) {
        String [][]a={{"A","B","C"},{"D","E"}};
        for (int i=0;i<a.length;i++){
            for (int b=0; b<a[i].length;b++){
                System.out.println(a[i][b]+" ");
               if (a[i][b].equals("B")) {
                    System.out.println("Yes");
                    break;
                }// If there isn't this if block it prints A B C D E
            }
           continue;
        }
    }
}
