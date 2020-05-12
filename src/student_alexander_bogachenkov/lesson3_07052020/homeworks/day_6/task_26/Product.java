package student_alexander_bogachenkov.lesson3_07052020.homeworks.day_6.task_26;

class Product {

    private final String name;
    private double regularPrice;
    private double discount;

    public Product(String productName) {
        this.name = productName;
    }

    public double actualPrice() {
        double decimalDiscount = this.discount / 100;
        double decimalWithoutDiscount = (1 - decimalDiscount);
        double actualPrice = this.regularPrice * decimalWithoutDiscount;
        return actualPrice;
    }

    public void printInformation(){
        System.out.println("Product name is " + this.name);
        System.out.println("Product regular price is " + this.regularPrice + " EUR");
        System.out.println("Discount for product in percents is " + this.discount + "%");
        System.out.println("Product actual price is " + actualPrice() + " EUR");
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
