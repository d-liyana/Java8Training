package com.company.Exam.examTopics;

import java.io.IOException;

public class TestQ19 {
    void readCard(int crdNo) throws Exception{
        System.out.println("Reading card");
    }
    void checkCard(int crdNo)throws RuntimeException{
        System.out.println("Check Card");
    }

    public static void main(String[] args) {
        TestQ19 tq=new TestQ19();
        int crdNo=123456;
        tq.checkCard(crdNo);
      //  tq.readCard(crdNo);//Here gives compilation error since the method throws IO Exception. If removes "throws IOException"
        //the code will compile
    }
}
