package student_alexander_bogachenkov.lesson4_14052020.homeworks.day_6;

class StockTest {

    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.testConstructor();
        stockTest.testMinPrice();
        stockTest.testMinPriceZero();
        stockTest.testMaxPrice();
        stockTest.testMaxPriceZero();
    }

    public void testConstructor() {
        String companyName = "GOOGLE";
        int actPrice = 10;
        String expectedCompanyName = "GOOGLE";
        int expectedPrice = 10;

        Stock stock = new Stock(companyName, actPrice);
        String actualCompanyName = stock.getCompanyName();
        int actualPrice = stock.getActualPrice();

        if ((actualCompanyName.equals(expectedCompanyName)) && (actualPrice == expectedPrice)) {
            System.out.println("testConstructor PASSED");
        } else {
            System.out.println("testConstructor FAILED");
            System.out.println("Expected company name: " + expectedCompanyName + ", but actual is: " + actualCompanyName);
            System.out.println("Expected price: " + expectedPrice + ", but actual is: " + actPrice);
        }
    }

    public void testMinPrice() {
        int expectedMinPrice = 20;

        Stock stock = new Stock("SAMSUNG", 20);
        int actualPrice = stock.getActualPrice();

        if (actualPrice == expectedMinPrice) {
            System.out.println("testMinPrice PASSED");
        } else {
            System.out.println("testMinPrice FAILED");
            System.out.println("Expected minimum price: " + expectedMinPrice + ", but actual is: " + actualPrice);
        }
    }

    public void testMaxPrice() {
        int expectedMaxPrice = 30;

        Stock stock = new Stock("SAMSUNG", 30);
        int actualPrice = stock.getActualPrice();

        if (actualPrice == expectedMaxPrice) {
            System.out.println("testMinPrice PASSED");
        } else {
            System.out.println("testMinPrice FAILED");
            System.out.println("Expected minimum price: " + expectedMaxPrice + ", but actual is: " + actualPrice);
        }
    }

    public void testMinPriceZero() {
        int expectedMinPrice = 0;

        Stock stock = new Stock("SAMSUNG", 0);
        int actualPrice = stock.getActualPrice();

        if (actualPrice == expectedMinPrice) {
            System.out.println("testMinPriceZero PASSED");
        } else {
            System.out.println("testMinPriceZero FAILED");
            System.out.println("Expected minimum price: " + expectedMinPrice + ", but actual is: " + actualPrice);
        }
    }

    public void testMaxPriceZero() {
        int expectedMaxPrice = 0;

        Stock stock = new Stock("SAMSUNG", 0);
        int actualPrice = stock.getActualPrice();

        if (actualPrice == expectedMaxPrice) {
            System.out.println("testMinPriceZero PASSED");
        } else {
            System.out.println("testMinPriceZero FAILED");
            System.out.println("Expected minimum price: " + expectedMaxPrice + ", but actual is: " + actualPrice);
        }
    }

}
