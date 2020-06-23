package student_alexander_bogachenkov.lesson9_18062020.homeworks.level_5.task_28;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudRule5Test {

    @Test
    public void shouldReturnTrue_whenAmountIsOverLimit() {
        Trader trader = new Trader("Alex", "Germany", "Berlin");
        Transaction transaction = new Transaction(trader, 2000);
        FraudRule5 fraudDetector = new FraudRule5("Rule 5");
        boolean expected = true;
        boolean actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalse_whenAmountEqualsLimit() {
        Trader trader = new Trader("Alex", "Germany", "Berlin");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule5 fraudDetector = new FraudRule5("Rule 5");
        boolean expected = false;
        boolean actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalse_whenAmountIsUnderLimit() {
        Trader trader = new Trader("Alex", "Germany", "Berlin");
        Transaction transaction = new Transaction(trader, 100);
        FraudRule5 fraudDetector = new FraudRule5("Rule 5");
        boolean expected = false;
        boolean actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }

}