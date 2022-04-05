package com.company.Exam.testQuestions.question4;

import java.util.ArrayList;

public class Cat extends Animal implements Hunter{
    public static void main(String[] args) {
        ArrayList<Hunter> ah=new ArrayList<>();
        ah.add(new Cat());

        ArrayList<Hunter> ahh=new ArrayList<>();
        ahh.add(new Tiger());

        ArrayList<Animal> c=new ArrayList<>();
        c.add(new Cat());


    }
}
