package com.company.Exam.examTopics;

import java.util.ArrayList;

interface Hunter{

}

abstract class Animal{

}

public class TestQ66 extends Cat{
    public static void main(String[] args) {
        ArrayList<Animal> mylist=new ArrayList<>();
        mylist.add(new TestQ66());

        ArrayList<Hunter> mylist1=new ArrayList<>();
        mylist.add(new Cat());

        ArrayList<Hunter> mylist2=new ArrayList<>();
        mylist.add(new TestQ66());

        ArrayList<TestQ66> mylist3=new ArrayList<>();
        mylist.add(new Cat());

        ArrayList<Animal> mylist4=new ArrayList<>();
        mylist.add(new Cat()); //In the answer list it's new ArrayLIst . therefore answer E

    }
}

class Cat extends Animal implements Hunter{

}
