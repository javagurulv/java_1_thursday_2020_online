package student_diana_miranovica.lesson5.lesson_code;

 class StockArrayExample {

    public static void main(String[] args) {

        Stock[] stocks = new Stock[3];

        System.out.println(stocks[0]);
        System.out.println(stocks[1]);
        System.out.println(stocks[2]);

        stocks[0] = null;
        stocks[1] = null;
        stocks[2] = null;

        //Stock stock = stocks[0];
       // stock.updatePrice(11); // java.lang.NullPointerException

        stocks[0] = new Stock( "Adidas", 2);
        stocks[1] = new Stock( "Siemens", 5);
        stocks[2] = new Stock( "Puma", 13);

        Stock adidasStock = stocks[0];
        Stock siemensStock = stocks[1];
        Stock pumaStock = stocks[2];

        adidasStock.updatePrice(12);
        siemensStock.updatePrice(45);
        pumaStock.updatePrice(32);




    }
}
