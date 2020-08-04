package student_igors_mihejevs.lesson_4.homework.level_6;


class StockTest {

    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.getInformationTest(); // getInformation method test
        stockTest.updatePriceTest1(); // Initialising test
        stockTest.updatePriceTest2(); // Updated price is less then minimum
        stockTest.updatePriceTest3(); // Updated price is more then maximum
        stockTest.updatePriceTest4(); // Updated price is between minimum and maximum
    }

    public void getInformationTest() {
        Stock test = new Stock("GOOG", 50);
        String outString = test.getInformation();

        if (outString.equals("Company = GOOG, Current price = 50, Min price = 50, Max price = 50")) {
            System.out.println("Get information test = OK");
        } else System.out.println("Get information test = FAIL");
    }

    public void updatePriceTest1() {
        Stock test = new Stock("GOOG", 50);

        if ((test.getInitialPrice() == test.getCurrentPrice()) && (test.getInitialPrice() == test.getMinimumPrice()) &&
                (test.getInitialPrice() == test.getMaximumPrice())) {
            System.out.println("Test1 = OK");
        } else System.out.println("Test1 = FAIL");
    }

    public void updatePriceTest2() {
        Stock test = new Stock("GOOG", 50);

        test.updatePrice(40);
        if ((test.getMinimumPrice() == 40) && (test.getCurrentPrice() == 40) && (test.getMaximumPrice() == 50)) {
            System.out.println("Test2 = OK");
        } else System.out.println("Test2 = FAIL");
    }

    public void updatePriceTest3() {
        Stock test = new Stock("GOOG", 50);

        test.updatePrice(60);
        if ((test.getMinimumPrice() == 50) && (test.getCurrentPrice() == 60) && (test.getMaximumPrice() == 60)) {
            System.out.println("Test3 = OK");
        } else System.out.println("Test3 = FAIL");
    }

    public void updatePriceTest4() {
        Stock test = new Stock("GOOG", 50);
        test.setMinimumPrice(20);
        test.setMaximumPrice(70);
        test.updatePrice(35);
        if ((test.getMinimumPrice() == 20) && (test.getCurrentPrice() == 35) && (test.getMaximumPrice() == 70)) {
            System.out.println("Test4 = OK");
        } else System.out.println("Test4 = FAIL");
    }

}