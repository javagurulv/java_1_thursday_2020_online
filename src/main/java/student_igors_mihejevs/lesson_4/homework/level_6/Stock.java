package student_igors_mihejevs.lesson_4.homework.level_6;

class Stock {

    private final String companyName;
    private final int initialPrice;
    private int currentPrice;
    private int minimumPrice;
    private int maximumPrice;
    private String informationForPrinting;

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

    public String getInformation() {
        this.informationForPrinting = "Company = " + companyName + ", Current price = " + "" + currentPrice + ", Min price = " +
                "" + minimumPrice + ", Max price = " + "" + maximumPrice;
        return informationForPrinting;
    }

    public void printInformation() {
        System.out.println(informationForPrinting);
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

    public void setMinimumPrice(int minimumPrice) {
        this.minimumPrice = minimumPrice;
    }

    public void setMaximumPrice(int maximumPrice) {
        this.maximumPrice = maximumPrice;
    }

}
