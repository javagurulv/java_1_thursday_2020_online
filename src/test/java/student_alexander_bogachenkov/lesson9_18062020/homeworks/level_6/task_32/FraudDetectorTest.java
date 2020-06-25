package student_alexander_bogachenkov.lesson9_18062020.homeworks.level_6.task_32;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudDetectorTest {

    private final FraudRule[] rules = initRules();

    @Test
    public void shouldReturnTrue() {
        Trader trader = new Trader("Pokemon", "Russia", "Moscow");
        Transaction transaction = new Transaction(trader, 700);
        FraudDetector fraudDetector = new FraudDetector(rules);
        FraudDetectionResult expected = new FraudDetectionResult(true, "Rule1");
        FraudDetectionResult actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalse() {
        Trader trader = new Trader("Vasya", "Russia", "Moscow");
        Transaction transaction = new Transaction(trader, 700);
        FraudDetector fraudDetector = new FraudDetector(rules);
        FraudDetectionResult expected = new FraudDetectionResult(false, null);
        FraudDetectionResult actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTrue_whenAmountIsOverLimit() {
        Trader trader = new Trader("Michael", "UK", "London");
        Transaction transaction = new Transaction(trader, 2000000);
        FraudDetector fraudDetector = new FraudDetector(rules);
        FraudDetectionResult expected = new FraudDetectionResult(true, "Rule2");
        FraudDetectionResult actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalse_whenAmountEqualsLimit() {
        Trader trader = new Trader("Michael", "UK", "London");
        Transaction transaction = new Transaction(trader, 1000000);
        FraudDetector fraudDetector = new FraudDetector(rules);
        FraudDetectionResult expected = new FraudDetectionResult(false, null);
        FraudDetectionResult actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalse_whenAmountIsUnderLimit() {
        Trader trader = new Trader("Michael", "UK", "London");
        Transaction transaction = new Transaction(trader, 500000);
        FraudDetector fraudDetector = new FraudDetector(rules);
        FraudDetectionResult expected = new FraudDetectionResult(false, null);
        FraudDetectionResult actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTrue_whenCityIsSydney() {
        Trader trader = new Trader("Michael", "Australia", "Sydney");
        Transaction transaction = new Transaction(trader, 999);
        FraudDetector fraudDetector = new FraudDetector(rules);
        FraudDetectionResult expected = new FraudDetectionResult(true, "Rule3");
        FraudDetectionResult actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalse_whenCityIsNotSydney() {
        Trader trader = new Trader("Janis", "Latvia", "Riga");
        Transaction transaction = new Transaction(trader, 699);
        FraudDetector fraudDetector = new FraudDetector(rules);
        FraudDetectionResult expected = new FraudDetectionResult(false, null);
        FraudDetectionResult actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTrue_whenCountryIsJamaica() {
        Trader trader = new Trader("John", "Jamaica", "Kingston");
        Transaction transaction = new Transaction(trader, 343);
        FraudDetector fraudDetector = new FraudDetector(rules);
        FraudDetectionResult expected = new FraudDetectionResult(true, "Rule4");
        FraudDetectionResult actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalse_whenCountryIsNotJamaica() {
        Trader trader = new Trader("John", "USA", "Washington");
        Transaction transaction = new Transaction(trader, 345);
        FraudDetector fraudDetector = new FraudDetector(rules);
        FraudDetectionResult expected = new FraudDetectionResult(false, null);
        FraudDetectionResult actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTrue_whenAmountOverLimit() {
        Trader trader = new Trader("Alex", "Germany", "Berlin");
        Transaction transaction = new Transaction(trader, 2000);
        FraudDetector fraudDetector = new FraudDetector(rules);
        FraudDetectionResult expected = new FraudDetectionResult(true, "Rule5");
        FraudDetectionResult actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalse_whenAmountEqualLimit() {
        Trader trader = new Trader("Alex", "Germany", "Berlin");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector(rules);
        FraudDetectionResult expected = new FraudDetectionResult(false, null);
        FraudDetectionResult actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalse_whenAmountUnderLimit() {
        Trader trader = new Trader("Alex", "Germany", "Berlin");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector(rules);
        FraudDetectionResult expected = new FraudDetectionResult(false, null);
        FraudDetectionResult actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }

    private FraudRule[] initRules() {
        return new FraudRule[]{
                new FraudRule1("Rule1"),
                new FraudRule2("Rule2"),
                new FraudRule3("Rule3"),
                new FraudRule4("Rule4"),
                new FraudRule5("Rule5")};
    }

}