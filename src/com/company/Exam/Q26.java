package com.company.Exam;

public class Q26 {
    protected void init( ) {
        System.out.println("Initialized");
    }
    protected void start( ) {
        init();
        System.out.println("Started");
    }
}

class TestCall  {
    public static void main(String[ ] args) {
        Q26 c= new Q26 ( );
        c.start();    // line n1
       c.init();      // line n2
    }
}
