package student_vadims_vladisevs.lesson4.homework.day_6;

class Stock {

    private String companyName;
    private int actualPrice;
    private int minPrice;
    private int maxPrice;

    public Stock(String companyName, int actualPrice){
        this.companyName = companyName;
        this.actualPrice = actualPrice;
        this.minPrice = actualPrice;
        this.maxPrice = actualPrice;

    }

    public void updatePrice(int price){
        if (price > maxPrice){
            this.maxPrice = price;
        }
        else if (price < minPrice){
            this.minPrice = price;
        }
        this.actualPrice = price;
    }

    public void printInformation(){
        System.out.println("Company name: " + companyName);
        System.out.println("Company current price: " + actualPrice);
        System.out.println("Company Max price: " + maxPrice);
        System.out.println("Company Min price: " + minPrice);
    }

    public int getMinPrice(){
        return  minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public String getCompanyName(){
        return companyName;
    }

    public int getActualPrice() {
        return actualPrice;
    }
}
