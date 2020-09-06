package student_alexander_bogachenkov.lesson15_11082020.homeworks.level_2.task_9;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudDetectorTest {

    @Test
    public void shouldReturnTrue_whenIsFraudByName() {
        FraudDetector detector = new FraudDetector();
        Trader trader = new Trader("Pokemon", "Riga");
        assertTrue(detector.isFraud(trader));
    }

    @Test
    public void shouldReturnFalse_whenIsNotFraudByName() {
        FraudDetector detector = new FraudDetector();
        Trader trader = new Trader("Alex", "Riga");
        assertFalse(detector.isFraud(trader));
    }

    @Test
    public void shouldReturnTrue_whenIsFraudByCity() {
        FraudDetector detector = new FraudDetector();
        Trader trader = new Trader("Alex", "Sidney");
        assertTrue(detector.isFraud(trader));
    }

    @Test
    public void shouldReturnFalse_whenIsNotFraudByCity() {
        FraudDetector detector = new FraudDetector();
        Trader trader = new Trader("Alex", "Moscow");
        assertFalse(detector.isFraud(trader));
    }
}