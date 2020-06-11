package student_aleksey_kodin.lesson3.javagurulv.moodle.level3;

import java.math.RoundingMode;
import java.text.DecimalFormat;

class Product {
    private final String name;
    private double regularPrice = 0d;
    private double discount = 0d;

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
