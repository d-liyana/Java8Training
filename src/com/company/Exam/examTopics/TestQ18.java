package com.company.Exam.examTopics;

public class TestQ18 {
    public static void main(String[] args) {
        String shirts[][]=new String[2][2];
        shirts[0][0]="Red";
        shirts[0][1]="Blue";
        shirts[1][0]="Small";
        shirts[1][1]="Medium";
        String b="";
        String c="";

        //Following code only print "Medium"
        for (int index=1; index<2;index++){
            for (int x=1;x<2;x++){
                System.out.println(shirts[index][x]+" ");
            }
        }

        //To print Red,Blue,Small,Medium

        for (int index=0;index<shirts.length;index++){
            for (int x=0;x<shirts.length;x++){
                System.out.println("Print All : "+shirts[index][x]);
            }
        }
        System.out.println();
        //Following prints Red,Blue,Small,Medium
        for (int index=0; index<2;++index){
            for (int x=0;x<index;++x){
                b=shirts[index][x];
                System.out.println("Answer B : "+b+" ");
            }
        }
        System.out.println();

        for (int index=0; index<2;){
            for (int x=0;x<2;){
                c=shirts[index][x];
                System.out.println("Answer D : "+shirts[index][x]+" ");
                x++;
            }
            index++;
        }

        System.out.println(b.equals(c));
    }
}
