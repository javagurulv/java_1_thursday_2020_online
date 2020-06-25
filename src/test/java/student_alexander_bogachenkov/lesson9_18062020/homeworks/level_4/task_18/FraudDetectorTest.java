package student_alexander_bogachenkov.lesson9_18062020.homeworks.level_4.task_18;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudDetectorTest {

    @Test
    public void shouldReturnTrue_whenAmountIsOverLimit() {
        Trader trader = new Trader("Michael", "London");
        Transaction transaction = new Transaction(trader, 2000000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean expected = true;
        boolean actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalse_whenAmountEqualsLimit() {
        Trader trader = new Trader("Michael", "London");
        Transaction transaction = new Transaction(trader, 1000000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean expected = false;
        boolean actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalse_whenAmountIsUnderLimit() {
        Trader trader = new Trader("Michael", "London");
        Transaction transaction = new Transaction(trader, 500000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean expected = false;
        boolean actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }
}