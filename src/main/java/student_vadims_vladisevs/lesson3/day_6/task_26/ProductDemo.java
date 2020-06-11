package student_vadims_vladisevs.lesson3.day_6.task_26;

class ProductDemo {
    public static void main(String[] args) {

        Product phone = new Product("Nokia");
        phone.setPrice(500);
        phone.setDiscount(10);
        phone.actualPrice();
        phone.printInformation();

        Product bread = new Product("Bread");
        bread.setPrice(0.7);
        bread.setDiscount(20);
        bread.actualPrice();
        bread.printInformation();
    }
}
