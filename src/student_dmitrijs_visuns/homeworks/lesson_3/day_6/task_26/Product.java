package student_dmitrijs_visuns.homeworks.lesson_3.day_6.task_26;

class Product {

    private String name;
    private double regularPrice;
    private double discount;

    public Product (String name, double regularPrice, double discount) {
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

    public double actualPrice() {
        return regularPrice - (regularPrice * discount / 100);
    }

    public void printInformation() {
        System.out.println("Только сегодня! " + name + " по цене " + actualPrice() + " вместо " + regularPrice);
    }

}
