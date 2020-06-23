package student_alexander_bogachenkov.lesson9_18062020.homeworks.level_5.task_27;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudRule4Test {

    @Test
    public void shouldReturnTrue() {
        Trader trader = new Trader("John", "Jamaica", "Kingston");
        Transaction transaction = new Transaction(trader, 343);
        FraudRule4 fraudDetector = new FraudRule4("Rule4");
        boolean expected = true;
        boolean actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalse() {
        Trader trader = new Trader("John", "USA", "Washington");
        Transaction transaction = new Transaction(trader, 345);
        FraudRule4 fraudDetector = new FraudRule4("Rule4");
        boolean expected = false;
        boolean actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }

}