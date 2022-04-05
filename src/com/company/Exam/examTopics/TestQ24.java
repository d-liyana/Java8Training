package com.company.Exam.examTopics;

public class TestQ24 {
    public static void main(String[] args) {
        String csh[][]=new String[2][];
        csh[0]=new String[2];
        csh[1]=new String[5];
        int i=97;

        for (int a=0;a<csh.length;a++){
            for (int b=0;b< csh.length;b++){
                csh[a][b]=""+i;
                i++;
                //System.out.println(csh[a][b]);
            }
        }

        for (String [] ca: csh){
            for (String c : ca){
                System.out.println(c+ "");
            }
            System.out.println();
        }

    }
}
