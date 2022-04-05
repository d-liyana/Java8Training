package com.company.Exam.examTopics.q53;

public class TestQ53 {
    int x;

    public TestQ53(int x) {
        this.x = x;
    }

    TestQ53(){
        this(10);
    }
}

class Car extends TestQ53 {
    int y;

   /* public Car() {
        super();
        this(20);// this line it gives a compilation error. this must be first call in the constructor.
    }// Here we can't have both super and this in default constructor if we change code as follows
    it will compile.
*/

    public Car() {
        this(20);
    }

    public Car(int y) {
        this.y = y;
    }

    public String toString() {
      //  return super.x + this.y;// can't use as this we have to convert int to String to return String value.
        return String.valueOf(super.x + this.y);
    }


    public static void main(String[] args) {
        TestQ53 tq = new Car();
        //System.out.println(y);//since y is not static we can't use as this in static method.
        Car c=new Car();
        System.out.println(c.y);//If code compiles correct it return value 20
        c.toString();
        System.out.println(c.toString());//returns 30-->(10+20)
    }
}

//If code compiles correct it return value 20