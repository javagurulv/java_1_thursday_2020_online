package student_vadims_vladisevs.lesson9.day_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudRule2Test {

    @Test
    public void isFraudRule2V1() {
        Trader trader = new Trader("Vadim","Latvia", "Riga");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule2 fraudRule2 = new FraudRule2("checkTransactionAmount");

        boolean actual = fraudRule2.isFraud(transaction);
        assertFalse(actual);
    }

    @Test
    public void isFraudRule2V2() {
        Trader trader = new Trader("Vadim","Latvia", "Riga");
        Transaction transaction = new Transaction(trader, 2000000);
        FraudRule2 fraudRule2 = new FraudRule2("checkTransactionAmount");

        boolean actual = fraudRule2.isFraud(transaction);
        assertTrue(actual);
    }
}