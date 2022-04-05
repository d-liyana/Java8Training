package com.company.Exam.examTopics.q17;

public class CheckAmount {
    public static void main(String[] args) {
        TestQ17 tq=new TestQ17((int)(Math.random()*1000) );
        tq.amount=10;
        tq.changeAmount(tq.amount);
        tq.changeAmount(tq.getAmount());
        System.out.println(tq.amount);
    }
}
