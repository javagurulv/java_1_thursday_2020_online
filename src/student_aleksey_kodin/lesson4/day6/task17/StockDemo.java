package student_aleksey_kodin.lesson4.day6.task17;

public class StockDemo {
    public static void main(String[] args) {
        Stock amazon = new Stock("Amazon",10);
        amazon.printInformation();

        amazon.updatePrice(15);
        amazon.updatePrice(7);
        amazon.updatePrice(14);
        amazon.printInformation();
        System.out.println();

        Stock ebay = new Stock("Ebay",10);
        ebay.printInformation();
        //Пример использования updatePriceNewVersion
        ebay.updatePriceNewVersion(15);
        ebay.updatePriceNewVersion(7);
        ebay.updatePriceNewVersion(14);
        ebay.printInformation();
        //При увеличении макимума обновляем значения Current Price и Min Price
        ebay.updatePriceNewVersion(20);
        ebay.printInformation();
        //При изменения минимума обновляем значения Current Price
        ebay.updatePriceNewVersion(12);
        ebay.printInformation();
    }
}
