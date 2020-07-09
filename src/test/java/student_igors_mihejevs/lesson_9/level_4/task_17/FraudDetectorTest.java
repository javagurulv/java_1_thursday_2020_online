package student_igors_mihejevs.lesson_9.level_4.task_17;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudDetectorTest {

    @Test
    public void fraudDetectorTestNegative() {
        Trader trader = new Trader("Not Pokemon", "Riga");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector();

        assertFalse(fraudDetector.isFraud(transaction));
    }

    @Test
    public void fraudDetectorTestPositive() {
        Trader trader = new Trader("Pokemon", "New York");
        Transaction transaction = new Transaction(trader, 100000);
        FraudDetector fraudDetector = new FraudDetector();

        assertTrue(fraudDetector.isFraud(transaction));
    }

}