package student_dmitrijs_visuns.homeworks.lesson_9.level_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudRule1Test {

    @Test
    public void testForName1 () {
        Trader trader = new Trader("Pokemon", "B", "C");
        Transaction t = new Transaction (trader, 100);
        FraudRule1 fraudRule1 = new FraudRule1("traderNameCheck");
        boolean isFraudResult = fraudRule1.isFraud(t);
        assertTrue(isFraudResult);
    }

    @Test
    public void testForName2 () {
        Trader trader = new Trader("Pikachu", "B", "C");
        Transaction t = new Transaction (trader, 100);
        FraudRule1 fraudRule1 = new FraudRule1("traderNameCheck");
        boolean isFraudResult = fraudRule1.isFraud(t);
        assertFalse(isFraudResult);
    }

}