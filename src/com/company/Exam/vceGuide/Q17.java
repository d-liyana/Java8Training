package com.company.Exam.vceGuide;

class Student {
String name;

    public Student(String name) {
        this.name = name;
    }
}

public class Q17{
    public static void main(String[] args) {

        Student st1=new Student("ASD");
        st1=new Student("QWE");
        //st1.name="RT";
        Student st[]=new Student[3];
        st[0]=new Student("C");
        st[1]=new Student("A");
        st[2]=new Student("B");
        System.out.println(st1.name);

        for (Student student: st){
           // System.out.println(student);
            System.out.println(student.name);
           // System.out.println(st);
        }
    }

}
