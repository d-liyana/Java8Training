package com.company.Exam.testQuestions;

public class TestArrayQuestion {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};

        for (int i=0; i<array.length;i++){
            System.out.println("first "+array[i]);
        }

        for (int i=4; i>=0;i--){
            System.out.println("second "+array[i]);
        }

      /*  for (int i=0; i<array.length;i+2){
            System.out.println(array[i]);
        }*/
    }
}
