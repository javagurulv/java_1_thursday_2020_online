package student_aleksey_kodin.lesson9.level5.task_28;

import org.junit.Test;

import static org.junit.Assert.*;


public class FraudRule5Test {

    @Test
    public void isFraud_waitingTrue() {
        Trader trader = new Trader("Pokemon", "Berlin", "Германия");
        Transaction transaction = new Transaction(trader, 1050);
        FraudRule5 fraudRule5 = new FraudRule5("Ban Germany && Amount more 1000");

        boolean result = fraudRule5.isFraud(transaction);

        assertTrue(result);
    }

    @Test
    public void isFraud_waitingFalseAmountLess1000CountryGermany() {
        Trader trader = new Trader("Pokemon", "Berlin", "Германия");
        Transaction transaction = new Transaction(trader, 500);
        FraudRule5 fraudRule5 = new FraudRule5("Ban Germany && Amount more 1000");

        boolean result = fraudRule5.isFraud(transaction);

        assertFalse(result);
    }

    @Test
    public void isFraud_waitingFalseAmountLess1000CountryNotGermany() {
        Trader trader = new Trader("Pokemon", "Berlin", "China");
        Transaction transaction = new Transaction(trader, 500);
        FraudRule5 fraudRule5 = new FraudRule5("Ban Germany && Amount more 1000");

        boolean result = fraudRule5.isFraud(transaction);

        assertFalse(result);
    }

    @Test
    public void isFraud_waitingFalseAmountMore1000CountryNotGermany() {
        Trader trader = new Trader("Pokemon", "Berlin", "China");
        Transaction transaction = new Transaction(trader, 1500);
        FraudRule5 fraudRule5 = new FraudRule5("Ban Germany && Amount more 1000");

        boolean result = fraudRule5.isFraud(transaction);

        assertFalse(result);
    }
}