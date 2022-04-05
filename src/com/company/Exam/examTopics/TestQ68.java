package com.company.Exam.examTopics;

public class TestQ68 {
    int num;

    public static void graceMarket(TestQ68 tList){
        tList.num+=10;

    }
    public static void main(String[] args) {
        TestQ68 testQ68=new TestQ68();
        TestQ68 tq1=testQ68;
        TestQ68 tq2=null;
        testQ68.num=20;
        graceMarket(testQ68);
    }
}
//There is one instance object is created at run time.