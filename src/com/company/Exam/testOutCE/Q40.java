package com.company.Exam.testOutCE;

public class Q40 {
    public static void main(String[] args) {
       int ans=0;
        try  {
            int num = 10;
            int div = 0;
            //int ans = num / div;
            ans = num / div;

        }
        catch (ArithmeticException ex)   {
            ans = 0;                                                // line n1
        }
        catch (Exception e)   {
            System.out.println("INvalid");
       }

        System.out.println ("Answer = " +ans);       // line n2
    }
}
