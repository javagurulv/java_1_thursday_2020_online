package student_alexander_bogachenkov.lesson_x.bank_account.part_1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransactionTest {

    Transaction depositTransaction;
    Transaction withdrawalTransaction;

    @Before
    public void init() {
        depositTransaction = new Transaction(100, TransactionType.DEPOSIT);
        withdrawalTransaction = new Transaction(150, TransactionType.WITHDRAWAL);
    }

    @Test
    public void shouldReturnTrue_whenIsDeposit() {
        boolean actual = depositTransaction.isDeposit();
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalse_whenIsNotDeposit() {
        boolean actual = withdrawalTransaction.isDeposit();
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTrue_whenIsWithdrawal() {
        boolean actual = withdrawalTransaction.isWithdrawal();
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalse_whenIsNotWithdrawal() {
        boolean actual = depositTransaction.isWithdrawal();
        boolean expected = false;
        assertEquals(expected, actual);
    }

}