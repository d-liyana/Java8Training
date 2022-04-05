package com.company.Exam.examTopics;

public class TestQ14 {

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        //can't
        /*for (int b: a[]){
        }*/

        //To print 135 only

        for (int e=0;e<5;e+=2){
            System.out.println("Only 135 : "+a[e]);
        }

        for (int b=0;b< a.length;b++){
            System.out.println(a[b]);
        }

        for (int b=0;b<a.length;b++){
            int s=a[b];
            if (s%2!=0){
                System.out.println();
                System.out.println(s);

            }
        }

    }

}
