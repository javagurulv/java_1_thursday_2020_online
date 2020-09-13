package student_alexander_bogachenkov.lesson_x.bank_account.part_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class TransactionFactoryTest {

    @Test
    public void shouldCreateDepositTransaction() {
        Transaction expected = new Transaction(100);
        assertEquals(expected, TransactionFactory.createDepositTransaction(100));
    }

    @Test
    public void shouldCreateWithdrawalTransaction() {
        Transaction expected = new Transaction(100, ExpenseCategory.ENTERTAINMENT);
        assertEquals(expected, TransactionFactory.createWithdrawalTransaction(100, ExpenseCategory.ENTERTAINMENT));
    }
}