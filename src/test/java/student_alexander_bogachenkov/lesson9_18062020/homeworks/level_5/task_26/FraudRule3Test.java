package student_alexander_bogachenkov.lesson9_18062020.homeworks.level_5.task_26;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudRule3Test {

    @Test
    public void shouldReturnTrue() {
        Trader trader = new Trader("Michael", "Australia", "Sydney");
        Transaction transaction = new Transaction(trader, 999);
        FraudRule3 fraudDetector = new FraudRule3("Rule3");
        boolean expected = true;
        boolean actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalse() {
        Trader trader = new Trader("Janis", "Latvia", "Riga");
        Transaction transaction = new Transaction(trader, 699);
        FraudRule3 fraudDetector = new FraudRule3("Rule3");
        boolean expected = false;
        boolean actual = fraudDetector.isFraud(transaction);
        assertEquals(expected, actual);
    }

}