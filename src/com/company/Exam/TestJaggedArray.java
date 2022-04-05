package com.company.Exam;

public class TestJaggedArray {
    public static void main(String[] args){
        //declaring a 2D array with odd columns
        int arr[][] = new int[3][];
        arr[0] = new int[2];
        arr[1] = new int[4];
        arr[2] = new int[9];
        System.out.println(arr[0]+" array");
        System.out.println(arr.length+" first lengh");

        //initializing a jagged array
        int count = 0;
        for (int i=0; i<arr.length; i++)
           // System.out.println(arr.length+" 2 lengh");

        for(int j=0; j<arr[i].length; j++)
            //System.out.println(arr.length+" 3 lengh");

        arr[i][j] = count++;
        System.out.println(arr.length+" first lengh");

        System.out.println(count+" count");
        //printing the data of a jagged array
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();//new line
        }
    }
}
