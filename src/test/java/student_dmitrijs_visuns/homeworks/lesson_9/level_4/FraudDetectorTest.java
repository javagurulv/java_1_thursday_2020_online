package student_dmitrijs_visuns.homeworks.lesson_9.level_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudDetectorTest {

    @Test
    public void testForName1() {
        Trader trader = new Trader("Pokemon", "B", "C");
        Transaction t = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        assertTrue(fraudDetector.isFraud(t));
    }

    @Test
    public void testForName2() {
        Trader trader = new Trader("Pikachu", "B", "C");
        Transaction t = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        assertFalse(fraudDetector.isFraud(t));
    }

    @Test
    public void testForTransferAmount1() {
        Trader trader = new Trader("A", "B", "C");
        Transaction t = new Transaction(trader, 2000000);
        FraudDetector fraudDetector = new FraudDetector();
        assertTrue(fraudDetector.isFraud(t));
    }

    @Test
    public void testForTransferAmount2() {
        Trader trader = new Trader("A", "B", "C");
        Transaction t = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        assertFalse(fraudDetector.isFraud(t));
    }

    @Test
    public void testForTraderCity1 () {
        Trader trader = new Trader("A", "Сидней", "C");
        Transaction t = new Transaction (trader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        assertTrue(fraudDetector.isFraud(t));
    }

    @Test
    public void testForTraderCity2 () {
        Trader trader = new Trader("A", "НеСидней", "C");
        Transaction t = new Transaction (trader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        assertFalse(fraudDetector.isFraud(t));
    }

    @Test
    public void testForTraderCountry1 () {
        Trader trader = new Trader("A", "B", "Ямайка");
        Transaction t = new Transaction (trader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        assertTrue(fraudDetector.isFraud(t));
    }


    @Test
    public void testForTraderCountry2 () {
        Trader trader = new Trader("A", "B", "Аляска");
        Transaction t = new Transaction (trader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        assertFalse(fraudDetector.isFraud(t));
    }





}