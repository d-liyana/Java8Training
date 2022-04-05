package com.company.Exam.vceGuide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q20 {
    public static void main(String[] args) {
        String str[]={"Hello","How","Are","You"};
        List<String> str1=new ArrayList<>(Arrays.asList(str));
        if (str1.removeIf((String s)-> (s.length()<=2))){
            System.out.println("Removed");
        }else {
            System.out.println("Done "+ str.length);
        }
    }
}
