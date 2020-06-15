package student_vadims_vladisevs.lesson7.day_6.Task_11;

import org.junit.Test;

import java.beans.PropertyEditorSupport;
import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.*;

public class CreditCardTest {
    CreditCard testCard = new CreditCard(1, 1234);

    @Test
    public void withdrawV1() {
        // Balance = 0;
        // Debt = 0 + amount;
        // Limit = 100;
        testCard.setCreditLimit(new BigDecimal("100.00"));
        BigDecimal amount = new BigDecimal("50.00");
        testCard.withdraw(1234, amount);
        BigDecimal resultBalance = testCard.getCreditCardDepositBalance();
        BigDecimal resultDebt = testCard.getCreditDebt();
        assertEquals(BigDecimal.ZERO, resultBalance);
        assertEquals(amount, resultDebt);
    }

    @Test
    public void withdrawV2() {
        // Balance = 100 - amount;
        // Debt = 0;
        // Limit = 100;
        testCard.setCreditLimit(new BigDecimal("100.00"));
        testCard.setCreditCardDepositBalance(new BigDecimal("100.00"));
        BigDecimal amount = new BigDecimal("50.00");
        testCard.withdraw(1234, amount);
        BigDecimal resultBalance = testCard.getCreditCardDepositBalance();
        BigDecimal resultDebt = testCard.getCreditDebt();
        assertEquals(new BigDecimal("50.00"), resultBalance);
        assertEquals(BigDecimal.ZERO, resultDebt);
    }

    @Test
    public void withdrawV3() {
        // Balance = 100 - amount;
        // Debt = 0 + (Balance - amount);
        // Limit = 100;
        testCard.setCreditLimit(new BigDecimal("100.00"));
        testCard.setCreditCardDepositBalance(new BigDecimal("100.00"));
        BigDecimal amount = new BigDecimal("150.00");
        testCard.withdraw(1234, amount);
        BigDecimal resultBalance = testCard.getCreditCardDepositBalance();
        BigDecimal resultDebt = testCard.getCreditDebt();
        assertEquals(BigDecimal.ZERO, resultBalance);
        assertEquals(new BigDecimal("50.00"), resultDebt);
    }

    @Test
    public void depositV1() {
        // Balance = 0 + amount
        // Debt = 0
        BigDecimal amount = new BigDecimal("100.00");
        testCard.deposit(1234,amount);
        BigDecimal resultBalance = testCard.getCreditCardDepositBalance();
        assertEquals(amount, resultBalance);
        BigDecimal resultDebt = testCard.getCreditDebt();
        assertEquals(BigDecimal.ZERO, resultDebt);
    }

    @Test
    public void depositV2() {
        // Balance = 0  + (debt - amount);
        // Debt = debt - amount;
        BigDecimal amount = new BigDecimal("100.00");
        testCard.setCreditDebt(new BigDecimal("50.00"));
        testCard.deposit(1234,amount);
        BigDecimal resultBalance = testCard.getCreditCardDepositBalance();
        assertEquals(new BigDecimal("50.00"), resultBalance);
        BigDecimal resultDebt = testCard.getCreditDebt();
        assertEquals(BigDecimal.ZERO, resultDebt);
    }

    @Test
    public void depositV3() {
        // Balance  = 0;
        // Debt = 100 - 100;
        BigDecimal amount = new BigDecimal("100.00");
        testCard.setCreditDebt(new BigDecimal("100.00"));
        testCard.deposit(1234,amount);
        BigDecimal resultBalance = testCard.getCreditCardDepositBalance();
        assertEquals(BigDecimal.ZERO, resultBalance);
        BigDecimal resultDebt = testCard.getCreditDebt();
        assertEquals(new BigDecimal("0.00"), resultDebt);
    }

    @Test
    public void checkLimitV1() {
        // Balance - amount < 0;
        // Debt + amount < Limit;
        testCard.setCreditLimit(new BigDecimal("100.00"));
        boolean result = testCard.checkLimit(new BigDecimal("50.00"));
        assertTrue(result);
    }

    @Test
    public void checkLimitV2() {
        // Balance - amount < 0;
        // Debt + amount = Limit;
        testCard.setCreditLimit(new BigDecimal("100.00"));
        boolean result = testCard.checkLimit(new BigDecimal("100.00"));
        assertTrue(result);
    }

    @Test
    public void checkLimitV3() {
        // Balance - amount < 0;
        // Debt + amount > Limit;
        testCard.setCreditLimit(new BigDecimal("100.00"));
        boolean result = testCard.checkLimit(new BigDecimal("200.00"));
        assertFalse(result);
    }

    @Test
    public void checkBalanceV1() {
        // Balance = Balance - amount > 0;
        testCard.setCreditCardDepositBalance(new BigDecimal("100.00"));
        boolean result = testCard.checkBalance(new BigDecimal("50.00"));
        assertTrue(result);
    }

    @Test
    public void checkBalanceV2() {
        // Balance = Balance - amount = 0;
        testCard.setCreditCardDepositBalance(new BigDecimal("100.00"));
        boolean result = testCard.checkBalance(new BigDecimal("100.00"));
        assertTrue(result);
    }


    @Test
    public void checkBalanceV3() {
        // Balance = Balance - amount < 0;
        testCard.setCreditCardDepositBalance(new BigDecimal("100.00"));
        boolean result = testCard.checkBalance(new BigDecimal("150.00"));
        assertFalse(result);
    }

    @Test
    public void checkDebtV1() {
        // Debt = Debt - amount > 0;
        testCard.setCreditDebt(new BigDecimal("100.00"));
        boolean result = testCard.checkDebt(new BigDecimal("50.00"));
        assertTrue(result);
    }

    @Test
    public void checkDebtV2() {
        // Debt = Debt - amount = 0;
        testCard.setCreditDebt(new BigDecimal("100.00"));
        boolean result = testCard.checkDebt(new BigDecimal("100.00"));
        assertTrue(result);
    }

    @Test
    public void checkDebtV3() {
        // Debt = Debt - amount < 0;
        testCard.setCreditDebt(new BigDecimal("100.00"));
        boolean result = testCard.checkDebt(new BigDecimal("150.00"));
        assertFalse(result);
    }

    @Test
    public void isCorrectPinCodeV1() {
        //Correct PIN Code;
        boolean actual = testCard.isCorrectPinCode(1234);
        assertTrue(actual);
    }

    @Test
    public void isCorrectPinCodeV2() {
        //Incorrect PIN Code;
        boolean actual = testCard.isCorrectPinCode(5678);
        assertFalse(actual);
    }
}