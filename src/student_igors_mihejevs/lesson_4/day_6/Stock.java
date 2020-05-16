package student_igors_mihejevs.lesson_4.day_6;

class Stock {

    private final String companyName;
    private int initialPrice;
    private int currentPrice;
    private int minimumPrice;
    private int maximumPrice;

    public Stock(String companyName, int initialPrice) {
        this.companyName = companyName;
        this.initialPrice = initialPrice;
        this.currentPrice = initialPrice;
        this.minimumPrice = initialPrice;
        this.maximumPrice = initialPrice;
    }

    public void updatePrice(int updatedPrice) {
        if (updatedPrice < minimumPrice) {
            minimumPrice = updatedPrice;
        } else if (updatedPrice > maximumPrice) {
            maximumPrice = updatedPrice;
        }
        currentPrice = updatedPrice;
    }

    public void printInformation() {
        System.out.println("Company = " + companyName + ", Current price = " + currentPrice +
                ", Min price = " + minimumPrice + ", Max price = " + maximumPrice);
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public int getMinimumPrice() {
        return minimumPrice;
    }

    public int getMaximumPrice() {
        return maximumPrice;
    }

    public int getInitialPrice() {
        return initialPrice;
    }

}
