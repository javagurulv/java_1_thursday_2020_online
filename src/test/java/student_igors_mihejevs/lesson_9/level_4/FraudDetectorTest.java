package student_igors_mihejevs.lesson_9.level_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudDetectorTest {

    @Test
    public void fraudDetectorTestNegativePokemon() {
        Trader trader = new Trader("Not Pokemon", "Riga");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector();

        assertFalse(fraudDetector.isFraud(transaction));
    }

    @Test
    public void fraudDetectorTestPositivePokemon() {
        Trader trader = new Trader("Pokemon", "New York");
        Transaction transaction = new Transaction(trader, 100000);
        FraudDetector fraudDetector = new FraudDetector();

        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    public void fraudDetectorTestNegativeAmount() {
        Trader trader = new Trader("Trader", "Riga");
        Transaction transaction = new Transaction(trader, 100000);
        FraudDetector fraudDetector = new FraudDetector();

        assertFalse(fraudDetector.isBigAmount(transaction));
    }

    @Test
    public void fraudDetectorTestPositiveAmount() {
        Trader trader = new Trader("Trader", "Riga");
        Transaction transaction = new Transaction(trader, 1000001);
        FraudDetector fraudDetector = new FraudDetector();

        assertTrue(fraudDetector.isBigAmount(transaction));
    }

}