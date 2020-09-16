package student_igors_mihejevs.lesson_9.homework.level_5;

import org.junit.Test;

import static org.junit.Assert.*;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class FraudRule3Test {

    @Test
    public void fraudDetectorTestNegativeSydney() {
        Trader trader = new Trader("Trader", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule3 fraudRule = new FraudRule3("The city is Sydney");

        assertFalse(fraudRule.isFraud(transaction));
    }

    @Test
    public void fraudDetectorTestPositiveSydney() {
        Trader trader = new Trader("Trader", "Sydney", "Australia");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule3 fraudRule = new FraudRule3("The city is Sydney");

        assertTrue(fraudRule.isFraud(transaction));
    }

}