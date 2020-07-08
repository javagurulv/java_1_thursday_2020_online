package student_dmitrijs_visuns.homeworks.lesson_9.level_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudRule2Test {

    @Test
    public void testForTransferAmount1 () {
        Trader trader = new Trader("A", "B", "C");
        Transaction t = new Transaction (trader, 2000000);
        FraudRule2 fraudRule2 = new FraudRule2("moneyAmountCheck");
        boolean isFraudResult = fraudRule2.isFraud(t);
        assertTrue(isFraudResult);
    }

    @Test
    public void testForTransferAmount2 () {
        Trader trader = new Trader("A", "B", "C");
        Transaction t = new Transaction (trader, 100);
        FraudRule2 fraudRule2 = new FraudRule2("moneyAmountCheck");
        boolean isFraudResult = fraudRule2.isFraud(t);
        assertFalse(isFraudResult);
    }


}