package student_dmitrijs_visuns.homeworks.lesson_15.level_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudDetectorTest {

    @Test
    public void shouldReturnTrueForNamePokemon () {
        FraudDetector testDetector = new FraudDetector();
        Trader trader = new Trader("Pokemon", "Rio", "Brazil");
        boolean result = testDetector.isFraud(trader);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueForCitySidney () {
        FraudDetector testDetector = new FraudDetector();
        Trader trader = new Trader("Joe", "Sidney", "Australia");
        boolean result = testDetector.isFraud(trader);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrue() {
        FraudDetector testDetector = new FraudDetector();
        Trader trader = new Trader("Pokemon", "Sidney", "Australia");
        boolean result = testDetector.isFraud(trader);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalse() {
        FraudDetector testDetector = new FraudDetector();
        Trader trader = new Trader("Gonzales", "Tijuana", "Mexico");
        boolean result = testDetector.isFraud(trader);
        assertFalse(result);
    }


}