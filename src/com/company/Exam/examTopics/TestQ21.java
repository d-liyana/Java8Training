package com.company.Exam.examTopics;

public class TestQ21 {
    public static void main(String[] args) {
        boolean opt1=true;
        String opt="True";
        //Can't initialize as follows
      //  boolean a="true";


        //Can not pass boolean value to the switch statement. Therefore we have to initialize "true" as a String value
        switch (opt){
            //  case True:---> can't use as this
            case "True":
                System.out.println("True");
                break;
            default:
                System.out.println(opt);
        }
        System.out.println("Done");
    }
}
