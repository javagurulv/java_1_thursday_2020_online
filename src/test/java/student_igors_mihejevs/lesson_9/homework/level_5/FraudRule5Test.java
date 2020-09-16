package student_igors_mihejevs.lesson_9.homework.level_5;

import org.junit.Test;

import static org.junit.Assert.*;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class FraudRule5Test {

    @Test // Not Germany and less than 1000
    public void fraudDetectorTestNegative1GermanyMoreThan1000() {
        Trader trader = new Trader("Trader", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 900);
        FraudRule5 fraudRule = new FraudRule5("Germany with amount more than 1000");

        assertFalse(fraudRule.isFraud(transaction));
    }

    @Test // Germany and less than 1000
    public void fraudDetectorTestNegative2GermanyMoreThan1000() {
        Trader trader = new Trader("Trader", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 900);
        FraudRule5 fraudRule = new FraudRule5("Germany with amount more than 1000");

        assertFalse(fraudRule.isFraud(transaction));
    }

    @Test // Not Germany and more than 1000
    public void fraudDetectorTestNegative3GermanyMoreThan1000() {
        Trader trader = new Trader("Trader", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1001);
        FraudRule5 fraudRule = new FraudRule5("Germany with amount more than 1000");

        assertFalse(fraudRule.isFraud(transaction));
    }

    @Test
    public void fraudDetectorTestPositiveGermanyMoreThan1000() {
        Trader trader = new Trader("Trader", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1001);
        FraudRule5 fraudRule = new FraudRule5("Germany with amount more than 1000");

        assertTrue(fraudRule.isFraud(transaction));
    }

}