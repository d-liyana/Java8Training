package com.company.Exam.testQuestions;

public class Access {

    private int x=0;
    private int y=0;

    public static void main(String[] args) {
        Access ac=new Access();
        ac.publicThis(1,2);

        ac.publicThat(3,4);

    }
     public  void publicThis(int x, int y){
         x =x;
         y=y;
         System.out.println("This X : "+this.x+" this y : "+ this.y);
     }
    public  void publicThat(int x, int y){
        this.x =x;
        this.y=y;
        System.out.println(" that X : "+this.x+" that y : "+ this.y);
    }
}
