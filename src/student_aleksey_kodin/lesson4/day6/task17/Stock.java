package student_aleksey_kodin.lesson4.day6.task17;

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
    // Обновления значений происходят тогда когда новое значение больше существующих
    void updatePrice(int newPrice) {
		if (newPrice > maxPrice) {
			maxPrice = newPrice;
		}
		if (newPrice < minPrice) {
			minPrice = newPrice;
		}
		currentPrice = newPrice;
    }
    // Метод не нужен. Переопределён метод класса toString.
    /* void printInformation() {
        System.out.println("Company = \"" + company + "\", Current Price = " + currentPrice +
                            ", Min Price = " + minPrice + ", Max Price = " + maxPrice);
    } */
    /*
    Метод updatePrice только обновляет значения Current Price,Min Price,Max Price. Если логика
    подразумевает сдвиг значений при изменении, то можно использовать updatePriceNewVersion(int newPrice):
    1. [Новое максимальное значение] ->  Max Price -> Current Price -> Min Price;
    2. [Новое минимальное значение] -> Min Price -> Current Price;
     */
    void updatePriceNewVersion(int newPrice) {
        int min = Math.min(currentPrice,(Math.min(maxPrice,Math.min(minPrice, newPrice))));
        int max = Math.max(currentPrice,(Math.max(maxPrice,Math.max(minPrice, newPrice))));

        if (newPrice == min) {
            currentPrice = minPrice;
            minPrice = min;
        } else if (newPrice == max) {
            minPrice = currentPrice;
            currentPrice = maxPrice;
            maxPrice = max;
        } else {
            if (newPrice < currentPrice) {
                minPrice = newPrice;
            } else {
                currentPrice = newPrice;
            }
        }
    }
    public int getCurrentPrice() {
        return currentPrice;
    }
    public int getMaxPrice() {
        return maxPrice;
    }
    public int getMinPrice() {
        return minPrice;
    }
    @Override
    public String toString() {
        return  "Company = \"" + company + '\'' +
                ", Current Price = " + currentPrice +
                ", Min Price = " + minPrice +
                ", Max Price = " + maxPrice;
    }
}
