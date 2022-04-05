package com.company.Exam.examTopics;

class TestQ27 {
    public TestQ27() {
        System.out.println("A");
    }
}

class B extends TestQ27{
    public B() {
        System.out.println("B");
    }
}

class C extends B{
    public C() {
        System.out.println("C");
    }

    public static void main(String[] args) {
        C c=new C();
    }
}
