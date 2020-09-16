package student_igors_mihejevs.lesson_9.homework.level_6;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class FraudDetectorTest {


    @Test
    public void fraudDetectorTestPositiveFraudRule1() {
        FraudRule[] fraudRules = new FraudRule[1];
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 100);
        fraudRules[0] = new FraudRule1("Fraud Rule 1");
        FraudDetector fraudDetector = new FraudDetector(fraudRules);

        assertTrue(fraudDetector.isFraud(transaction).isFraud());
    }

    @Test
    public void fraudDetectorTestPositiveFraudRule2() {
        FraudRule[] fraudRules = new FraudRule[2];
        Trader trader = new Trader("Trader", "Shanghai", "China");
        Transaction transaction = new Transaction(trader, 1000001);
        fraudRules[0] = new FraudRule1("Fraud Rule 1");
        fraudRules[1] = new FraudRule2("Fraud Rule 2");
        FraudDetector fraudDetector = new FraudDetector(fraudRules);

        assertTrue(fraudDetector.isFraud(transaction).isFraud());
    }

    @Test
    public void fraudDetectorTestPositiveFraudRule3() {
        FraudRule[] fraudRules = new FraudRule[3];
        Trader trader = new Trader("Trader", "Sydney", "Australia");
        Transaction transaction = new Transaction(trader, 1000);
        fraudRules[0] = new FraudRule1("Fraud Rule 1");
        fraudRules[1] = new FraudRule2("Fraud Rule 2");
        fraudRules[2] = new FraudRule3("Fraud Rule 3");
        FraudDetector fraudDetector = new FraudDetector(fraudRules);

        assertTrue(fraudDetector.isFraud(transaction).isFraud());
    }

    @Test
    public void fraudDetectorTestPositiveFraudRule4() {
        FraudRule[] fraudRules = new FraudRule[4];
        Trader trader = new Trader("Trader", "Mandeville", "Jamaica");
        Transaction transaction = new Transaction(trader, 1000);
        fraudRules[0] = new FraudRule1("Fraud Rule 1");
        fraudRules[1] = new FraudRule2("Fraud Rule 2");
        fraudRules[2] = new FraudRule3("Fraud Rule 3");
        fraudRules[3] = new FraudRule4("Fraud Rule 4");
        FraudDetector fraudDetector = new FraudDetector(fraudRules);

        assertTrue(fraudDetector.isFraud(transaction).isFraud());
    }

    @Test
    public void fraudDetectorTestPositiveFraudRule5() {
        FraudRule[] fraudRules = new FraudRule[5];
        Trader trader = new Trader("Trader", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1001);
        fraudRules[0] = new FraudRule1("Fraud Rule 1");
        fraudRules[1] = new FraudRule2("Fraud Rule 2");
        fraudRules[2] = new FraudRule3("Fraud Rule 3");
        fraudRules[3] = new FraudRule4("Fraud Rule 4");
        fraudRules[4] = new FraudRule5("Fraud Rule 5");
        FraudDetector fraudDetector = new FraudDetector(fraudRules);

        assertTrue(fraudDetector.isFraud(transaction).isFraud());
    }

    @Test
    public void fraudDetectorTestNegativeFraudRule1() {
        FraudRule[] fraudRules = new FraudRule[2];
        Trader trader = new Trader("Not Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 100);
        fraudRules[0] = new FraudRule1("Fraud Rule 1");
        fraudRules[1] = new FraudRule2("Fraud Rule 2");
        FraudDetector fraudDetector = new FraudDetector(fraudRules);

        assertFalse(fraudDetector.isFraud(transaction).isFraud());
    }

    @Test
    public void fraudDetectorTestNegativeFraudRule2() {
        FraudRule[] fraudRules = new FraudRule[3];
        Trader trader = new Trader("Trader", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 950000);
        fraudRules[0] = new FraudRule1("Fraud Rule 1");
        fraudRules[1] = new FraudRule2("Fraud Rule 2");
        fraudRules[2] = new FraudRule3("Fraud Rule 3");
        FraudDetector fraudDetector = new FraudDetector(fraudRules);

        assertFalse(fraudDetector.isFraud(transaction).isFraud());
    }

    @Test
    public void fraudDetectorTestNegativeFraudRule3() {
        FraudRule[] fraudRules = new FraudRule[4];
        Trader trader = new Trader("Trader", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);
        fraudRules[0] = new FraudRule1("Fraud Rule 1");
        fraudRules[1] = new FraudRule2("Fraud Rule 2");
        fraudRules[2] = new FraudRule3("Fraud Rule 3");
        fraudRules[3] = new FraudRule4("Fraud Rule 4");
        FraudDetector fraudDetector = new FraudDetector(fraudRules);

        assertFalse(fraudDetector.isFraud(transaction).isFraud());
    }

    @Test
    public void fraudDetectorTestNegativeFraudRule4() {
        FraudRule[] fraudRules = new FraudRule[5];
        Trader trader = new Trader("Trader", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);
        fraudRules[0] = new FraudRule1("Fraud Rule 1");
        fraudRules[1] = new FraudRule2("Fraud Rule 2");
        fraudRules[2] = new FraudRule3("Fraud Rule 3");
        fraudRules[3] = new FraudRule4("Fraud Rule 4");
        fraudRules[4] = new FraudRule5("Fraud Rule 5");
        FraudDetector fraudDetector = new FraudDetector(fraudRules);

        assertFalse(fraudDetector.isFraud(transaction).isFraud());
    }

    @Test // Not Germany and less than 1000
    public void fraudDetectorTestNegative1FraudRule5() {
        FraudRule[] fraudRules = new FraudRule[5];
        Trader trader = new Trader("Trader", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 900);
        fraudRules[0] = new FraudRule1("Fraud Rule 1");
        fraudRules[1] = new FraudRule2("Fraud Rule 2");
        fraudRules[2] = new FraudRule3("Fraud Rule 3");
        fraudRules[3] = new FraudRule4("Fraud Rule 4");
        fraudRules[4] = new FraudRule5("Fraud Rule 5");
        FraudDetector fraudDetector = new FraudDetector(fraudRules);

        assertFalse(fraudDetector.isFraud(transaction).isFraud());
    }

    @Test // Germany and less than 1000
    public void fraudDetectorTestNegative2FraudRule5() {
        FraudRule[] fraudRules = new FraudRule[5];
        Trader trader = new Trader("Trader", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 900);
        fraudRules[0] = new FraudRule1("Fraud Rule 1");
        fraudRules[1] = new FraudRule2("Fraud Rule 2");
        fraudRules[2] = new FraudRule3("Fraud Rule 3");
        fraudRules[3] = new FraudRule4("Fraud Rule 4");
        fraudRules[4] = new FraudRule5("Fraud Rule 5");
        FraudDetector fraudDetector = new FraudDetector(fraudRules);

        assertFalse(fraudDetector.isFraud(transaction).isFraud());
    }

    @Test // Not Germany and more than 1000
    public void fraudDetectorTestNegative3FraudRule5() {
        FraudRule[] fraudRules = new FraudRule[5];
        Trader trader = new Trader("Trader", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1001);
        fraudRules[0] = new FraudRule1("Fraud Rule 1");
        fraudRules[1] = new FraudRule2("Fraud Rule 2");
        fraudRules[2] = new FraudRule3("Fraud Rule 3");
        fraudRules[3] = new FraudRule4("Fraud Rule 4");
        fraudRules[4] = new FraudRule5("Fraud Rule 5");
        FraudDetector fraudDetector = new FraudDetector(fraudRules);

        assertFalse(fraudDetector.isFraud(transaction).isFraud());
    }
}