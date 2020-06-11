package student_oleg_ivanov.lesson4.homeWorkDay6;

class StockTest {
    public static void main(String[] args) {
        StockTest test = new StockTest();
        test.printInformation();
        test.minPrice();
        test.actualPrice();
        test.maxPrice();
    }

    public void printInformation() {
        Stock stock = new Stock("Rimi", 60, 70, 50);
        String companyName = stock.getCompanyName();
        int actualPrice = stock.getActualPrice();
        int minimumPrice = stock.getMinPrice();
        int maximumPrice = stock.getMaxPrice();
        if ((companyName.equals("Rimi")) && (actualPrice == 60) && (minimumPrice == 50) && (maximumPrice == 70)) {
            System.out.println("Test stock information OK ");
            System.out.println("");
            stock.informationPrint();
        } else {
            System.out.println("Test stock information Fail");
            stock.informationPrint();

        }
    }
    public void minPrice() {
        Stock stock = new Stock("Rimi",60, 70, 50);
        int testMinimalPrice = stock.getMinPrice();
        if (testMinimalPrice == 50) {
            System.out.println("Test minimal price OK");
        } else {
            System.out.println("Test minimal price Fail");
        }
    }
    public void actualPrice() {
        Stock stock = new Stock("Rimi",60, 70, 50);
        int testActualPrice = stock.getActualPrice();
        if (testActualPrice == 60) {
            System.out.println("Test actual price OK");
        } else {
            System.out.println("Test actual price Fail");
        }
    }
    public void maxPrice() {
        Stock stock = new Stock("Rimi",60, 70, 50);
        int testMaximalPrice = stock.getMaxPrice();
        if (testMaximalPrice == 70) {
            System.out.println("Test Maximal price OK");
        } else {
            System.out.println("Test Maximal price Fail");
        }
    }

}