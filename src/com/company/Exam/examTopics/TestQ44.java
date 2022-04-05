package com.company.Exam.examTopics;

 class TestQ44 {
    public void test(){
        System.out.println("Base");
    }
}

class DeriveA extends TestQ44{
     public void test(){
         System.out.println("Derive A");
     }
}

class DeriveB extends DeriveA{
     public void test(){
         System.out.println("Derive B");
     }

    public static void main(String[] args) {
        TestQ44 db=new DeriveB();
        db.test();//Prints Derive B
        TestQ44 db1=new DeriveA();
        db.test();//Prints Derive B
        db1.test();//Prints Derive A

        TestQ44 db2=new DeriveB();
        db=(TestQ44) db2;
        db.test();//Prints Derive B
        TestQ44 db3=(DeriveA) db2;
        db2.test();//Prints Derive B
        db.test();//Prints Derive B
        db3.test();//Prints Derive B
    }

}
