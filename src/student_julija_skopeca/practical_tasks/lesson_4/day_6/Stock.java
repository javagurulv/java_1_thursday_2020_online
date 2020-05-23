package student_julija_skopeca.practical_tasks.lesson_4.day_6;


class Stock {

    private String name;
    private int currentPrice;
    private int newPrice;
    private int minimalPrice;
    private int maximalPrice;
    private String informationForDemo;

    public Stock(String companyName, int currentPrice) {
        this.name = companyName;
        this.currentPrice = currentPrice;
        this.minimalPrice = currentPrice;
        this.maximalPrice = currentPrice;
    }

    public void updatePrice(int newPrice) {
                if (newPrice > maximalPrice) {
            maximalPrice = newPrice;
        }

        if (newPrice < minimalPrice) {
             minimalPrice = newPrice;
        }

        currentPrice = newPrice;
    }

    public String getInformation(){
        this.informationForDemo = "Company = " + this.name + ", " + "Current price = " +
                currentPrice + ", " + "Min Price = " + minimalPrice + ", " +
                "Max Price = " + maximalPrice;
        return informationForDemo;
            }

    public void printInformation() { System.out.println(informationForDemo); }

}


