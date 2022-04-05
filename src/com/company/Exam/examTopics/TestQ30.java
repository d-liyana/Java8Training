package com.company.Exam.examTopics;

public class TestQ30 {
    public static void main(String[] args) {
        String[] arr= {"A","B","C","D"};
        //String[] arr= {}; Nothing will print coz it does not go inside the loop

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
            if (arr[i].equals("C")){
                continue;
            }
            System.out.println("Work Done");
            break;
        }
    }
}
