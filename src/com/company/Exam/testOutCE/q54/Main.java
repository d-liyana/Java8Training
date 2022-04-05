package com.company.Exam.testOutCE.q54;

class A {
    static int hitCount;
    static void printHitcount ( ) {
        System.out.println("A class " + hitCount);
    }
}

class B extends A {
    static void printHitCount ( ) {
        System.out.println("B class " + hitCount);
    }
}

public class Main {
    public static void main(String[] args) {
        A.hitCount = 100;
        B.hitCount = 200;
        A.printHitcount ( );
        B.printHitcount ( );
    }
}
