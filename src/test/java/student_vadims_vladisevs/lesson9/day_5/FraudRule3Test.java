package student_vadims_vladisevs.lesson9.day_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudRule3Test {

    @Test
    public void isFraudV1() {
        Trader trader = new Trader("Vadim","Latvia", "Riga");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule3 fraudRule3 = new FraudRule3("checkTraderCity");

        boolean actual = fraudRule3.isFraud(transaction);
        assertFalse(actual);
    }

    @Test
    public void isFraudV2() {
        Trader trader = new Trader("Pokemon","Latvia", "Sidney");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule3 fraudRule3 = new FraudRule3("checkTraderCity");

        boolean actual = fraudRule3.isFraud(transaction);
        assertTrue(actual);
    }
}