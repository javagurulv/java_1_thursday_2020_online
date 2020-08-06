package student_vadims_vladisevs.lesson_x.bank_account;

import org.junit.Test;

import static org.junit.Assert.*;

public class TransactionTest {

    Transaction depositTransaction = TransactionFactory.createDepositTransaction(1000);
    Transaction withdrawalTransaction =  TransactionFactory.createWithdrawalTransaction(500, ExpenseCategory.FOOD);


    @Test
    public void isDeposit_true() {
        boolean actual = depositTransaction.isDeposit();
        assertTrue(actual);
    }

    @Test
    public void isDeposit_false() {
        boolean actual = depositTransaction.isWithdrawal();
        assertFalse(actual);
    }

    @Test
    public void isWithdrawal_true() {
        boolean actual = withdrawalTransaction.isWithdrawal();
        assertTrue(actual);
    }

    @Test
    public void isWithdrawal_false() {
        boolean actual = depositTransaction.isWithdrawal();
        assertFalse(actual);
    }
}