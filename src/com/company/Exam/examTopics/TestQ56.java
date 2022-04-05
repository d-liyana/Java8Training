package com.company.Exam.examTopics;

public class TestQ56 {
    public static void main(int[] args){
        System.out.println("int main "+args[0]);
    }
    public static void main(Object[] args){
        System.out.println("Object main "+args[0]);
    }
    public static void main(String[] args) {
        System.out.println("String main "+args[0]);
    }
}

//Outputs String main 1 (Input arguments were 1 2 3)