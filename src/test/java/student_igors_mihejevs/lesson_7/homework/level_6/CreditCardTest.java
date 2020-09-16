package student_igors_mihejevs.lesson_7.homework.level_6;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class CreditCardTest {

    @Test
    public void pinCodeIsEnteredCorrectly() {
        CreditCard creditCard = new CreditCard("0001-0002-0003-0004", 1234);
        assertTrue(creditCard.isPinCodeCorrect(1234));
    }

    @Test
    public void pinCodeIsNotEnteredCorrectly() {
        CreditCard creditCard = new CreditCard("0001-0002-0003-0004", 1234);
        assertFalse(creditCard.isPinCodeCorrect(2222));
    }

    @Test
    public void isLoadDebtZERO() {
        CreditCard creditCard = new CreditCard("0001-0002-0003-0004", 1234);
        assertTrue(creditCard.isLoanDebtZero(BigDecimal.valueOf(0.0)));
    }

    @Test
    public void balanceIsAddedCorrectly_LoanDebtIsZero() {
        CreditCard creditCard = new CreditCard("0001-0002-0003-0004", 1234);
        creditCard.deposit(1234, BigDecimal.valueOf(100.00));
        assertEquals(0, creditCard.getBalance().compareTo(BigDecimal.valueOf(100.0)));
    }

    @Test
    public void balanceIsAddedCorrectly_LoanDebtLessZeroAndMoreThanAddedAmount() {
        CreditCard creditCard = new CreditCard("0001-0002-0003-0004", 1234);
        creditCard.setLoanDebt(BigDecimal.valueOf(-150.0));
        creditCard.deposit(1234, BigDecimal.valueOf(100.00));
        assertEquals(0, creditCard.getBalance().compareTo(BigDecimal.valueOf(0.0)));
        assertEquals(0, creditCard.getLoanDebt().compareTo(BigDecimal.valueOf(-50.0)));
    }

    @Test
    public void balanceIsAddedCorrectly_LoanDebtLessZeroAndLessThanAddedAmount() {
        CreditCard creditCard = new CreditCard("0001-0002-0003-0004", 1234);
        creditCard.setLoanDebt(BigDecimal.valueOf(-50.0));
        creditCard.deposit(1234, BigDecimal.valueOf(100.00));
        assertEquals(0, creditCard.getBalance().compareTo(BigDecimal.valueOf(50.0)));
        assertEquals(0, creditCard.getLoanDebt().compareTo(BigDecimal.valueOf(0.0)));
    }

    @Test
    public void balanceIsSubtractedCorrectly_BalanceHasMoreMoneyThanWithdraw() {
        CreditCard creditCard = new CreditCard("0001-0002-0003-0004", 1234);
        creditCard.setBalance(BigDecimal.valueOf(200.0));
        creditCard.setCreditLimit(BigDecimal.valueOf(500.0));
        creditCard.withdraw(1234, BigDecimal.valueOf(150.0));
        assertEquals(0, creditCard.getBalance().compareTo(BigDecimal.valueOf(50.0)));
    }

    @Test
    public void balanceAndCreditLimitAreSubtractedCorrectly_BalanceHasLessMoneyThanWithdrawButCreditHasMoney() {
        CreditCard creditCard = new CreditCard("0001-0002-0003-0004", 1234);
        creditCard.setBalance(BigDecimal.valueOf(200.0));
        creditCard.setCreditLimit(BigDecimal.valueOf(500.0));
        creditCard.withdraw(1234, BigDecimal.valueOf(300.0));
        assertEquals(0, creditCard.getBalance().compareTo(BigDecimal.valueOf(0.0)));
        assertEquals(0, creditCard.getCreditLimit().compareTo(BigDecimal.valueOf(400.0)));
    }

}