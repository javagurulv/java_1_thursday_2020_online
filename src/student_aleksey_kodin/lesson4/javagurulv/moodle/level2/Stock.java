package student_aleksey_kodin.lesson4.javagurulv.moodle.level2;

class Stock {
    private final String company;
    private int currentPrice;
    private int maxPrice;
    private int minPrice;

    public Stock(String company, int currentPrice) {
        this.company = company;
        this.currentPrice = currentPrice;
        this.maxPrice = currentPrice;
        this.minPrice = currentPrice;
    }
    void updatePrice(int newPrice) {
        if (newPrice > maxPrice) {
            maxPrice = newPrice;
        } else if (newPrice < minPrice) {
                    minPrice = newPrice;
        } else {
            currentPrice = newPrice;
        }
    }
    void printInformation() {
        System.out.println("Company = \"" + company + "\", Current Price = " + currentPrice +
                            ", Min Price = " + minPrice + ", Max Price = " + maxPrice);
    }

}
