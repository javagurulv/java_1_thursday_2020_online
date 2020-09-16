package student_igors_mihejevs.lesson_9.homework.level_5;

import org.junit.Test;

import static org.junit.Assert.*;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class FraudRule2Test {

    @Test
    public void fraudDetectorTestNegativeRule2() {
        Trader trader = new Trader("Trader", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 950000);
        FraudRule2 fraudRule = new FraudRule2("Amount more than 1000000");

        assertFalse(fraudRule.isFraud(transaction));
    }

    @Test
    public void fraudDetectorTestPositiveRule2() {
        Trader trader = new Trader("Trader", "Shanghai", "China");
        Transaction transaction = new Transaction(trader, 1000001);
        FraudRule2 fraudRule = new FraudRule2("Amount more than 1000000");

        assertTrue(fraudRule.isFraud(transaction));
    }

}