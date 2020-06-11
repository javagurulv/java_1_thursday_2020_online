package student_arturs_ragausks.lesson_3.homeworks.day6.Task26;

import java.math.RoundingMode;
import java.text.DecimalFormat;

class Product {

     private String name;

     private double regularPrice;

     private double discount;

     public Product(String productName){
         this.name = productName;
     }
     //set regular price
     public void setPrice(double productPrice) {
         this.regularPrice = productPrice;
     }
     //set discount for the price
     public void setDiscount(double discount) {
         this.discount = discount;
     }
     //set actual price
     public double actualPrice() {
         double actualPrice = this.regularPrice - this.regularPrice / 100 * this.discount;
         return actualPrice;
     }
     public void printInformation() {
         DecimalFormat decimalFormat = new DecimalFormat();
         decimalFormat.setRoundingMode(RoundingMode.UP);

         System.out.println("Product " + name);
         System.out.println("Regular price " + decimalFormat.format(regularPrice) + " EUR ");
         System.out.println("Discount amount " + decimalFormat.format(discount));
         System.out.println("Final price " + actualPrice() + " EUR ");
     }






}
