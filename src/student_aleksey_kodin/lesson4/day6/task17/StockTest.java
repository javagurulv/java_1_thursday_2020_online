package student_aleksey_kodin.lesson4.day6.task17;

class StockTest {
    private Stock stock = new Stock("XXX",10);

    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.testMaxValue(25);
        stockTest.testMinValue(2);
        stockTest.testCurrentValue(15);
    }
    public void testMaxValue(int maxValue) {
        stock.updatePrice(maxValue);
        int result = stock.getMaxPrice();
        printTestResult(result == maxValue,"Update Max");
    }
    public void testMinValue(int minValue) {
        stock.updatePrice(minValue);
        int result = stock.getMinPrice();
        printTestResult(result == minValue,"Update Min");
    }
    public void testCurrentValue(int currentValue) {
        stock.updatePrice(currentValue);
        int result = stock.getCurrentPrice();
        printTestResult(result == currentValue,"Update Current");
    }
    private void printTestResult(boolean isResultOk,String testValue) {
        if (isResultOk) {
            System.out.println("Stock test - " + testValue + " = OK");
        } else {
            System.out.println("Stock test - " + testValue + " = FAIL");
        }
    }
}
