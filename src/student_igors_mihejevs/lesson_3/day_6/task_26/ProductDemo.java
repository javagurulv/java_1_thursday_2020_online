package student_igors_mihejevs.lesson_3.day_6.task_26;

public class ProductDemo {

    public static void main(String[] args) {
        Product newProduct = new Product("TV 'SONY'");

        newProduct.setRegularPrice(2500);
        newProduct.setDiscount(15);

        newProduct.printInformation();
    }

}