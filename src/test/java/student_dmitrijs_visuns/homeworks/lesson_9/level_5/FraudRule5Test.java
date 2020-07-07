package student_dmitrijs_visuns.homeworks.lesson_9.level_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudRule5Test {

    @Test
    public void testForCountryAndAmount1 () {
        Trader trader = new Trader("A", "B", "Германия");
        Transaction t = new Transaction (trader, 1500);
        FraudRule5 fraudRule5 = new FraudRule5("countryAndAmountCombinationCheck");
        boolean isFraudResult = fraudRule5.isFraud(t);
        assertTrue(isFraudResult);
    }

    @Test
    public void testForCountryAndAmount2 () {
        Trader trader = new Trader("A", "B", "Германия");
        Transaction t = new Transaction (trader, 100);
        FraudRule5 fraudRule5 = new FraudRule5("countryAndAmountCombinationCheck");
        boolean isFraudResult = fraudRule5.isFraud(t);
        assertFalse(isFraudResult);
    }

}