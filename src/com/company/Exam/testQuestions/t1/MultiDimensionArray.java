package com.company.Exam.testQuestions.t1;

public class MultiDimensionArray {
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        int[][] b={{1,2,4}, {5,6,7},{9,78,9}};
        System.out.println(a[3]==b[0][2]);
        System.out.println(" "+(a[2]==b[2][1]));
    }
}
