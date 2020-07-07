package student_dmitrijs_visuns.homeworks.lesson_9.level_6;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FraudDetectorTest {

    @Test
    public void testForBrokenFraudRule1 () {
        Trader trader = new Trader("Pokemon", "B", "C");
        Transaction t = new Transaction (trader, 100);
        ArrayList<FraudRule> fraudRulesList = new ArrayList<>();
        FraudRule1 fraudRule1 = new FraudRule1("Trader Name Check");
        FraudRule2 fraudRule2 = new FraudRule2("Transaction Amount Check");
        FraudRule3 fraudRule3 = new FraudRule3("Trader City Check");
        FraudRule4 fraudRule4 = new FraudRule4("Trader Country Check");
        FraudRule5 fraudRule5 = new FraudRule5("Trader Country/Transaction Amount Check");
        fraudRulesList.add(fraudRule1);
        fraudRulesList.add(fraudRule2);
        fraudRulesList.add(fraudRule3);
        fraudRulesList.add(fraudRule4);
        fraudRulesList.add(fraudRule5);
        FraudDetector fraudDetector = new FraudDetector(fraudRulesList);
        assertTrue(fraudDetector.isFraud(t).getFraud());

    }

    @Test
    public void testForBrokenFraudRule2 () {
        Trader trader = new Trader("A", "B", "C");
        Transaction t = new Transaction (trader, 2000000);
        ArrayList<FraudRule> fraudRulesList = new ArrayList<>();
        FraudRule1 fraudRule1 = new FraudRule1("Trader Name Check");
        FraudRule2 fraudRule2 = new FraudRule2("Transaction Amount Check");
        FraudRule3 fraudRule3 = new FraudRule3("Trader City Check");
        FraudRule4 fraudRule4 = new FraudRule4("Trader Country Check");
        FraudRule5 fraudRule5 = new FraudRule5("Trader Country/Transaction Amount Check");
        fraudRulesList.add(fraudRule1);
        fraudRulesList.add(fraudRule2);
        fraudRulesList.add(fraudRule3);
        fraudRulesList.add(fraudRule4);
        fraudRulesList.add(fraudRule5);
        FraudDetector fraudDetector = new FraudDetector(fraudRulesList);
        assertTrue(fraudDetector.isFraud(t).getFraud());

    }

    @Test
    public void testForBrokenFraudRule3 () {
        Trader trader = new Trader("A", "Сидней", "C");
        Transaction t = new Transaction (trader, 100);
        ArrayList<FraudRule> fraudRulesList = new ArrayList<>();
        FraudRule1 fraudRule1 = new FraudRule1("Trader Name Check");
        FraudRule2 fraudRule2 = new FraudRule2("Transaction Amount Check");
        FraudRule3 fraudRule3 = new FraudRule3("Trader City Check");
        FraudRule4 fraudRule4 = new FraudRule4("Trader Country Check");
        FraudRule5 fraudRule5 = new FraudRule5("Trader Country/Transaction Amount Check");
        fraudRulesList.add(fraudRule1);
        fraudRulesList.add(fraudRule2);
        fraudRulesList.add(fraudRule3);
        fraudRulesList.add(fraudRule4);
        fraudRulesList.add(fraudRule5);
        FraudDetector fraudDetector = new FraudDetector(fraudRulesList);
        assertTrue(fraudDetector.isFraud(t).getFraud());

    }

    @Test
    public void testForBrokenFraudRule4 () {
        Trader trader = new Trader("A", "B", "Ямайка");
        Transaction t = new Transaction(trader, 100);
        ArrayList<FraudRule> fraudRulesList = new ArrayList<>();
        FraudRule1 fraudRule1 = new FraudRule1("Trader Name Check");
        FraudRule2 fraudRule2 = new FraudRule2("Transaction Amount Check");
        FraudRule3 fraudRule3 = new FraudRule3("Trader City Check");
        FraudRule4 fraudRule4 = new FraudRule4("Trader Country Check");
        FraudRule5 fraudRule5 = new FraudRule5("Trader Country/Transaction Amount Check");
        fraudRulesList.add(fraudRule1);
        fraudRulesList.add(fraudRule2);
        fraudRulesList.add(fraudRule3);
        fraudRulesList.add(fraudRule4);
        fraudRulesList.add(fraudRule5);
        FraudDetector fraudDetector = new FraudDetector(fraudRulesList);
        assertTrue(fraudDetector.isFraud(t).getFraud());
    }

        @Test
        public void testForBrokenFraudRule5 () {
            Trader trader = new Trader("A", "B", "Германия");
            Transaction t = new Transaction (trader, 1500);
            ArrayList<FraudRule> fraudRulesList = new ArrayList<>();
            FraudRule1 fraudRule1 = new FraudRule1("Trader Name Check");
            FraudRule2 fraudRule2 = new FraudRule2("Transaction Amount Check");
            FraudRule3 fraudRule3 = new FraudRule3("Trader City Check");
            FraudRule4 fraudRule4 = new FraudRule4("Trader Country Check");
            FraudRule5 fraudRule5 = new FraudRule5("Trader Country/Transaction Amount Check");
            fraudRulesList.add(fraudRule1);
            fraudRulesList.add(fraudRule2);
            fraudRulesList.add(fraudRule3);
            fraudRulesList.add(fraudRule4);
            fraudRulesList.add(fraudRule5);
            FraudDetector fraudDetector = new FraudDetector(fraudRulesList);
            assertTrue(fraudDetector.isFraud(t).getFraud());

    }


    @Test
    public void testForNoBrokenFraudRules () {
        Trader trader = new Trader("A", "B", "C");
        Transaction t = new Transaction (trader, 100);
        ArrayList<FraudRule> fraudRulesList = new ArrayList<>();
        FraudRule1 fraudRule1 = new FraudRule1("Trader Name Check");
        FraudRule2 fraudRule2 = new FraudRule2("Transaction Amount Check");
        FraudRule3 fraudRule3 = new FraudRule3("Trader City Check");
        FraudRule4 fraudRule4 = new FraudRule4("Trader Country Check");
        FraudRule5 fraudRule5 = new FraudRule5("Trader Country/Transaction Amount Check");
        fraudRulesList.add(fraudRule1);
        fraudRulesList.add(fraudRule2);
        fraudRulesList.add(fraudRule3);
        fraudRulesList.add(fraudRule4);
        fraudRulesList.add(fraudRule5);
        FraudDetector fraudDetector = new FraudDetector(fraudRulesList);
        assertFalse(fraudDetector.isFraud(t).getFraud());

    }

}