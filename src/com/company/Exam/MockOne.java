package com.company.Exam;

public class MockOne {
    public static void main(String[] args) {
        int x = 5, j = 0;
        for (int i = 0; i < 3;) {
            System.out.println("for x:"+x);
            System.out.println("for j:"+j);
            System.out.println("for i:"+i);
            INNER: do {
//from  w  ww  .  ja va2s .  com
                System.out.println("while x:"+x);
                System.out.println("while j:"+j);
                System.out.println("while i:"+i);

                i++;
                x++;
                if (x > 10)
                    break INNER;
                x += 4;
                j++;
            } while (j <= 2);
        }
        System.out.println(x);

    }
}
