package com.company.Exam.testOutCE;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Q55 {
    public static void main(String[] args) {
        List<String> lst = Arrays.asList("EN", "FR", "CH", "JP");
        Iterator itr = lst.iterator();
        while (itr.hasNext()) {
            String e = itr.next().toString();
            if (e == "CH") {
                break;
            }
            System.out.print(e + " ");
        }
    }
}
