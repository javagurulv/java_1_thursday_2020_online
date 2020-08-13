package student_diana_miranovica.lesson_9.homeworks.day_4.task_17;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FraudDetectorTest {
    //

    @Test
    public void shouldReturnTrue() {
       Trader trader = new Trader("Pokemon", "Paris");
        Transaction transaction = new Transaction(trader, 4700);
        FraudDetector fraudDetector = new FraudDetector();
        boolean expected = true;
        boolean actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalse() {
       Trader trader = new Trader("Alexander", "Riga");
        Transaction transaction = new Transaction(trader, 5400);
        FraudDetector fraudDetector = new FraudDetector();
        boolean expected = false;
        boolean actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }

}