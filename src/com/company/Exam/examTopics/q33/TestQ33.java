package com.company.Exam.examTopics.q33;

public class TestQ33 {
    int ns;
    static int s;

    public TestQ33(int ns) {
        if (s<ns){
            s=ns;
            this.ns = ns;
        }
    }

    void doPrint(){
        System.out.println("ns = "+ns+" s "+s);
    }
}
