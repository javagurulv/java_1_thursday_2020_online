package student_aleksey_kodin.lesson4.day6.task17;

class StockDemo {
    public static void main(String[] args) {
        Stock amazon = new Stock("Amazon",10);
        System.out.println(amazon.toString());

        amazon.updatePrice(15);
        amazon.updatePrice(7);
        amazon.updatePrice(14);
        System.out.println(amazon.toString());
        System.out.println();

        Stock ebay = new Stock("Ebay",10);
        System.out.println(ebay.toString());
        //Пример использования updatePriceNewVersion
        ebay.updatePriceNewVersion(15);
        ebay.updatePriceNewVersion(7);
        ebay.updatePriceNewVersion(14);
        System.out.println(ebay.toString());
        //При увеличении макимума обновляем значения Current Price и Min Price
        ebay.updatePriceNewVersion(20);
        System.out.println(ebay.toString());
        //При изменения минимума обновляем значения Current Price
        ebay.updatePriceNewVersion(12);
        System.out.println(ebay.toString());
    }
}
