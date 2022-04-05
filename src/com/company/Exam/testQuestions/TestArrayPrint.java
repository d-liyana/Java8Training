package com.company.Exam.testQuestions;

public class TestArrayPrint {
    public static void main(String[] args) {
       // Integer num=Integer.parseInt(args[1]);

        int[] arr={1,2,3,4};
        int[] arr2={9,8,7,6,4};
        arr2=arr;
        //System.out.println(arr2);
        for (int a:arr2){
            System.out.println(a);
        }
    }
}
