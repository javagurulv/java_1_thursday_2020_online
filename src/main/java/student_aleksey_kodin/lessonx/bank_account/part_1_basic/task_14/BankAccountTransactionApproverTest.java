package student_aleksey_kodin.lessonx.bank_account.part_1_basic.task_14;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTransactionApproverTest {

    @Test
    public void approve_1_No_Credit_Limit() {
        Transaction transaction_1 = new Transaction("User", 1000, TransactionType.DEPOSIT);

        Transaction[] allTransactions = {transaction_1};
        BankAccount bankAccount = new BankAccount(allTransactions);
        BankAccountCurrentBalanceCalculator bankAccountCurrentBalanceCalculator = new BankAccountCurrentBalanceCalculator();
        BankAccountTransactionApprover checkTransaction = new BankAccountTransactionApprover(bankAccountCurrentBalanceCalculator);

        Transaction transaction_2 = new Transaction("User", 1000, TransactionType.DEPOSIT);
        boolean result = checkTransaction.approve(bankAccount, transaction_2);

        assertTrue(result);
    }

    @Test
    public void approve_2_No_Credit_Limit() {
        Transaction transaction_1 = new Transaction("User", 1000, TransactionType.DEPOSIT);

        Transaction[] allTransactions = {transaction_1};
        BankAccount bankAccount = new BankAccount(allTransactions);
        BankAccountCurrentBalanceCalculator bankAccountCurrentBalanceCalculator = new BankAccountCurrentBalanceCalculator();
        BankAccountTransactionApprover checkTransaction = new BankAccountTransactionApprover(bankAccountCurrentBalanceCalculator);

        Transaction transaction_2 = new Transaction("User", 1000, TransactionType.WITHDRAWAL);
        boolean result = checkTransaction.approve(bankAccount, transaction_2);

        assertTrue(result);
    }

    @Test
    public void approve_3_No_Credit_Limit() {
        Transaction transaction_1 = new Transaction("User", 1000, TransactionType.DEPOSIT);

        Transaction[] allTransactions = {transaction_1};
        BankAccount bankAccount = new BankAccount(allTransactions);
        BankAccountCurrentBalanceCalculator bankAccountCurrentBalanceCalculator = new BankAccountCurrentBalanceCalculator();
        BankAccountTransactionApprover checkTransaction = new BankAccountTransactionApprover(bankAccountCurrentBalanceCalculator);

        Transaction transaction_2 = new Transaction("User", 1100, TransactionType.WITHDRAWAL);
        boolean result = checkTransaction.approve(bankAccount, transaction_2);

        assertFalse(result);
    }

    @Test
    public void approve_4_Credit_Limit_1000() {
        Transaction transaction_1 = new Transaction("User", 1000, TransactionType.DEPOSIT);

        Transaction[] allTransactions = {transaction_1};
        BankAccount bankAccount = new BankAccount(allTransactions, 1000);
        BankAccountCurrentBalanceCalculator bankAccountCurrentBalanceCalculator = new BankAccountCurrentBalanceCalculator();
        BankAccountTransactionApprover checkTransaction = new BankAccountTransactionApprover(bankAccountCurrentBalanceCalculator);

        Transaction transaction_2 = new Transaction("User", 500, TransactionType.WITHDRAWAL);
        boolean result = checkTransaction.approve(bankAccount, transaction_2);

        assertTrue(result);
    }

    @Test
    public void approve_5_Credit_Limit_1000() {
        Transaction transaction_1 = new Transaction("User", 1000, TransactionType.DEPOSIT);

        Transaction[] allTransactions = {transaction_1};
        BankAccount bankAccount = new BankAccount(allTransactions, 1000);
        BankAccountCurrentBalanceCalculator bankAccountCurrentBalanceCalculator = new BankAccountCurrentBalanceCalculator();
        BankAccountTransactionApprover checkTransaction = new BankAccountTransactionApprover(bankAccountCurrentBalanceCalculator);

        Transaction transaction_2 = new Transaction("User", 1500, TransactionType.WITHDRAWAL);
        boolean result = checkTransaction.approve(bankAccount, transaction_2);

        assertTrue(result);
    }

    @Test
    public void approve_6_Credit_Limit_1000() {
        Transaction transaction_1 = new Transaction("User", 1000, TransactionType.DEPOSIT);

        Transaction[] allTransactions = {transaction_1};
        BankAccount bankAccount = new BankAccount(allTransactions, 1000);
        BankAccountCurrentBalanceCalculator bankAccountCurrentBalanceCalculator = new BankAccountCurrentBalanceCalculator();
        BankAccountTransactionApprover checkTransaction = new BankAccountTransactionApprover(bankAccountCurrentBalanceCalculator);

        Transaction transaction_2 = new Transaction("User", 2000, TransactionType.WITHDRAWAL);
        boolean result = checkTransaction.approve(bankAccount, transaction_2);

        assertTrue(result);
    }

    @Test
    public void approve_7_Credit_Limit_1000() {
        Transaction transaction_1 = new Transaction("User", 1000, TransactionType.DEPOSIT);

        Transaction[] allTransactions = {transaction_1};
        BankAccount bankAccount = new BankAccount(allTransactions, 1000);
        BankAccountCurrentBalanceCalculator bankAccountCurrentBalanceCalculator = new BankAccountCurrentBalanceCalculator();
        BankAccountTransactionApprover checkTransaction = new BankAccountTransactionApprover(bankAccountCurrentBalanceCalculator);

        Transaction transaction_2 = new Transaction("User", 2200, TransactionType.WITHDRAWAL);
        boolean result = checkTransaction.approve(bankAccount, transaction_2);

        assertFalse(result);
    }
}