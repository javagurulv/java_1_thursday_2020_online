package student_aleksey_kodin.lessonx.bank_account.part_1_basic.task_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class TransactionTest {

    @Test
    public void isDeposit_1_waiting_True() {
        Transaction transaction = new Transaction("User", 1000, TransactionType.DEPOSIT);
        boolean result = transaction.isDeposit();

        assertTrue(result);
    }

    @Test
    public void isDeposit_2_waiting_False() {
        Transaction transaction = new Transaction("User", 1000, TransactionType.WITHDRAWAL);
        boolean result = transaction.isDeposit();

        assertFalse(result);
    }

    @Test
    public void isWithdrawal_1_waiting_True() {
        Transaction transaction = new Transaction("User", 1000, TransactionType.WITHDRAWAL);
        boolean result = transaction.isWithdrawal();

        assertTrue(result);
    }

    @Test
    public void isWithdrawal_2_waiting_False() {
        Transaction transaction = new Transaction("User", 1000, TransactionType.DEPOSIT);
        boolean result = transaction.isWithdrawal();

        assertFalse(result);
    }

}