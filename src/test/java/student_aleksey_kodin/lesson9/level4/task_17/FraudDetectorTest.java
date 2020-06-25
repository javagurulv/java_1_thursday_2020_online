package student_aleksey_kodin.lesson9.level4.task_17;

import org.junit.Test;
import static org.junit.Assert.*;

public class FraudDetectorTest {

    @Test
    public void isFraud_waitingTrue() {
        Trader trader = new Trader("Pokemon", "London");
        Transaction transaction = new Transaction(trader, 500);
        FraudDetector fraudDetector = new FraudDetector();

        boolean result = fraudDetector.isFraud(transaction);
        assertTrue(result);
    }

    @Test
    public void isFraud_waitingFalse() {
        Trader trader = new Trader("AnyName", "London");
        Transaction transaction = new Transaction(trader, 500);
        FraudDetector fraudDetector = new FraudDetector();

        boolean result = fraudDetector.isFraud(transaction);
        assertFalse(result);
    }
}