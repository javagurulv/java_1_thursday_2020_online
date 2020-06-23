package student_aleksey_kodin.lesson9.level5.task_24;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudRule1Test {

    @Test
    public void isFraud_waitingTrue() {
        Trader trader = new Trader("Pokemon", "Berlin", "Германия");
        Transaction transaction = new Transaction(trader, 1050);
        FraudRule1 fraudRule1 = new FraudRule1("Ban Name");

        boolean result = fraudRule1.isFraud(transaction);

        assertTrue(result);
    }

    @Test
    public void isFraud_waitingFalse() {
        Trader trader = new Trader("AnyName", "Berlin", "Германия");
        Transaction transaction = new Transaction(trader, 1050);
        FraudRule1 fraudRule1 = new FraudRule1("Ban Name");

        boolean result = fraudRule1.isFraud(transaction);

        assertFalse(result);
    }

}