package student_vadims_vladisevs.lesson9.day_6;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FraudDetectorTest {

    @Test
    public void isFraudV1() {
        Trader trader = new Trader("Vadim","Latvia", "Riga");
        Transaction transaction = new Transaction(trader, 1000);
        ArrayList<FraudRule> fraudRules = new ArrayList<>();
        FraudRule1 fraudRule1 = new FraudRule1("Check Name");
        FraudRule2 fraudRule2 = new FraudRule2("Check Transaction Amount");
        FraudRule3 fraudRule3 = new FraudRule3("Check City");
        FraudRule4 fraudRule4 = new FraudRule4("Check Country");
        FraudRule5 fraudRule5 = new FraudRule5("Check Country And Amount");
        fraudRules.add(fraudRule1);
        fraudRules.add(fraudRule2);
        fraudRules.add(fraudRule3);
        fraudRules.add(fraudRule4);
        fraudRules.add(fraudRule5);

        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);

        boolean actualFraud = fraudDetectionResult.isFraud();
        String actualRuleName = fraudDetectionResult.getRuleName();
        assertFalse(actualFraud);
        assertNull(actualRuleName);
    }

    @Test
    public void isFraudV2() {
        Trader trader = new Trader("Pokemon","Latvia", "Riga");
        Transaction transaction = new Transaction(trader, 1000);
        ArrayList<FraudRule> fraudRules = new ArrayList<>();
        FraudRule1 fraudRule1 = new FraudRule1("Check Name");
        FraudRule2 fraudRule2 = new FraudRule2("Check Transaction Amount");
        FraudRule3 fraudRule3 = new FraudRule3("Check City");
        FraudRule4 fraudRule4 = new FraudRule4("Check Country");
        FraudRule5 fraudRule5 = new FraudRule5("Check Country And Amount");
        fraudRules.add(fraudRule1);
        fraudRules.add(fraudRule2);
        fraudRules.add(fraudRule3);
        fraudRules.add(fraudRule4);
        fraudRules.add(fraudRule5);

        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);

        boolean actualFraud = fraudDetectionResult.isFraud();
        String actualRuleName = fraudDetectionResult.getRuleName();
        assertTrue(actualFraud);
        assertEquals("Check Name", actualRuleName);
    }

    @Test
    public void isFraudV3() {
        Trader trader = new Trader("Vadim","Latvia", "Riga");
        Transaction transaction = new Transaction(trader, 1000);
        ArrayList<FraudRule> fraudRules = new ArrayList<>();
        FraudRule1 fraudRule1 = new FraudRule1("Check Name");
        FraudRule2 fraudRule2 = new FraudRule2("Check Transaction Amount");
        FraudRule3 fraudRule3 = new FraudRule3("Check City");
        FraudRule4 fraudRule4 = new FraudRule4("Check Country");
        FraudRule5 fraudRule5 = new FraudRule5("Check Country And Amount");
        fraudRules.add(fraudRule1);
        fraudRules.add(fraudRule2);
        fraudRules.add(fraudRule3);
        fraudRules.add(fraudRule4);
        fraudRules.add(fraudRule5);

        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);

        boolean actualFraud = fraudDetectionResult.isFraud();
        String actualRuleName = fraudDetectionResult.getRuleName();
        assertFalse(actualFraud);
        assertNull(actualRuleName);
    }

    @Test
    public void isFraudV4() {
        Trader trader = new Trader("Vadim","Latvia", "Riga");
        Transaction transaction = new Transaction(trader, 2000000);
        ArrayList<FraudRule> fraudRules = new ArrayList<>();
        FraudRule1 fraudRule1 = new FraudRule1("Check Name");
        FraudRule2 fraudRule2 = new FraudRule2("Check Transaction Amount");
        FraudRule3 fraudRule3 = new FraudRule3("Check City");
        FraudRule4 fraudRule4 = new FraudRule4("Check Country");
        FraudRule5 fraudRule5 = new FraudRule5("Check Country And Amount");
        fraudRules.add(fraudRule1);
        fraudRules.add(fraudRule2);
        fraudRules.add(fraudRule3);
        fraudRules.add(fraudRule4);
        fraudRules.add(fraudRule5);

        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);

        boolean actualFraud = fraudDetectionResult.isFraud();
        String actualRuleName = fraudDetectionResult.getRuleName();
        assertTrue(actualFraud);
        assertEquals("Check Transaction Amount", actualRuleName);
    }

    @Test
    public void isFraudV5() {
        Trader trader = new Trader("Vadim","Latvia", "Riga");
        Transaction transaction = new Transaction(trader, 20000);
        ArrayList<FraudRule> fraudRules = new ArrayList<>();
        FraudRule1 fraudRule1 = new FraudRule1("Check Name");
        FraudRule2 fraudRule2 = new FraudRule2("Check Transaction Amount");
        FraudRule3 fraudRule3 = new FraudRule3("Check City");
        FraudRule4 fraudRule4 = new FraudRule4("Check Country");
        FraudRule5 fraudRule5 = new FraudRule5("Check Country And Amount");
        fraudRules.add(fraudRule1);
        fraudRules.add(fraudRule2);
        fraudRules.add(fraudRule3);
        fraudRules.add(fraudRule4);
        fraudRules.add(fraudRule5);

        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);

        boolean actualFraud = fraudDetectionResult.isFraud();
        String actualRuleName = fraudDetectionResult.getRuleName();
        assertFalse(actualFraud);
        assertNull(actualRuleName);
    }

    @Test
    public void isFraudV6() {
        Trader trader = new Trader("Vadim","Australia", "Sidney");
        Transaction transaction = new Transaction(trader, 2000);
        ArrayList<FraudRule> fraudRules = new ArrayList<>();
        FraudRule1 fraudRule1 = new FraudRule1("Check Name");
        FraudRule2 fraudRule2 = new FraudRule2("Check Transaction Amount");
        FraudRule3 fraudRule3 = new FraudRule3("Check City");
        FraudRule4 fraudRule4 = new FraudRule4("Check Country");
        FraudRule5 fraudRule5 = new FraudRule5("Check Country And Amount");
        fraudRules.add(fraudRule1);
        fraudRules.add(fraudRule2);
        fraudRules.add(fraudRule3);
        fraudRules.add(fraudRule4);
        fraudRules.add(fraudRule5);

        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);

        boolean actualFraud = fraudDetectionResult.isFraud();
        String actualRuleName = fraudDetectionResult.getRuleName();
        assertTrue(actualFraud);
        assertEquals("Check City", actualRuleName);
    }

    @Test
    public void isFraudV7() {
        Trader trader = new Trader("Vadim","Australia", "Canberra");
        Transaction transaction = new Transaction(trader, 2000);
        ArrayList<FraudRule> fraudRules = new ArrayList<>();
        FraudRule1 fraudRule1 = new FraudRule1("Check Name");
        FraudRule2 fraudRule2 = new FraudRule2("Check Transaction Amount");
        FraudRule3 fraudRule3 = new FraudRule3("Check City");
        FraudRule4 fraudRule4 = new FraudRule4("Check Country");
        FraudRule5 fraudRule5 = new FraudRule5("Check Country And Amount");
        fraudRules.add(fraudRule1);
        fraudRules.add(fraudRule2);
        fraudRules.add(fraudRule3);
        fraudRules.add(fraudRule4);
        fraudRules.add(fraudRule5);

        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);

        boolean actualFraud = fraudDetectionResult.isFraud();
        String actualRuleName = fraudDetectionResult.getRuleName();
        assertFalse(actualFraud);
        assertNull(actualRuleName);
    }

    @Test
    public void isFraudV8() {
        Trader trader = new Trader("Vadim","Jamaica", "Kingston");
        Transaction transaction = new Transaction(trader, 2000);
        ArrayList<FraudRule> fraudRules = new ArrayList<>();
        FraudRule1 fraudRule1 = new FraudRule1("Check Name");
        FraudRule2 fraudRule2 = new FraudRule2("Check Transaction Amount");
        FraudRule3 fraudRule3 = new FraudRule3("Check City");
        FraudRule4 fraudRule4 = new FraudRule4("Check Country");
        FraudRule5 fraudRule5 = new FraudRule5("Check Country And Amount");
        fraudRules.add(fraudRule1);
        fraudRules.add(fraudRule2);
        fraudRules.add(fraudRule3);
        fraudRules.add(fraudRule4);
        fraudRules.add(fraudRule5);

        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);

        boolean actualFraud = fraudDetectionResult.isFraud();
        String actualRuleName = fraudDetectionResult.getRuleName();
        assertTrue(actualFraud);
        assertEquals("Check Country", actualRuleName);
    }

    @Test
    public void isFraudV9() {
        Trader trader = new Trader("Vadim","Germany", "Dortmund");
        Transaction transaction = new Transaction(trader, 200);
        ArrayList<FraudRule> fraudRules = new ArrayList<>();
        FraudRule1 fraudRule1 = new FraudRule1("Check Name");
        FraudRule2 fraudRule2 = new FraudRule2("Check Transaction Amount");
        FraudRule3 fraudRule3 = new FraudRule3("Check City");
        FraudRule4 fraudRule4 = new FraudRule4("Check Country");
        FraudRule5 fraudRule5 = new FraudRule5("Check Country And Amount");
        fraudRules.add(fraudRule1);
        fraudRules.add(fraudRule2);
        fraudRules.add(fraudRule3);
        fraudRules.add(fraudRule4);
        fraudRules.add(fraudRule5);

        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);

        boolean actualFraud = fraudDetectionResult.isFraud();
        String actualRuleName = fraudDetectionResult.getRuleName();
        assertFalse(actualFraud);
        assertNull(actualRuleName);
    }

    @Test
    public void isFraudV10() {
        Trader trader = new Trader("Vadim","Germany", "Dortmund");
        Transaction transaction = new Transaction(trader, 2000);
        ArrayList<FraudRule> fraudRules = new ArrayList<>();
        FraudRule1 fraudRule1 = new FraudRule1("Check Name");
        FraudRule2 fraudRule2 = new FraudRule2("Check Transaction Amount");
        FraudRule3 fraudRule3 = new FraudRule3("Check City");
        FraudRule4 fraudRule4 = new FraudRule4("Check Country");
        FraudRule5 fraudRule5 = new FraudRule5("Check Country And Amount");
        fraudRules.add(fraudRule1);
        fraudRules.add(fraudRule2);
        fraudRules.add(fraudRule3);
        fraudRules.add(fraudRule4);
        fraudRules.add(fraudRule5);

        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);

        boolean actualFraud = fraudDetectionResult.isFraud();
        String actualRuleName = fraudDetectionResult.getRuleName();
        assertTrue(actualFraud);
        assertEquals("Check Country And Amount", actualRuleName);
    }
}