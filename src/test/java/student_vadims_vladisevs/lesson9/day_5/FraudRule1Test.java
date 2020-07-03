package student_vadims_vladisevs.lesson9.day_5;


import org.junit.Test;

import static org.junit.Assert.*;

public class FraudRule1Test {

    @Test
    public void isFraudV1() {
        Trader trader = new Trader("Vadim","Latvia", "Riga");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule1 fraudRule1 = new FraudRule1("checkTraderName");

        boolean actual = fraudRule1.isFraud(transaction);
        assertFalse(actual);
    }

    @Test
    public void isFraudV2() {
        Trader trader = new Trader("Pokemon","Latvia", "Riga");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule1 fraudRule1 = new FraudRule1("checkTraderName");

        boolean actual = fraudRule1.isFraud(transaction);
        assertTrue(actual);
    }
}