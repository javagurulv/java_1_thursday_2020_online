package student_aleksey_kodin.lesson9.level5.task_29;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FraudDetectorTest {

    @Test
    public void isFraud_waitingTrue() {
        List<FraudRule> fraudRules = new ArrayList<>();

        Trader trader = new Trader("Pokemon", "Сидней", "Германия");
        Transaction transaction = new Transaction(trader, 1050);

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

        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        boolean result = fraudDetector.isFraud(transaction);

        assertTrue(result);
    }

    @Test
    public void isFraud_waitingFalse() {
        List<FraudRule> fraudRules = new ArrayList<>();

        Trader trader = new Trader("AnyName", "AnyCity", "AnyCountry");
        Transaction transaction = new Transaction(trader, 1050);

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

        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        boolean result = fraudDetector.isFraud(transaction);

        assertFalse(result);
    }
}