package student_diana_miranovica.lesson_9.homeworks.day_4.task_19;

import junit.framework.TestCase;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class FraudDetectorTest {
    @Test
    public void shouldReturnTrueWhenCityIsSydney() {
        Trader trader = new Trader("Pokemon", "Sydney");
        Transaction transaction = new Transaction(trader, 2000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean expected = true;
        boolean actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalseWhenIsAnotherCity() {
        Trader trader = new Trader("Alexander", "Riga");
        Transaction transaction = new Transaction(trader, 78000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean expected = false;
        boolean actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }

}