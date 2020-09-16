package student_igors_mihejevs.lesson_9.homework.level_4;

import org.junit.Test;

import static org.junit.Assert.*;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
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
        Trader trader = new Trader("Trader", "Sydney", "Australia");
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

    @Test // Not Germany and less than 1000
    public void fraudDetectorTestNegative1GermanyMoreThan1000() {
        Trader trader = new Trader("Trader", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 900);
        FraudDetector fraudDetector = new FraudDetector();

        assertFalse(fraudDetector.isFraudGermanyMoreThan1000(transaction));
    }

    @Test // Germany and less than 1000
    public void fraudDetectorTestNegative2GermanyMoreThan1000() {
        Trader trader = new Trader("Trader", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 900);
        FraudDetector fraudDetector = new FraudDetector();

        assertFalse(fraudDetector.isFraudGermanyMoreThan1000(transaction));
    }

    @Test // Not Germany and more than 1000
    public void fraudDetectorTestNegative3GermanyMoreThan1000() {
        Trader trader = new Trader("Trader", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1001);
        FraudDetector fraudDetector = new FraudDetector();

        assertFalse(fraudDetector.isFraudGermanyMoreThan1000(transaction));
    }

    @Test
    public void fraudDetectorTestPositiveGermanyMoreThan1000() {
        Trader trader = new Trader("Trader", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1001);
        FraudDetector fraudDetector = new FraudDetector();

        assertTrue(fraudDetector.isFraudGermanyMoreThan1000(transaction));
    }


}