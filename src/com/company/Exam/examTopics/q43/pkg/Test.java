package com.company.Exam.examTopics.q43.pkg;

import com.company.Exam.examTopics.q43.TestQ43;

public class Test extends TestQ43 {
    public static void main(String[] args) {
        TestQ43 tq=new Test();
        System.out.println(tq.s);//Other variables are not visible. Only s is can access
    }
}
