package com.company.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(9);
        list.add(6);
        list.add(7);

        List<Integer> listA= new ArrayList<Integer>();
        listA= list.stream().filter(integer -> integer>1).collect(Collectors.toList());
        listA.stream().forEach(integer -> System.out.println(integer));
    }
}
