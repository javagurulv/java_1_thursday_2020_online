package student_igors_mihejevs.lesson_4.homework.level_6;

class StockDemo {

    public static void main(String[] args) {
        Stock google = new Stock("GOOG", 10);

        google.getInformation();
        google.printInformation();
        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);

        google.getInformation();
        google.printInformation();
    }

}
