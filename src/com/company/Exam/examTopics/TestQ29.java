package com.company.Exam.examTopics;

public class TestQ29 {
    public static void main(String[] args) {
        int array[]=new int[2];
        int []array1=new int[2];
        int[] array3=new int[2];
       // int[] array4=new int[];Can't assign as this gives a compilation error. Array size must be included.
      //  int[2] array5=new int[]; Can't assign as this gives a compilation error
        int []array6;
        array6= new int[]{1, 22, 34};
        //array6= {1, 3, 4}; Can't assign as this gives a compilation error must create new object
        int array7[]={4,5,6};
        int array8[]= new int[]{11, 232, 314};
        int array9[]={17, 89, 0};
        int array10[]=new int[2];
        int array11[]={17, 89, 0};
        int[] array12;
        int[] arr= {};


        //array12=int [2]; can't assign compilation error
        //int array13[2]; can't assign compilation error

        array9=array10;
        array10=array9;

        System.out.println("Array "+array);
        //System.out.println("Array "+array[]); Can't print as this gives a compilation error
        System.out.println("Array length "+array.length);
        System.out.println("Array 6"+array6);
        System.out.println(array9+"Array9");
        System.out.println(array10+"Array10");
        System.out.println(array11+"Array11");
      //  System.out.println(int a : array11[a]+"Array11"); Can't, gives an compilation error
        for (int a:array11){
            System.out.println("Array11 values "+a);

        }







    }
}
