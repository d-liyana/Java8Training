package com.company.Exam.array;

class Course {
    void print(long duration) {
        System.out.println("long");
    }

    void print(int duration) {
        System.out.println("int");
    }

    void print(String s) {
        System.out.println("String");
    }

    void print(Object o) {
        System.out.println("Object");
    }
}
class Main {
    public static void main(String args[]) {
        Course course = new Course();
        char c = 10;
        course.print(c);
        course.print("Object");

    }
}