package com.company.Exam.vceGuide;

public class Q28 {
    public static void main(String[] args) {
        int wd=0;
        String days[]= {"Sun","Mon","Wed","Sat"};
        for (String  d: days){
            switch (d){
                case "Sat":
                case "Sun":
                    wd-=1;
                    break;//-1
                case "Mon":
                    wd++;//0
                case "Wed":
                    wd+=2;//2
                            //4
            }
        }
        System.out.println(wd);
    }
}
