package com.company.Exam.examTopics;

public class TestQ64 {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};

        //Trying 1st option
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println();
        //Trying 2nd option
        for (int i=4;i>=0;i--){
            System.out.println(array[i]);
        }
        System.out.println();
        //Trying option 3
        for (int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
}
