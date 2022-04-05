package com.company.Exam.testOutCE;

class Student {
    String name;
    int age;
}
public class Q14 {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();

        s1=s3;
        s3=s2;
        s1=s2;

        System.out.println(s1);
        System.out.println(s3);
        System.out.println(s2);


    }

}
