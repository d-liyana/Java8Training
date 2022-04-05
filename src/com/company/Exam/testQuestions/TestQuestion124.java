package com.company.Exam.testQuestions;

public class TestQuestion124 {
    public static void main(String[] args) {
        String [][] cha=new String[2][];
        cha[0]=new String[4];
        cha[1]=new String[5];
        int i=97;

        for (int a=0;a<cha.length;a++)
        {
            for (int b=0;b< cha.length;b++){
                cha [a][b]=""+i;
                i++;
            }
        }
for (String[]  a:cha){
    for (String c: a){
        System.out.println(c+"");
    }
    System.out.println();
}
    }
}
