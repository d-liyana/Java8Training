package com.company.Exam.testOutCE;

public class Q11 {
    public static void main(String[] args) {
        String shirts[][]=new String[2][2];
        shirts[0][0]="red";
        shirts[0][1]="blue";
        shirts[1][0]="small";
        shirts[1][1]="medium";

        for (String[] c:shirts){
            for (String s:c){
                System.out.println(s+" : ");
            }

        }
        System.out.println();
        for (int index=0;index<2;){
            for(int idx=0;idx<2;){
                System.out.println(shirts[index][idx]+" : ");
                idx++;
            }
            index++;
        }
        System.out.println();
        for (int index=0;index<2;index++){
            for(int idx=0;idx<index; idx++){
                System.out.println(shirts[index][idx]+" : ");

            }

        }



    }
}
