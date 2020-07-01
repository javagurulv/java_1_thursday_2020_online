package student_vadims_vladisevs.lesson9.day_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudRule4Test {

    @Test
    public void isFraudV1() {
        Trader trader = new Trader("Vadim","Latvia", "Riga");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule4 fraudRule4 = new FraudRule4("checkTraderCountry");

        boolean actual = fraudRule4.isFraud(transaction);
        assertFalse(actual);
    }

    @Test
    public void isFraudV2() {
        Trader trader = new Trader("Pokemon","Jamaica", "Kingston");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule4 fraudRule4 = new FraudRule4("checkTraderName");

        boolean actual = fraudRule4.isFraud(transaction);
        assertTrue(actual);
    }
}