package student_aleksey_kodin.lesson9.level5.task_25;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudRule2Test {

    @Test
    public void isFraud_waitingTrue() {
        Trader trader = new Trader("Pokemon", "Berlin", "Германия");
        Transaction transaction = new Transaction(trader, 1110000);
        FraudRule2 fraudRule2 = new FraudRule2("Amount more million");

        boolean result = fraudRule2.isFraud(transaction);

        assertTrue(result);
    }
    
    @Test
    public void isFraud_waitingFalse() {
        Trader trader = new Trader("Pokemon", "Berlin", "Германия");
        Transaction transaction = new Transaction(trader, 111000);
        FraudRule2 fraudRule2 = new FraudRule2("Amount more million");

        boolean result = fraudRule2.isFraud(transaction);

        assertFalse(result);
    }
}