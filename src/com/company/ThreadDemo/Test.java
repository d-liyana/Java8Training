package com.company.ThreadDemo;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6};
        int i=a.length-1;
        System.out.println(a.length);

        System.out.println(i);



        while (i>=0){
            System.out.println(a[i]);
            i--;
        }
    }
}
