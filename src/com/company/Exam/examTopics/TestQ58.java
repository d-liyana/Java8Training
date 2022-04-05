package com.company.Exam.examTopics;

public class TestQ58 {
    String name;
    int age=25;

    public TestQ58(String name){
        //this(); //can't use as this
        this.name=name;// If we want we can use as this
        setName(name);
    }

    public TestQ58(String name, int age) {
        this.name = name;
        this.age = age;
    }

/*    public TestQ58(String name, int age) {
        TestQ58(name) ;// can't assign as this, we have to put "new" keyword
        setAge(age);
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String show(){
        //return name+ " "+age+" "+number// here number is not initialize anywhere
        return name+" "+age;
    }

    public static void main(String[] args) {
        TestQ58 tq=new TestQ58("Jessy");
        TestQ58 tq1=new TestQ58("Jessy",45);
        System.out.println(tq.show());
        System.out.println(tq1.show());

    }
}

//If code compiles as above it outputs
// Jessy 25
//Jessy 45