package student_alexander_bogachenkov.lesson9_18062020.homeworks.level_4.task_21;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudDetectorTest {

    @Test
    public void shouldReturnTrue_whenAmountIsOverLimit() {
        Trader trader = new Trader("Alex", "Germany", "Berlin");
        Transaction transaction = new Transaction(trader, 2000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean expected = true;
        boolean actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalse_whenAmountEqualsLimit() {
        Trader trader = new Trader("Alex", "Germany", "Berlin");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean expected = false;
        boolean actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalse_whenAmountIsUnderLimit() {
        Trader trader = new Trader("Alex", "Germany", "Berlin");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        boolean expected = false;
        boolean actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }
}