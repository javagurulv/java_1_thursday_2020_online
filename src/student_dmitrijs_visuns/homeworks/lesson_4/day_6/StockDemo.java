package student_dmitrijs_visuns.homeworks.lesson_4.day_6;

class StockDemo {

    public static void main(String[] args) {

        Stock leica = new Stock("Leica", 765);

        leica.printInformation();
        leica.updatePrice(-2);
        leica.updatePrice(0);
        leica.updatePrice(44);
        leica.printInformation();

    }

}
