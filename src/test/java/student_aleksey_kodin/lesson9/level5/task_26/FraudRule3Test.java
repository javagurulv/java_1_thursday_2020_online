package student_aleksey_kodin.lesson9.level5.task_26;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudRule3Test {

    @Test
    public void isFraud_waitingTrue() {
        Trader trader = new Trader("Pokemon", "Сидней", "Германия");
        Transaction transaction = new Transaction(trader, 1050);
        FraudRule3 fraudRule3 = new FraudRule3("Ban city Сидней");

        boolean result = fraudRule3.isFraud(transaction);

        assertTrue(result);
    }

    @Test
    public void isFraud_waitingFalse() {
        Trader trader = new Trader("Pokemon", "London", "Германия");
        Transaction transaction = new Transaction(trader, 1050);
        FraudRule3 fraudRule3 = new FraudRule3("Ban city Сидней");

        boolean result = fraudRule3.isFraud(transaction);

        assertFalse(result);
    }
}