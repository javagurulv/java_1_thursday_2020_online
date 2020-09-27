package student_vadims_vladisevs.lesson_15.level_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudDetectorTest {

    FraudDetector detector = new FraudDetector();
    Trader trader = new Trader("Vadim", "Riga");
    Trader traderPokemon = new Trader("Pokemon", "Riga");
    Trader traderFromSidney = new Trader("Vadim", "Sidney");
    Trader traderPokemonFromSidney = new Trader("Pokemon", "Sidney");


    @Test
    public void isFraud_v1() {
        boolean actual = detector.isFraud(trader);
        assertFalse(actual);
    }

    @Test
    public void isFraud_v2() {
        boolean actual = detector.isFraud(traderPokemon);
        assertTrue(actual);
    }

    @Test
    public void isFraud_v3() {
        boolean actual = detector.isFraud(traderFromSidney);
        assertTrue(actual);
    }

    @Test
    public void isFraud_v4() {
        boolean actual = detector.isFraud(traderPokemonFromSidney);
        assertTrue(actual);
    }
}