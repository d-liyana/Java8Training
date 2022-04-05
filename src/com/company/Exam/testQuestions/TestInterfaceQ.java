package com.company.Exam.testQuestions;

import java.util.ArrayList;
import java.util.List;

public class TestInterfaceQ {

    public static void main(String[] args) {

        List<String> nm=new ArrayList<>();
        nm.add("a");
        nm.add("b");
        nm.add("an");
        nm.add("b");
        nm.add("aj");

        if (nm.remove("b")){
            nm.remove("k");
        }

        System.out.println(nm);



    }
}
