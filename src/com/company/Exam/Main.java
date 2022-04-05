package com.company.Exam;

public class Main{
        public static void main(String[] args) {
            ShapeOne rectangle = new Rectangle(5);  // A
            System.out.println(","+rectangle.hasEdges()); // B
        }
    }

    class ShapeOne {
        public ShapeOne() {
            System.out.print("Shape");
        }
        public ShapeOne(int edge) {
            System.out.print("ShapeEdge");
        }
        public boolean hasEdges() {
            return false;
        }
    }
    class Rectangle extends ShapeOne {
        public Rectangle(int age) {
            System.out.print("Rectangle");
        }
        public boolean hasEdges() { // C
            return true;
        }
    }
