package student_vadims_vladisevs.lesson9.day_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudDetectorTest {

    @Test
    public void isFraudV1() {
        Trader trader = new Trader("Vadim","Latvia", "Riga");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();

        boolean actual = fraudDetector.isFraud(transaction);
        assertFalse(actual);
    }

    @Test
    public void isFraudV2() {
        Trader trader = new Trader("Pokemon","Latvia", "Riga");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();

        boolean actual = fraudDetector.isFraud(transaction);
        assertTrue(actual);
    }

    @Test
    public void isFraudV3() {
        Trader trader = new Trader("Vadim","Latvia", "Riga");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();

        boolean actual = fraudDetector.isFraud(transaction);
        assertFalse(actual);
    }

    @Test
    public void isFraudV4() {
        Trader trader = new Trader("Vadim","Latvia", "Riga");
        Transaction transaction = new Transaction(trader, 2000000);
        FraudDetector fraudDetector = new FraudDetector();

        boolean actual = fraudDetector.isFraud(transaction);
        assertTrue(actual);
    }

    @Test
    public void isFraudV5() {
        Trader trader = new Trader("Vadim","Latvia", "Riga");
        Transaction transaction = new Transaction(trader, 20000);
        FraudDetector fraudDetector = new FraudDetector();

        boolean actual = fraudDetector.isFraud(transaction);
        assertFalse(actual);
    }

    @Test
    public void isFraudV6() {
        Trader trader = new Trader("Vadim","Australia", "Sidney");
        Transaction transaction = new Transaction(trader, 2000);
        FraudDetector fraudDetector = new FraudDetector();

        boolean actual = fraudDetector.isFraud(transaction);
        assertTrue(actual);
    }

    @Test
    public void isFraudV7() {
        Trader trader = new Trader("Vadim","Australia", "Canberra");
        Transaction transaction = new Transaction(trader, 2000);
        FraudDetector fraudDetector = new FraudDetector();

        boolean actual = fraudDetector.isFraud(transaction);
        assertFalse(actual);
    }

    @Test
    public void isFraudV8() {
        Trader trader = new Trader("Vadim","Jamaica", "Kingston");
        Transaction transaction = new Transaction(trader, 2000);
        FraudDetector fraudDetector = new FraudDetector();

        boolean actual = fraudDetector.isFraud(transaction);
        assertTrue(actual);
    }

    @Test
    public void isFraudV9() {
        Trader trader = new Trader("Vadim","Germany", "Dortmund");
        Transaction transaction = new Transaction(trader, 200);
        FraudDetector fraudDetector = new FraudDetector();

        boolean actual = fraudDetector.isFraud(transaction);
        assertFalse(actual);
    }

    @Test
    public void isFraudV10() {
        Trader trader = new Trader("Vadim","Germany", "Dortmund");
        Transaction transaction = new Transaction(trader, 2000);
        FraudDetector fraudDetector = new FraudDetector();

        boolean actual = fraudDetector.isFraud(transaction);
        assertTrue(actual);
    }


}