package student_igors_mihejevs.lesson_9.level_5;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FraudDetectorTest {

    @Test
    public void fraudDetectorTestNegativeFraudRule1() {
        FraudRule[] fraudRules = new FraudRule[5];
        Trader trader = new Trader("Not Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 100);
        fraudRules[0] = new FraudRule1("Fraud Rule 1");
        fraudRules[1] = new FraudRule2("Fraud Rule 2");
        fraudRules[2] = new FraudRule3("Fraud Rule 3");
        fraudRules[3] = new FraudRule4("Fraud Rule 4");
        fraudRules[4] = new FraudRule5("Fraud Rule 5");
        FraudDetector fraudDetector = new FraudDetector(fraudRules);

        assertFalse(fraudDetector.isFraud(transaction));
    }

    @Test
    public void fraudDetectorTestPositiveFraudRule1() {
        FraudRule[] fraudRules = new FraudRule[5];
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 100);
        fraudRules[0] = new FraudRule1("Fraud Rule 1");
        fraudRules[1] = new FraudRule2("Fraud Rule 2");
        fraudRules[2] = new FraudRule3("Fraud Rule 3");
        fraudRules[3] = new FraudRule4("Fraud Rule 4");
        fraudRules[4] = new FraudRule5("Fraud Rule 5");
        FraudDetector fraudDetector = new FraudDetector(fraudRules);

        assertTrue(fraudDetector.isFraud(transaction));
    }

}