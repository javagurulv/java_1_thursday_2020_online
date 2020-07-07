package student_dmitrijs_visuns.homeworks.lesson_9.level_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudRule3Test {

    @Test
    public void testForTraderCity1 () {
        Trader trader = new Trader("A", "Сидней", "C");
        Transaction t = new Transaction (trader, 100);
        FraudRule3 fraudRule3 = new FraudRule3("traderCityCheck");
        boolean isFraudResult = fraudRule3.isFraud(t);
        assertTrue(isFraudResult);
    }

    @Test
    public void testForTraderCity2 () {
        Trader trader = new Trader("A", "B", "C");
        Transaction t = new Transaction (trader, 100);
        FraudRule3 fraudRule3 = new FraudRule3("traderCityCheck");
        boolean isFraudResult = fraudRule3.isFraud(t);
        assertFalse(isFraudResult);
    }

}