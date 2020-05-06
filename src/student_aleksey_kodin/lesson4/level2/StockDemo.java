package student_aleksey_kodin.lesson4.level2;

public class StockDemo {

    public static void main(String[] args) {

        Stock amazon = new Stock("Amazon",10);
        amazon.printInformation();

        amazon.updatePrice(15);
        amazon.updatePrice(7);
        amazon.updatePrice(14);
        amazon.printInformation();
    }
}
