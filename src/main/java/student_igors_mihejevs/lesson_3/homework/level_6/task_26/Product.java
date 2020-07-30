package student_igors_mihejevs.lesson_3.homework.level_6.task_26;

class Product {

    private String name;
    private double regularPrice, discount;

    public Product(String name) {
        this.name = name;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double actualPrice() {
        return regularPrice - regularPrice * discount / 100;
    }

    public void printInformation() {
        System.out.println("Information about new product : ");
        System.out.println("Name : " + name + "\nRegular price EUR : " + regularPrice
                + "\nDiscount % : " + discount + "\nActual price EUR : " + actualPrice());
    }

}
