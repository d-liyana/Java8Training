package com.company.Exam.examTopics;

class Product{
    double price;
}

public class TestQ1 {

    public void updatePrice(Product product,double price){
        System.out.println("Product price : "+product.price);
        System.out.println("Price : "+price);
        price=price*2;
        product.price=product.price+price;
        System.out.println("After Product price : "+product.price);
        System.out.println("After Price : "+price);
    }

    public static void main(String[] args) {
        Product prt=new Product();
        double newPrice=100;
        prt.price = 200;

        TestQ1 tq=new TestQ1();
        tq.updatePrice(prt,newPrice);

        System.out.println();
        System.out.println(prt.price+" "+newPrice);
    }

}
