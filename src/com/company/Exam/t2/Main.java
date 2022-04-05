package com.company.Exam.t2;

class Person {
    protected int age;

    protected void setAge(int val) {
        age = val;
    }

    protected int getAge() {
        return age;
    }
}

class Professor extends Person {
    Professor(String val) {
        specialization = val;
    }

    String specialization;

    String getSpecialization() {
        return specialization;
    }
}

public class Main {
    public static void main(String args[]) {
        Professor s1 = new Professor("AAA");
        Professor s2 = new Professor("BBB");
        s1.age = 45;
        System.out.println(s1.age + s2.getSpecialization());
        System.out.println(s2.age + s1.getSpecialization());
    }
}
