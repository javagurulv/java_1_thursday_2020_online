package student_vadims_vladisevs.lesson_x.bank_account;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTransactionApproverTest {


    BankAccountTransactionApprover bankAccountTransactionApprover = new BankAccountTransactionApprover(new BankAccountCurrentBalanceCalculator());
    Transaction depositTransaction = new Transaction(1000, TransactionType.DEPOSIT);
    Transaction depositTransaction_2 = new Transaction(100, TransactionType.DEPOSIT);
    Transaction withdrawalTransaction = new Transaction(500, TransactionType.WITHDRAWAL);
    Transaction withdrawalTransaction_2 = new Transaction(1500, TransactionType.WITHDRAWAL);

    @Test
    public void approve_withdrawalTrue_v1() {
        Transaction[] allTransactions = {depositTransaction};
        BankAccount bankAccount = new BankAccount("Vadim", allTransactions,0);
        boolean actual = bankAccountTransactionApprover.approve(bankAccount, withdrawalTransaction);
        assertTrue(actual);
    }

    @Test
    public void approve_withdrawalFalse() {
        Transaction[] allTransactions = {depositTransaction};
        BankAccount bankAccount = new BankAccount("Vadim", allTransactions,0);
        boolean actual = bankAccountTransactionApprover.approve(bankAccount, withdrawalTransaction_2);
        assertFalse(actual);
    }

    @Test
    public void approve_withdrawalTrue_V2() {
        Transaction[] allTransactions = {depositTransaction_2};
        BankAccount bankAccount = new BankAccount("Vadim", allTransactions,600);
        boolean actual = bankAccountTransactionApprover.approve(bankAccount, withdrawalTransaction);
        assertTrue(actual);
    }

    @Test
    public void approve_deposit() {
        Transaction[] allTransactions = {depositTransaction};
        BankAccount bankAccount = new BankAccount("Vadim", allTransactions,0);
        boolean actual = bankAccountTransactionApprover.approve(bankAccount, depositTransaction_2);
        assertTrue(actual);
    }


}