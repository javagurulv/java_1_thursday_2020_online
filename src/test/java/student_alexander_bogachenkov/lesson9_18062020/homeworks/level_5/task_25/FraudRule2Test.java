package student_alexander_bogachenkov.lesson9_18062020.homeworks.level_5.task_25;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudRule2Test {

    @Test
    public void shouldReturnTrue_whenAmountIsOverLimit() {
        Trader trader = new Trader("Michael", "London", "UK");
        Transaction transaction = new Transaction(trader, 2000000);
        FraudRule2 fraudDetector = new FraudRule2("Rule2");
        boolean expected = true;
        boolean actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalse_whenAmountEqualsLimit() {
        Trader trader = new Trader("Michael", "London", "UK");
        Transaction transaction = new Transaction(trader, 1000000);
        FraudRule2 fraudDetector = new FraudRule2("Rule2");
        boolean expected = false;
        boolean actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalse_whenAmountIsUnderLimit() {
        Trader trader = new Trader("Michael", "London", "UK");
        Transaction transaction = new Transaction(trader, 500000);
        FraudRule2 fraudDetector = new FraudRule2("Rule2");
        boolean expected = false;
        boolean actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }

}