package student_diana_miranovica.lesson_9.homeworks.day_5.task_26;

import junit.framework.TestCase;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class FraudRule3Test  {

    @Test
    public void returnTrueWhenAmountIsOverLimit(){
        Trader trader = new Trader("Pokemon", "Sydney", "Germany");
        Transaction transaction = new Transaction(trader, 1200000);
        FraudRule3 fraudRule3 = new FraudRule3("Rule3");
        boolean expected = true;
        boolean actual = fraudRule3.isFraud(transaction);
        assertEquals(expected, actual);
    }
    @Test
    public void returnFalseWhenAmountEqualsLimit(){
        Trader trader = new Trader("Pokemon", "Sydney", "Germany");
        Transaction transaction = new Transaction(trader, 1000000);
        FraudRule3 fraudRule3 = new FraudRule3("Rule3");
        boolean expected = false;
        boolean actual = fraudRule3.isFraud(transaction);
        assertEquals(expected, actual);
    }
    @Test
    public void returnFalseWhenAmountIsLessLimit(){
        Trader trader = new Trader("Pokemon", "Sydney", "Germany");
        Transaction transaction = new Transaction(trader, 12000);
        FraudRule3 fraudRule3 = new FraudRule3("Rule3");
        boolean expected = false;
        boolean actual = fraudRule3.isFraud(transaction);
        assertEquals(expected, actual);
    }

}