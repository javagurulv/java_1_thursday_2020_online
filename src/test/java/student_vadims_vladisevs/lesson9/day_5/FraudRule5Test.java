package student_vadims_vladisevs.lesson9.day_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudRule5Test {

    @Test
    public void isFraudV1() {
        Trader trader = new Trader("Vadim","Germany", "Frankfurt");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule5 fraudRule5 = new FraudRule5("checkTraderCountryAndAmount");

        boolean actual = fraudRule5.isFraud(transaction);
        assertFalse(actual);
    }

    @Test
    public void isFraudV2() {
        Trader trader = new Trader("Pokemon","Germany", "Frankfurt");
        Transaction transaction = new Transaction(trader, 2000);
        FraudRule5 fraudRule5 = new FraudRule5("checkTraderCountryAndAmount");

        boolean actual = fraudRule5.isFraud(transaction);
        assertTrue(actual);
    }
}