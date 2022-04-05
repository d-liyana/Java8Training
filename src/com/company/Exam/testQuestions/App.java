package com.company.Exam.testQuestions;

public class App {
    String str="7007";
    public static void main(String[] args) {
        App app=new App();
        app.doStuff("9009");

    }

    public void doStuff(String strr){
        int no=0;
        System.out.println(no+"up here");
        try {
            String str=strr;
            System.out.println("ST"+str);
            no=Integer.parseInt(str);
            System.out.println("NO"+no);

        }catch (NumberFormatException ne){
            System.out.println();
        }
        System.out.println("Str  "+str+"No "+no);

    }
}
