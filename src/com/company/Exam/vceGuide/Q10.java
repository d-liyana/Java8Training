package com.company.Exam.vceGuide;

public class Q10 {
    public static void main(String[] args) {
        int a[][]=new int[3][4];

        a[1]=new int[]{1,3,3,4,5};
        a[0]=new int[]{3,5,9};

        for (int c[]:a){
            for (int y=a.length-1;y>=0;y--){
                System.out.println(c[y]);
            }
        }
        System.out.println();

        for (int y=a.length-1;y>=0;y--){
            for (int c[]:a){
                System.out.println(c[y]);
            }
        }
        System.out.println();

        for (int[] b:a){
            for (int i=0;i<a.length;i++){
                System.out.println(b[i]);
            }

        }

    }
}
