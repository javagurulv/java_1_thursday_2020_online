package student_aleksey_kodin.lesson3.javagurulv.moodle.level3;

class ProductDemo {

    public static void main(String[] args) {

        Product product = new Product("Milk");
        product.setRegularPrice(0.80);
        product.setDiscount(20);
        product.printInformation();

        Product alcoholic = new Product("Bear");
        alcoholic.setRegularPrice(1.25);
        alcoholic.setDiscount(10);
        alcoholic.printInformation();
    }
}
