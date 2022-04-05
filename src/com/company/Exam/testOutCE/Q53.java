package com.company.Exam.testOutCE;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Q53 {
    public static void main(String[] args) {
        List lst = Arrays.asList ("A","B","C","D");
        Iterator itr = lst .iterator( );
        while (itr.hasNext ( )) {
            String e = (String) itr.next( );
            if (e == "C") {
              break;
                           }
            else {
                //continue;
               System.out.print (e);
                }
           }
    }
}
