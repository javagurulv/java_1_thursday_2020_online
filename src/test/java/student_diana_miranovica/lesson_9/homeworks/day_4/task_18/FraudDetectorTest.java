package student_diana_miranovica.lesson_9.homeworks.day_4.task_18;

import junit.framework.TestCase;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class FraudDetectorTest {

    @Test
    public void shouldReturnTrueWhenAmountOverLimit() {
        Trader trader = new Trader("Pokemon", "Paris");
       Transaction transaction = new Transaction(trader, 1030000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean expected = true;
        boolean actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalseWhenAmountIsLessLimit() {
        Trader trader = new Trader("Alexander", "Riga");
        Transaction transaction = new Transaction(trader, 99999);
        FraudDetector fraudDetector = new FraudDetector();
        boolean expected = false;
        boolean actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }
    @Test
    public void shouldReturnFalseWhenAmountIsEqualsLimit() {
        Trader trader = new Trader("Alexander", "Riga");
        Transaction transaction = new Transaction(trader, 1000000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean expected = false;
        boolean actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }

}