package student_igors_mihejevs.lesson_9.level_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudDetectorTest {

    @Test
    public void fraudDetectorTestNegativePokemon() {
        Trader trader = new Trader("Not Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector();

        assertFalse(fraudDetector.isFraudPokemon(transaction));
    }

    @Test
    public void fraudDetectorTestPositivePokemon() {
        Trader trader = new Trader("Pokemon", "New York", "USA");
        Transaction transaction = new Transaction(trader, 100000);
        FraudDetector fraudDetector = new FraudDetector();

        assertTrue(fraudDetector.isFraudPokemon(transaction));
    }

    @Test
    public void fraudDetectorTestNegativeAmount() {
        Trader trader = new Trader("Trader", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 100000);
        FraudDetector fraudDetector = new FraudDetector();

        assertFalse(fraudDetector.isFraudBigAmount(transaction));
    }

    @Test
    public void fraudDetectorTestPositiveAmount() {
        Trader trader = new Trader("Trader", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000001);
        FraudDetector fraudDetector = new FraudDetector();

        assertTrue(fraudDetector.isFraudBigAmount(transaction));
    }

    @Test
    public void fraudDetectorTestNegativeSidney() {
        Trader trader = new Trader("Trader", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();

        assertFalse(fraudDetector.isFraudSidney(transaction));
    }

    @Test
    public void fraudDetectorTestPositiveSidney() {
        Trader trader = new Trader("Trader", "Sidney", "Australia");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();

        assertTrue(fraudDetector.isFraudSidney(transaction));
    }

    @Test
    public void fraudDetectorTestNegativeJamaica() {
        Trader trader = new Trader("Trader", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();

        assertFalse(fraudDetector.isFraudJamaica(transaction));
    }

    @Test
    public void fraudDetectorTestPositiveJamaica() {
        Trader trader = new Trader("Trader", "Mandeville", "Jamaica");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();

        assertTrue(fraudDetector.isFraudJamaica(transaction));
    }

}