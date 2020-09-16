package student_igors_mihejevs.lesson_9.homework.level_5;

import org.junit.Test;

import static org.junit.Assert.*;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class FraudRule4Test {

    @Test
    public void fraudDetectorTestNegativeJamaica() {
        Trader trader = new Trader("Trader", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule4 fraudRule = new FraudRule4("The country is Jamaica");

        assertFalse(fraudRule.isFraud(transaction));
    }

    @Test
    public void fraudDetectorTestPositiveJamaica() {
        Trader trader = new Trader("Trader", "Mandeville", "Jamaica");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule4 fraudRule = new FraudRule4("The country is Jamaica");

        assertTrue(fraudRule.isFraud(transaction));
    }

}