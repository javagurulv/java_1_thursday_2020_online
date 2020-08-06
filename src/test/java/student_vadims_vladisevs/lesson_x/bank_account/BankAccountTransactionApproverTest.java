package student_vadims_vladisevs.lesson_x.bank_account;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTransactionApproverTest {


    BankAccountTransactionApprover bankAccountTransactionApprover = new BankAccountTransactionApprover(new BankAccountCurrentBalanceCalculator());
    Transaction depositTransaction = TransactionFactory.createDepositTransaction(1000);
    Transaction depositTransaction_2 = TransactionFactory.createDepositTransaction(100);
    Transaction withdrawalTransaction = TransactionFactory.createWithdrawalTransaction(500, ExpenseCategory.FOOD);
    Transaction withdrawalTransaction_2 =  TransactionFactory.createWithdrawalTransaction(1500, ExpenseCategory.FOOD);

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