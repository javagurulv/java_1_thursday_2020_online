package student_diana_miranovica.lesson_9.homeworks.day_5.task_24;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FraudRule1Test  {

    @Test
    public void justReturnTrue() {
        Trader trader = new Trader("Pokemon", "Sydney", "Germany");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule1 fraudRule1 = new FraudRule1("Rule1");
        boolean expected = true;
        boolean actual = fraudRule1.isFraud(transaction);
        assertEquals(expected, actual);
    }
    @Test
    public void justReturnFalse() {
        Trader trader = new Trader("Louren", "Liverpool", "Luxembourg");
        Transaction transaction = new Transaction(trader, 540);
        FraudRule1 fraudRule1 = new FraudRule1("Rule1");
        boolean expected = false;
        boolean actual = fraudRule1.isFraud(transaction);
        assertEquals(expected, actual);
    }

}