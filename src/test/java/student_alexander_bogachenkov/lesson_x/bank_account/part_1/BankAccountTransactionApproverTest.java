package student_alexander_bogachenkov.lesson_x.bank_account.part_1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTransactionApproverTest {

    BankAccountTransactionApprover approver;
    Transaction deposit150;
    Transaction withdrawal220;
    Transaction deposit220;
    Transaction withdrawal150;

    @Before
    public void init() {
        approver = new BankAccountTransactionApprover(new BankAccountCurrentBalanceCalculator());
        deposit150 = new Transaction(150, TransactionType.DEPOSIT);
        withdrawal220 = new Transaction(220, TransactionType.WITHDRAWAL);
        deposit220 = new Transaction(220, TransactionType.DEPOSIT);
        withdrawal150 = new Transaction(150, TransactionType.WITHDRAWAL);
    }

    @Test
    public void shouldApprove_whenTransactionIsDeposit() {
        BankAccountTransactionApprover approver = new BankAccountTransactionApprover(new BankAccountCurrentBalanceCalculator());
        Transaction[] transactions = {};
        boolean actual = approver.approve(new BankAccount("John", transactions, 0), deposit150);
        assertTrue(actual);
    }

    @Test
    public void shouldApprove_whenTransactionIsWithdrawal_andBalanceIsOverRequired() {
        BankAccountTransactionApprover approver = new BankAccountTransactionApprover(new BankAccountCurrentBalanceCalculator());
        Transaction[] transactions = {deposit220};
        boolean actual = approver.approve(new BankAccount("John", transactions, 0), withdrawal150);
        assertTrue(actual);
    }

    @Test
    public void shouldApprove_whenTransactionIsWithdrawal_andBalanceEqualsRequired() {
        BankAccountTransactionApprover approver = new BankAccountTransactionApprover(new BankAccountCurrentBalanceCalculator());
        Transaction[] transactions = {deposit220};
        boolean actual = approver.approve(new BankAccount("John", transactions, 0), withdrawal220);
        assertTrue(actual);
    }

    @Test
    public void shouldNotApprove_whenTransactionIsWithdrawal_andBalanceIsLessThanRequired() {
        BankAccountTransactionApprover approver = new BankAccountTransactionApprover(new BankAccountCurrentBalanceCalculator());
        Transaction[] transactions = {deposit150};
        boolean actual = approver.approve(new BankAccount("John", transactions, 0), withdrawal220);
        assertFalse(actual);
    }

    @Test
    public void shouldNotApprove_whenTransactionIsWithdrawal_andIsOverCreditLimit() {
        BankAccountTransactionApprover approver = new BankAccountTransactionApprover(new BankAccountCurrentBalanceCalculator());
        Transaction[] transactions = {};
        boolean actual = approver.approve(new BankAccount("John", transactions, 100), withdrawal150);
        assertFalse(actual);
    }

    @Test
    public void shouldApprove_whenTransactionIsWithdrawal_andEqualsCreditLimit() {
        BankAccountTransactionApprover approver = new BankAccountTransactionApprover(new BankAccountCurrentBalanceCalculator());
        Transaction[] transactions = {};
        boolean actual = approver.approve(new BankAccount("John", transactions, 150), withdrawal150);
        assertTrue(actual);
    }
}