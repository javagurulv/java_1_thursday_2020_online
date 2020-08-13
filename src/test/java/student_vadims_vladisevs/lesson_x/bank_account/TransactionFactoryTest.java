package student_vadims_vladisevs.lesson_x.bank_account;

import org.junit.Test;

import static org.junit.Assert.*;

public class TransactionFactoryTest {

    @Test
    public void createDepositTransaction() {
        Transaction deposit = TransactionFactory.createDepositTransaction(10);
        assertEquals(deposit.getAmount(), 10);
        assertNull(deposit.getExpenseCategory());
    }

    @Test
    public void createWithdrawalTransaction() {
        Transaction withdrawal = TransactionFactory.createWithdrawalTransaction(10, ExpenseCategory.FOOD);
        assertEquals(10, withdrawal.getAmount());
        assertEquals(ExpenseCategory.FOOD, withdrawal.getExpenseCategory());
    }
}