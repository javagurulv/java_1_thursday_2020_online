package student_diana_miranovica.lesson3.homeworks.day_6.task_26;

import java.math.RoundingMode;
import java.text.DecimalFormat;

class Product {
    private final String name;
    private double regularPrice;
    private double discount;

    public Product(String name){
        this.name = name;
    }
    public double getDiscount() {
        return discount;
    }

    public double getRegularPrice() {
        return regularPrice;
    }
    public void setDiscount(double discount){
        this.discount = discount;
    }

    public double getActualPrice(){
        return getActualPrice();

    }
    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;

    }

    private double actualPrice(){
        return regularPrice - (regularPrice * discount / 100);
    }

    void printInformation(){
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setRoundingMode(RoundingMode.UP);

        System.out.println("Product: " +  name  +  ", constant price = " +
                decimalFormat.format(regularPrice) + " EUR,"+" discount = " +
                decimalFormat.format(discount) + "%,"+" price with discount = " +
                decimalFormat.format(actualPrice()) + " EUR");
    }
}
