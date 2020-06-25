package student_alexander_bogachenkov.lesson9_18062020.homeworks.level_4.task_17;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudDetectorTest {

    @Test
    public void shouldReturnTrue() {
        Trader trader = new Trader("Pokemon", "Moscow");
        Transaction transaction = new Transaction(trader, 700);
        FraudDetector fraudDetector = new FraudDetector();
        boolean expected = true;
        boolean actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalse() {
        Trader trader = new Trader("Vasya", "Moscow");
        Transaction transaction = new Transaction(trader, 700);
        FraudDetector fraudDetector = new FraudDetector();
        boolean expected = false;
        boolean actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }
}