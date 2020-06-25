package student_aleksey_kodin.lesson9.level4.task_21;

import org.junit.Test;
import static org.junit.Assert.*;

public class FraudDetectorTest {

    @Test
    public void banSum_waitingTrue() {
        Trader trader = new Trader("AnyMane", "Berlin", "Германия");
        Transaction transaction = new Transaction(trader, 5000);
        FraudDetector fraudDetector = new FraudDetector();

        boolean result = fraudDetector.isFraud(transaction);
        assertTrue(result);
    }

    @Test
    public void banSum_waitingFalse() {
        Trader trader = new Trader("AnyMane", "Пекин", "Китай");
        Transaction transaction = new Transaction(trader, 500);
        FraudDetector fraudDetector = new FraudDetector();

        boolean result = fraudDetector.isFraud(transaction);
        assertFalse(result);
    }

}