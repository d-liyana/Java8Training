package com.company.Exam.vceGuide;

public class Q2 {
    int x;

    public Q2() {
        this(10);
    }

    public Q2(int x) {
        this.x = x;
    }
}

class Car extends Q2{
    int y;

    public Car() {
        super(10);
    }

    public Car( int y) {
        super(y);
        this.y = y;
    }

    public String toString(){
        return super.x+" : "+this.y;
    }

    public int printNo(){
        return this.x;
    }

    public static void main(String[] args) {
        Q2 c= new Car(20);
        System.out.println(c);

    }
}
