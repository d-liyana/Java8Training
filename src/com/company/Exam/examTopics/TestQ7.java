package com.company.Exam.examTopics;

public class TestQ7 {
    String type="4WD";
    int maxSpeed=100;

    //If we delete this default constructor there will be an issue in class Car as commented.
    public TestQ7() {
    }

    public TestQ7(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }
}

class Car extends TestQ7{

    String trans;

    //Since there is no default constructor in TestQ7 we can't use as follows.
    Car(String trans){
        this.trans=trans;
    }

    public Car(String type, int maxSpeed, String trans) {
        super(type, maxSpeed);
         this.trans = trans;
        //this(trans);// can't use as this
    }

    public static void main(String[] args) {
        Car c=new Car("abc");
        Car c1=new Car("abc",120,"mnh");
        System.out.println(c);
        System.out.println(c1.trans);
        System.out.println(c1.maxSpeed);
        System.out.println(c1.type);

    }

}
