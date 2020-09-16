package student_igors_mihejevs.lesson_9.homework.level_5;

import org.junit.Test;

import static org.junit.Assert.*;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class FraudRule1Test {

    @Test
    public void fraudDetectorTestNegativeFraudRule1() {
        Trader trader = new Trader("Not Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 100);
        FraudRule1 fraudRule = new FraudRule1("Is Pokemon");

        assertFalse(fraudRule.isFraud(transaction));
    }

    @Test
    public void fraudDetectorTestPositiveFraudRule1() {
        Trader trader = new Trader("Pokemon", "New York", "USA");
        Transaction transaction = new Transaction(trader, 100000);
        FraudRule1 fraudRule = new FraudRule1("Is Pokemon");

        assertTrue(fraudRule.isFraud(transaction));
    }

}