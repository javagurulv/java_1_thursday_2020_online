package student_igors_mihejevs.lesson_4.day_6;

class StockTest {

    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.printInformationTest();
        stockTest.updatePriceTest();
    }

    //
    public void updatePriceTest() {
        Stock test = new Stock("GOOG", 50);
        int initialPriceTest = test.getInitialPrice();
        int currentPriceTest = test.getCurrentPrice();
        int minimumPriceTest = test.getMinimumPrice();
        int maximumPriceTest = test.getMaximumPrice();

        if ((initialPriceTest == currentPriceTest) && (initialPriceTest == minimumPriceTest) &&
            (initialPriceTest == maximumPriceTest)) {
            System.out.println("Constructor test = OK");
        } else System.out.println("Constructor test = FAIL");
    }

    // Testing visually. All parameters will be equal initialPrice
    void printInformationTest() {
        Stock test = new Stock("GOOG", 50);
        test.printInformation();
    }

}