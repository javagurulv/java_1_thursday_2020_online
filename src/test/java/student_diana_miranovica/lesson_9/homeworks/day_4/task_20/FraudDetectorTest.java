package student_diana_miranovica.lesson_9.homeworks.day_4.task_20;

import junit.framework.TestCase;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class FraudDetectorTest  {

    @Test
    public void shouldReturnTrueWhenCountryIsJamaica() {
        Trader trader = new Trader("Pokemon", "Sydney","Jamaica");
        Transaction transaction = new Transaction(trader, 2000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean expected = true;
        boolean actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalseWhenIsAnotherCountry() {
        Trader trader = new Trader("Alex", "Riga","Latvia");
        Transaction transaction = new Transaction(trader, 75000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean expected = false;
        boolean actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }
}