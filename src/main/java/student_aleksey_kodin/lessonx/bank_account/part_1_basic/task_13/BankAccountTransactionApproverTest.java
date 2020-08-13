package student_aleksey_kodin.lessonx.bank_account.part_1_basic.task_13;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTransactionApproverTest {

    @Test
    public void approve_1() {
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
    public void approve_2() {
        Transaction transaction_1 = new Transaction("User", 1000, TransactionType.DEPOSIT);
        Transaction transaction_2 = new Transaction("User", 1000, TransactionType.DEPOSIT);
        Transaction[] allTransactions = {transaction_1, transaction_2};
        BankAccount bankAccount = new BankAccount(allTransactions);
        BankAccountCurrentBalanceCalculator bankAccountCurrentBalanceCalculator = new BankAccountCurrentBalanceCalculator();
        BankAccountTransactionApprover checkTransaction = new BankAccountTransactionApprover(bankAccountCurrentBalanceCalculator);

        Transaction transaction_3 = new Transaction("User", 2000, TransactionType.WITHDRAWAL);
        boolean result = checkTransaction.approve(bankAccount, transaction_3);

        assertTrue(result);
    }

    @Test
    public void approve_3() {
        Transaction transaction_1 = new Transaction("User", 1000, TransactionType.DEPOSIT);
        Transaction transaction_2 = new Transaction("User", 1000, TransactionType.DEPOSIT);
        Transaction[] allTransactions = {transaction_1, transaction_2};
        BankAccount bankAccount = new BankAccount(allTransactions);
        BankAccountCurrentBalanceCalculator bankAccountCurrentBalanceCalculator = new BankAccountCurrentBalanceCalculator();
        BankAccountTransactionApprover checkTransaction = new BankAccountTransactionApprover(bankAccountCurrentBalanceCalculator);

        Transaction transaction_3 = new Transaction("User", 2100, TransactionType.WITHDRAWAL);
        boolean result = checkTransaction.approve(bankAccount, transaction_3);

        assertFalse(result);
    }

    @Test
    public void approve_4() {
        Transaction transaction_1 = new Transaction("User", 1000, TransactionType.DEPOSIT);
        Transaction transaction_2 = new Transaction("User", 1000, TransactionType.DEPOSIT);
        Transaction[] allTransactions = {transaction_1, transaction_2};
        BankAccount bankAccount = new BankAccount(allTransactions);
        BankAccountCurrentBalanceCalculator bankAccountCurrentBalanceCalculator = new BankAccountCurrentBalanceCalculator();
        BankAccountTransactionApprover checkTransaction = new BankAccountTransactionApprover(bankAccountCurrentBalanceCalculator);

        Transaction transaction_3 = new Transaction("User", 500, TransactionType.WITHDRAWAL);
        boolean result = checkTransaction.approve(bankAccount, transaction_3);

        assertTrue(result);
    }
}