package student_dmitrijs_visuns.homeworks.lesson_4.day_6;

class Stock {

    private String companyName;
    private int currentPrice;
    private int minPrice;
    private int maxPrice;

    public Stock (String companyName, int currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.maxPrice = currentPrice;
        this.minPrice = currentPrice;
    }


    public void updatePrice(int newPrice) {
        if (newPrice < 0) {
           System.out.println("Price not updated, stock price can't be negative");
         } else {
            this.currentPrice = newPrice;
        }

        if  ((newPrice < this.minPrice) && (newPrice >= 0)) {
             this.minPrice = newPrice;
         } else if ((newPrice > this.maxPrice) && (newPrice >= 0)) {
             this.maxPrice = newPrice;
         }
    }

    public void printInformation () {
        System.out.println("Company = " + companyName + ", Current Price = " + currentPrice + " , Min Price = " + minPrice + " , Max Price = " + maxPrice);
    }

}


