package student_aleksey_kodin.lesson9.level6.task_32;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FraudDetectorTest {
    List<FraudRule> fraudRules = new ArrayList<>();
    List<FraudDetectionResult> fraudDetectionResults;
    FraudDetector fraudDetector = new FraudDetector(fraudRules);

    @Before
    public void startUp() {
        FraudRule1 fraudRule1 = new FraudRule1("Ban Name");
        FraudRule2 fraudRule2 = new FraudRule2("Ban amount more 1000000");
        FraudRule3 fraudRule3 = new FraudRule3("Ban Сидней");
        FraudRule4 fraudRule4 = new FraudRule4("Ban Ямайка");
        FraudRule5 fraudRule5 = new FraudRule5("Ban Германия & amount more 1000");

        fraudRules.add(fraudRule1);
        fraudRules.add(fraudRule2);
        fraudRules.add(fraudRule3);
        fraudRules.add(fraudRule4);
        fraudRules.add(fraudRule5);
    }

    @Test
    public void isFraud_test1() {
        Trader trader = new Trader("Pokemon", "AnyCity", "AnyCity");
        Transaction transaction = new Transaction(trader, 1050);

        fraudDetectionResults = fraudDetector.isFraud(transaction);

        String result = fraudDetectionResults.get(0).getRuleName();

        assertEquals("Ban Name", result);
    }

    @Test
    public void isFraud_test2() {
        Trader trader = new Trader("AnyName", "AnyCity", "AnyCity");
        Transaction transaction = new Transaction(trader, 1110000);

        fraudDetectionResults = fraudDetector.isFraud(transaction);

        String result = fraudDetectionResults.get(0).getRuleName();

        assertEquals("Ban amount more 1000000", result);
    }

    @Test
    public void isFraud_test3() {
        Trader trader = new Trader("AnyName", "Сидней", "AnyCity");
        Transaction transaction = new Transaction(trader, 100);

        fraudDetectionResults = fraudDetector.isFraud(transaction);

        String result = fraudDetectionResults.get(0).getRuleName();

        assertEquals("Ban Сидней", result);
    }

    @Test
    public void isFraud_test4() {
        Trader trader = new Trader("AnyName", "AnyCity", "Ямайка");
        Transaction transaction = new Transaction(trader, 100);

        fraudDetectionResults = fraudDetector.isFraud(transaction);

        String result = fraudDetectionResults.get(0).getRuleName();

        assertEquals("Ban Ямайка", result);
    }

    @Test
    public void isFraud_test5() {
        Trader trader = new Trader("AnyName", "AnyCity", "Германия");
        Transaction transaction = new Transaction(trader, 1500);

        fraudDetectionResults = fraudDetector.isFraud(transaction);

        String result = fraudDetectionResults.get(0).getRuleName();

        assertEquals("Ban Германия & amount more 1000", result);
    }

    @Test
    public void isFraud_test6() {
        Trader trader = new Trader("AnyName", "AnyCity", "AnyCountry");
        Transaction transaction = new Transaction(trader, 100);

        fraudDetectionResults = fraudDetector.isFraud(transaction);

        int result = fraudDetectionResults.size();

        assertEquals(0, result);
    }
}