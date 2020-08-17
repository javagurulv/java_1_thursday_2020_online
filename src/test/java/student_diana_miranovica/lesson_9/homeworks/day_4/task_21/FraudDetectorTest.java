package student_diana_miranovica.lesson_9.homeworks.day_4.task_21;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FraudDetectorTest  {
    @Test
    public void shouldReturnTrueWhenCountryIsGermanyAndAmountIsOverLimit() {
       Trader trader = new Trader("Pokemon", "Sydney","Germany");
        Transaction transaction = new Transaction(trader, 2000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean expected = true;
        boolean actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }
    @Test
    public void shouldReturnFalseWhenCountryIsAnotherAndAmountIsLessLimit() {
        Trader trader = new Trader("Alex", "Riga","Latvia");
        Transaction transaction = new Transaction(trader, 800);
        FraudDetector fraudDetector = new FraudDetector();
        boolean expected = false;
        boolean actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }

}