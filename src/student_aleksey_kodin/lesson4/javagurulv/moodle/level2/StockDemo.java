package student_aleksey_kodin.lesson4.javagurulv.moodle.level2;

class StockDemo {

    public static void main(String[] args) {

        Stock amazon = new Stock("Amazon",10);
        amazon.printInformation();

        amazon.updatePrice(15);
        amazon.updatePrice(7);
        amazon.updatePrice(14);
        amazon.printInformation();
    }
}
