package student_diana_miranovica.lesson_9.homeworks.day_5.task_29;

import junit.framework.TestCase;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class FraudDetectorTest  {

    private final FraudRules[] rules = initRules();

    @Test
    public void shouldReturnTrue(){
        Trader trader = new Trader("Pokemon", "Sydney", "Jamaica");
        Transaction transaction = new Transaction(trader, 1200000);
        FraudDetector fraudDetector = new FraudDetector(rules);
        boolean expected = true;
        boolean actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTrueWhenCityIsSydney(){
        Trader trader = new Trader("Pokemon", "Sydney", "Jamaica");
        Transaction transaction = new Transaction(trader, 1200000);
        FraudDetector fraudDetector = new FraudDetector(rules);
        boolean expected = true;
        boolean actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }
    @Test
    public void shouldReturnTrueWhenCountryIsJamaica(){
        Trader trader = new Trader("Pokemon", "Sydney", "Jamaica");
        Transaction transaction = new Transaction(trader, 1200000);
        FraudDetector fraudDetector = new FraudDetector(rules);
        boolean expected = true;
        boolean actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }
    @Test
    public void shouldReturnTrueWhenCountryIsGermanyAndAmountOverLimit(){
        Trader trader = new Trader("Lemon", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1200);
        FraudDetector fraudDetector = new FraudDetector(rules);
        boolean expected = true;
        boolean actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTrueWhenAmountOverLimit(){
        Trader trader = new Trader("Lemon", "Helsinki", "Finland");
        Transaction transaction = new Transaction(trader, 1265200);
        FraudDetector fraudDetector = new FraudDetector(rules);
        boolean expected = true;
        boolean actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }
    private FraudRules[] initRules() {
        return new FraudRules[]{
                new FraudRule1("Rule1"),
                new FraudRule2("Rule2"),
                new FraudRule3("Rule3"),
                new FraudRule4("Rule4"),
                new FraudRule5("Rule5")};
    }
}