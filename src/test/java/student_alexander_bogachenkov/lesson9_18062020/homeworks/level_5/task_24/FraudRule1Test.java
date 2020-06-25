package student_alexander_bogachenkov.lesson9_18062020.homeworks.level_5.task_24;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudRule1Test {

    @Test
    public void shouldReturnTrue() {
        Trader trader = new Trader("Pokemon", "Moscow", "Russia");
        Transaction transaction = new Transaction(trader, 700);
        FraudRule1 fraudDetector = new FraudRule1("Rule1");
        boolean expected = true;
        boolean actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalse() {
        Trader trader = new Trader("Vasya", "Moscow", "Russia");
        Transaction transaction = new Transaction(trader, 700);
        FraudRule1 fraudDetector = new FraudRule1("Rule1");
        boolean expected = false;
        boolean actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }
}