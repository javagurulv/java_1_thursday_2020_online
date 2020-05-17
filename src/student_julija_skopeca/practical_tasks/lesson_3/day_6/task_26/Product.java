package student_julija_skopeca.practical_tasks.lesson_3.day_6.task_26;

import java.util.Scanner;

class Product {
    String name;
    double regularPrice;
    double discount;
    double actualPrice;

    public Product(String productName){
       this.name = productName;

       System.out.println("Enter a price of " + this.name);
        Scanner sc = new Scanner(System.in);
        double RegularPrice = sc.nextDouble();
        this.regularPrice = RegularPrice;

        System.out.println("Enter a discount in % for " + this.name);
        double Discount = sc.nextDouble();
        this.discount = Discount;

        double actualPriceCalculation = this.regularPrice - (this.regularPrice * (this.discount/100));
        this.actualPrice = actualPriceCalculation;

    }


     public void printInformation(){
        System.out.println(this.name);
        System.out.println("Price - " + this.regularPrice);
        System.out.println("Discount - " + this.discount + "%");
        System.out.println("Actual price - " + actualPrice);
    }
}
