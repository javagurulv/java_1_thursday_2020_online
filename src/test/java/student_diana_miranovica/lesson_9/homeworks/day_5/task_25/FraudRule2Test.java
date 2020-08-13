package student_diana_miranovica.lesson_9.homeworks.day_5.task_25;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FraudRule2Test  {

 @Test
 public void justReturnTrueWhenFraudCityIsSydney() {
  Trader trader = new Trader("Pokemon", "Sydney", "Germany");
  Transaction transaction = new Transaction(trader, 1000);
  FraudRule2 fraudRule2 = new FraudRule2("Rule2");
  boolean expected = true;
  boolean actual = fraudRule2.isFraud(transaction);
  assertEquals(expected, actual);
 }
 @Test
 public void justReturnFalseWhenIsAnotherCity() {
  Trader trader = new Trader("Louren", "Liverpool", "Luxembourg");
  Transaction transaction = new Transaction(trader, 540);
  FraudRule2 fraudRule2 = new FraudRule2("Rule2");
  boolean expected = false;
  boolean actual = fraudRule2.isFraud(transaction);
  assertEquals(expected, actual);
 }

}