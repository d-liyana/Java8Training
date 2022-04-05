package com.company.Exam.examTopics.q47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestQ47 {

    public static void checkAge(List<Person> list, Predicate<Person> predicate){
        for (Person p: list){
            if (predicate.test(p)){
                System.out.println("Name is : "+p.name);
            }

        }

    }

    public static void main(String[] args) {
        List<Person> iList= Arrays.asList(new Person("Happy",45),
                new Person("Nemitha",10),
                new Person("Elshan",35),
                new Person("Dinusha",36));
        checkAge (iList, p -> p.getAge ( ) > 40);

    }
}
