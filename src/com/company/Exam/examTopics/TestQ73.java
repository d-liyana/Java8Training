package com.company.Exam.examTopics;

public class TestQ73 {

    String mystr="7007";

    public void doStuff(String str){
        int myNum=0;
        try {
            String mystr=str;
            myNum=Integer.parseInt(mystr);

        }catch (NumberFormatException ne){
            System.err.println("Error");

        }
        System.out.println(mystr+" "+myNum+"");

    }
    public static void main(String[] args) {
            TestQ73 tq=new TestQ73();
            tq.doStuff("9009");
    }
}
