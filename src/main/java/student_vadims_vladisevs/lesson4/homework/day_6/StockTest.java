package student_vadims_vladisevs.lesson4.homework.day_6;

class StockTest {
    public static void main(String[] args) {
        StockTest stock = new StockTest();
        stock.stockTestMaxPrice();
        stock.stockTestMinPrice();
        stock.stockTestPrintInformation();


    }


    public void stockTestPrintInformation(){
        Stock stock = new Stock("Test name", 100);

        String companyName = stock.getCompanyName();
        int price = stock.getActualPrice();
        int maxPrice = stock.getMaxPrice();
        int minPrice = stock.getMinPrice();
        if ((companyName.equals("Test name")) && (price == 100) && (maxPrice == 100) && (minPrice == 100)){
            System.out.println("Print information test = OK");
            System.out.println("------------");
            stock.printInformation();
        }
        else {
            System.out.println("Print information test = FAIL");
        }

    }



    public void stockTestMaxPrice(){
        Stock stock = new Stock("Test name", 100);
        stock.updatePrice(1);
        stock.updatePrice(1000);
        stock.updatePrice(21);
        stock.updatePrice(423);

        int testMaxPrice = stock.getMaxPrice();

        if (testMaxPrice == 1000){
            System.out.println("Max price test = OK");
        }
        else {
            System.out.println("Max price test = FAIL");
        }
    }



    public void stockTestMinPrice(){
        Stock stock = new Stock("Test name", 100);
        stock.updatePrice(1);
        stock.updatePrice(1000);
        stock.updatePrice(21);
        stock.updatePrice(423);

        int testMinPrice = stock.getMinPrice();

        if (testMinPrice == 1){
            System.out.println("Min price test = OK");
        }
        else {
            System.out.println("Min price test = FAIL");
        }
    }

}
