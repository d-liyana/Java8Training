package com.company.Exam.examTopics;


class Caller{
private void init(){
    System.out.println("Initialized");
}

private void start(){
    init();
    System.out.println("Started");
}
}
public class TestQ80 {
    public static void main(String[] args) {
        Caller c=new Caller();
       // c.start();//Since start is private can't access outside of the clz.
    }
}
