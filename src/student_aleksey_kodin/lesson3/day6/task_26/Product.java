package student_aleksey_kodin.lesson3.day6.task_26;

import java.math.RoundingMode;
import java.text.DecimalFormat;

class Product {
    private final String name;
    private static final double START_REGULAR_PRICE = 0d;
    private static final double START_DISCOUNT_PRICE = 0d;
    private double regularPrice = START_REGULAR_PRICE;
    private double discount = START_DISCOUNT_PRICE;

        public Product(String name) {
        this.name = name;
    }

        public double getRegularPrice() {
        return regularPrice;
    }

        public double getDiscount() {
        return discount;
    }

        public double getActualPrice() { return actualPrice();}

        public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

        public void setDiscount(double discount) {
        this.discount = discount;
    }

            private double actualPrice() {
                return regularPrice - (regularPrice * discount / 100);
            }

            void printInformation() {

            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            decimalFormat.setRoundingMode(RoundingMode.UP);

                System.out.println("Product : name = \"" + name + "\"" + ", regular price = " +
                        decimalFormat.format(regularPrice) + " EUR, discount = " +
                        decimalFormat.format(discount) + "%, actual price = " +
                        decimalFormat.format(actualPrice()) + " EUR");
            }

}
