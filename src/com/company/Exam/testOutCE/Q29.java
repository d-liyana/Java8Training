package com.company.Exam.testOutCE;

public class Q29 {
    String name;
    int age=25;

    public Q29(String name) {
        setName(name);
    }

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

    public Q29(String name, int age) {
        this.age = age;
    }
}
