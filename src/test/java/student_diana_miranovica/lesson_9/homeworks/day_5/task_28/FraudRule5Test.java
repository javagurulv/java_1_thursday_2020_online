package student_diana_miranovica.lesson_9.homeworks.day_5.task_28;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FraudRule5Test  {

    @Test
    public void returnTrueWhenAmountIsOverLimitAndCountryIsGermany(){
        Trader trader = new Trader("Pokemon", "Sydney", "Germany");
        Transaction transaction = new Transaction(trader,1200);
        FraudRule5 fraudRule5 = new FraudRule5("rule5");
        boolean expected = true;
        boolean actual = fraudRule5.isFraud(transaction);
        assertEquals(expected, actual);

    }
    @Test
    public void returnFalseWhenAmountIsLessLimitAndCountryIsAnother(){
        Trader trader = new Trader("Pokemon", "Ween", "Austria");
        Transaction transaction = new Transaction(trader,990);
        FraudRule5 fraudRule5 = new FraudRule5("rule5");
        boolean expected = false;
        boolean actual = fraudRule5.isFraud(transaction);
        assertEquals(expected, actual);

    }
}