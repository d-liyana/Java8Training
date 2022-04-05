package com.company.Exam.examTopics;

public class TestQ81 {
    public static void main(String[] args) {
      try {
          int num = 10;
          int div = 10;
          int ans = num/div;
      }catch (ArithmeticException ae){
          //ans=0// Here it gives a compilation error since ans not declared;
      }catch (Exception e){
          System.out.println("Exception "+e);
      }
      //  System.out.println("Answer is "+ans);//compilation error,
        //  ans not declared outside of the try block

    }
}
