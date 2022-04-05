package com.company.Exam.testQuestions.t1;

class Shape {
    void print(){
        System.out.println("Shape");
    }
}

class Rectangle extends Shape{
void print(int a){
    System.out.println("Rectangle");
}

void print(){
    System.out.println("Again Rectangle");
}
}

class Square extends Shape{
void print(){
    System.out.println("Square");
}

}

public class CheckInheritance{
    public static void main(String[] args) {
        Shape shape=new Shape();
        Shape rg=new Rectangle();
        Shape sq=new Shape();

        Rectangle rgg=new Rectangle();
        Square sqq = new Square();

        shape.print();
        rg.print();
        sq.print();

        System.out.println("       /n");

        rgg.print(10);
        sqq.print();

    }
}
