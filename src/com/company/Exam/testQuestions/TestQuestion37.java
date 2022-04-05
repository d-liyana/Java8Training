package com.company.Exam.testQuestions;

public class TestQuestion37 {

    static int count=10;
    int i =0;

    public void checkNumber(){
        System.out.println(count);
        while (i<5){
            i++;
            count++;
            System.out.println("Inside while I "+i);

            System.out.println("Inside while Count "+count);
        }
    }
    public static void main(String[] args) {
        TestQuestion37 ts=new TestQuestion37();
        TestQuestion37 ts2=new TestQuestion37();
        ts.checkNumber();
        System.out.println("Before"+ts.count+" : "+ts2.count);

        ts2.checkNumber();
        System.out.println(ts.count+" : "+ts2.count);
    }
}
