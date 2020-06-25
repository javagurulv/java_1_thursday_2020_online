package student_aleksey_kodin.lesson9.level5.task_27;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudRule4Test {

    @Test
    public void isFraud_waitingTrue() {
        Trader trader = new Trader("Pokemon", "Berlin", "Ямайка");
        Transaction transaction = new Transaction(trader, 1050);
        FraudRule4 fraudRule4 = new FraudRule4("Ban country");

        boolean result = fraudRule4.isFraud(transaction);

        assertTrue(result);
    }

    @Test
    public void isFraud_waitingFalse() {
        Trader trader = new Trader("Pokemon", "Berlin", "China");
        Transaction transaction = new Transaction(trader, 1050);
        FraudRule4 fraudRule4 = new FraudRule4("Ban country");

        boolean result = fraudRule4.isFraud(transaction);

        assertFalse(result);
    }
}