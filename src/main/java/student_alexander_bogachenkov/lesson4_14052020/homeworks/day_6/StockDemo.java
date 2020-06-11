package student_alexander_bogachenkov.lesson4_14052020.homeworks.day_6;

class StockDemo {
    public static void main(String[] args) {
        Stock stock = new Stock("GOOGLE", 10);
        stock.printInformation();
        stock.updatePrice(15);
        stock.updatePrice(7);
        stock.updatePrice(14);
        stock.printInformation();
    }
}
