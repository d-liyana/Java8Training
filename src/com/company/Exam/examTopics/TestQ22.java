package com.company.Exam.examTopics;

public class TestQ22 {
/*    public static void main(String[] args) {
        int num=5;
        do{
            System.out.println(num);
        }while (num==0);
    }*/

    public static void main(String[] args) {
        int num=5;
        do {
            System.out.println(num--);
            System.out.println(num);
        }while (num==0);
    }
}
// Prints only 5. Do while loop execute at least one time.