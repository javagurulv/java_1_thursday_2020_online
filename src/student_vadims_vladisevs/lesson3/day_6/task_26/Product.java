package student_vadims_vladisevs.lesson3.day_6.task_26;

import java.math.RoundingMode;
import java.text.DecimalFormat;

class Product {

    private String name;
    private double regularPrice;
    private double discount;
    private double finalPrice;

    public Product(String productName){
        this.name = productName;
    }

    public void setPrice(double productPrice){
        this.regularPrice = productPrice;
    }

    public void setDiscount(double productDiscount){
        this.discount = productDiscount;
    }

    public double actualPrice(){
        finalPrice = regularPrice - ((regularPrice * discount)/100);
        return finalPrice;
    }

    public void printInformation() {
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setRoundingMode(RoundingMode.UP);

        System.out.println("Product name: " + name);
        System.out.println("Product regular price: " + decimalFormat.format(regularPrice) + " €");
        System.out.println("Product discount: " + decimalFormat.format(discount) + "%");
        System.out.println("Product price with discount: " + decimalFormat.format(finalPrice) + " €");
    }
}
