package student_alexander_bogachenkov.lesson5_21052020.lesson_code;

class Stock {

    private String companyName;
    private Integer actualPrice;
    private Integer minPrice;
    private Integer maxPrice;

    public Stock(String companyName, int actualPrice) {
        this.companyName = companyName;
        this.actualPrice = actualPrice;
        updatePrice(actualPrice);
    }

    public void updatePrice(int newPrice) {
        if (isMax(newPrice)) {
            this.maxPrice = newPrice;
        }

        if (isMin(newPrice)) {
            this.minPrice = newPrice;
        }
        this.actualPrice = newPrice;
    }

    private boolean isMax(int newPrice) {
        return this.maxPrice == null || newPrice > this.maxPrice;
    }

    private boolean isMin(int newPrice) {
        return this.minPrice == null || newPrice < this.minPrice;
    }

    public void printInformation() {
        System.out.println("Company name is " + this.companyName);
        System.out.println("Stock actual price is " + this.actualPrice);
        System.out.println("Stock minimum price is " + this.minPrice);
        System.out.println("Stock maximum price is " + this.maxPrice);
    }

    public String getCompanyName() {
        return companyName;
    }

    public Integer getActualPrice() {
        return actualPrice;
    }
}
