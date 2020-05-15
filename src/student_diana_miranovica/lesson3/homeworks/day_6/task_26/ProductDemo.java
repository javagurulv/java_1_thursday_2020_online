package student_diana_miranovica.lesson3.homeworks.day_6.task_26;


class ProductDemo {
    public static void main(String[] args) {

        Product firstProduct = new Product("Water pack");
        firstProduct.setRegularPrice(5.95);
        firstProduct.setDiscount(15);
        firstProduct.printInformation();

        Product secondProduct = new Product("Chocolate");
        secondProduct.setRegularPrice(1.98);
        secondProduct.setDiscount(30);
        secondProduct.printInformation();

        Product alcoholic = new Product("Whiskey");
        alcoholic.setRegularPrice(62.99);
        alcoholic.setDiscount(20);
        alcoholic.printInformation();

        Product cosmetic = new Product("Lipstick NYX ");
        cosmetic.setRegularPrice(4.35);
        cosmetic.setDiscount(5);
        cosmetic.printInformation();
    }
}
