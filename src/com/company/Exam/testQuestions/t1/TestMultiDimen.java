package com.company.Exam.testQuestions.t1;

public class TestMultiDimen {
    public static void main(String[] args) {
        int [][]inta={{1,3},{4,9},{5,3}};
      //  for (int a=0;a<inta.length;a++){
        for (int a=inta.length-1;a>=0;a--){
            for (int b : inta[a]){
                System.out.println(b);
            }
        }
    }
}
