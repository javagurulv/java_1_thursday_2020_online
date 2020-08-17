package student_diana_miranovica.lesson_9.homeworks.day_5.task_27;

import junit.framework.TestCase;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class FraudRule4Test {

    @Test
    public void returnTrueWhenCountryIsJamaica(){
        Trader trader = new Trader("Pokemon", "Sydney", "Jamaica");
        Transaction transaction = new Transaction(trader, 1200000);
        FraudRule4 fraudRule4 = new FraudRule4("Rule3");
        boolean expected = true;
        boolean actual = fraudRule4.isFraud(transaction);
        assertEquals(expected, actual);
    }
    @Test
    public void returnFalseWhenCountryIsAnother(){
        Trader trader = new Trader("Alex", "Riga", "USA");
        Transaction transaction = new Transaction(trader, 9000);
        FraudRule4 fraudRule4 = new FraudRule4("Rule3");
        boolean expected = false;
        boolean actual = fraudRule4.isFraud(transaction);
        assertEquals(expected, actual);
    }

}