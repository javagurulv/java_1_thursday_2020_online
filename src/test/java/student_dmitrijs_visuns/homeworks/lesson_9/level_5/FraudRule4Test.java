package student_dmitrijs_visuns.homeworks.lesson_9.level_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudRule4Test {

    @Test
    public void testForTraderCountry1 () {
        Trader trader = new Trader("A", "B", "Ямайка");
        Transaction t = new Transaction (trader, 100);
        FraudRule4 fraudRule4 = new FraudRule4("traderCountryCheck");
        boolean isFraudResult = fraudRule4.isFraud(t);
        assertTrue(isFraudResult);
    }

    @Test
    public void testForTraderCountry2 () {
        Trader trader = new Trader("A", "B", "C");
        Transaction t = new Transaction (trader, 100);
        FraudRule4 fraudRule4 = new FraudRule4("traderCountryCheck");
        boolean isFraudResult = fraudRule4.isFraud(t);
        assertFalse(isFraudResult);
    }

}