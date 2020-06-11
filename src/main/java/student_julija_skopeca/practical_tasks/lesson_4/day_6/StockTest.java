package student_julija_skopeca.practical_tasks.lesson_4.day_6;

class StockTest {

    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.OnlyCurrentPrice();
        stockTest.secondBiggerPrice();
        stockTest.secondPriceLess();
        stockTest.thirdPriceBigger();
        stockTest.thirdPriceLess();
        stockTest.thirdPriceEqualFirst();
    }

    public void OnlyCurrentPrice() {
        Stock test1 = new Stock("Java", 10);
        String result = test1.getInformation();
        if (result.equals("Company = Java, Current price = 10, Min Price = 10, Max Price = 10")) {
            System.out.println("Test - ok");
        } else System.out.println("Test = FAIL");
    }

    //added the second price bigger
    public void secondBiggerPrice() {
        Stock test1 = new Stock("Java", 10);
        test1.updatePrice(11);
        String result = test1.getInformation();
        if (result.equals("Company = Java, Current price = 11, Min Price = 10, Max Price = 11")) {
            System.out.println("SecondBiggerPrice test - ok");
        } else System.out.println("SecondBiggerPrice test = FAIL");
    }

    //added the second price less
    public void secondPriceLess() {
        Stock test1 = new Stock("Java", 10);
        test1.updatePrice(9);
        String result = test1.getInformation();
        if (result.equals("Company = Java, Current price = 9, Min Price = 9, Max Price = 10")) {
            System.out.println("secondPriceLess test - ok");
        } else System.out.println("secondPriceLess test = FAIL");

    }

    //10 to 9 to 11
    public void thirdPriceBigger() {
        Stock test1 = new Stock("Java", 10);
        test1.updatePrice(9);
        test1.updatePrice(11);
        String result = test1.getInformation();
        if (result.equals("Company = Java, Current price = 11, Min Price = 9, Max Price = 11")) {
            System.out.println("thirdPriceBigge test - ok");
        } else System.out.println("thirdPriceBigge test = FAIL");

    }

    //10 to 9 to 6
    public void thirdPriceLess() {
        Stock test1 = new Stock("Java", 10);
        test1.updatePrice(9);
        test1.updatePrice(6);
        String result = test1.getInformation();
        if (result.equals("Company = Java, Current price = 6, Min Price = 6, Max Price = 10")) {
            System.out.println("thirdPriceLess test - ok");
        } else System.out.println("thirdPriceLess test = FAIL");

    }

    //10 to 9 to 10
    public void thirdPriceEqualFirst() {
        Stock test1 = new Stock("Java", 10);
        test1.updatePrice(9);
        test1.updatePrice(10);
        String result = test1.getInformation();
        if (result.equals("Company = Java, Current price = 10, Min Price = 9, Max Price = 10")) {
            System.out.println("thirdPriceLess test - ok");
        } else System.out.println("thirdPriceLess test = FAIL");

    }




}

