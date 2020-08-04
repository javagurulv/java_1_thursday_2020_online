package student_aleksey_kodin.lessonx.bank_account.part_1_basic.task_16;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountMinBalanceFinderTest {

    @Test
    public void find_1_No_Credit_Limit() {
        Transaction transaction_1 = new Transaction("User", 1000, TransactionType.DEPOSIT);
        Transaction[] allTransactions = {transaction_1};
        BankAccount bankAccount = new BankAccount(allTransactions);
        BankAccountMinBalanceFinder calculateBalance = new BankAccountMinBalanceFinder();

        int result = calculateBalance.find(bankAccount);

        assertEquals(0, result);
    }

    @Test
    public void find_2_Credit_Limit_1000() {
        Transaction transaction_1 = new Transaction("User", 1000, TransactionType.DEPOSIT);
        Transaction transaction_2 = new Transaction("User", 1000, TransactionType.WITHDRAWAL);
        Transaction[] allTransactions = {transaction_1, transaction_2};
        BankAccount bankAccount = new BankAccount(allTransactions, 1000);
        BankAccountMinBalanceFinder calculateBalance = new BankAccountMinBalanceFinder();

        int result = calculateBalance.find(bankAccount);

        assertEquals(0, result);
    }

    @Test
    public void find_3_Credit_Limit_1000() {
        Transaction transaction_1 = new Transaction("User", 1000, TransactionType.DEPOSIT);
        Transaction transaction_2 = new Transaction("User", 1000, TransactionType.WITHDRAWAL);
        Transaction transaction_3 = new Transaction("User", 500, TransactionType.WITHDRAWAL);
        Transaction[] allTransactions = {transaction_1, transaction_2, transaction_3};
        BankAccount bankAccount = new BankAccount(allTransactions, 1000);
        BankAccountMinBalanceFinder calculateBalance = new BankAccountMinBalanceFinder();

        int result = calculateBalance.find(bankAccount);

        assertEquals(-500, result);
    }

    @Test
    public void find_4_Credit_Limit_1000() {
        Transaction transaction_1 = new Transaction("User", 1000, TransactionType.DEPOSIT);
        Transaction transaction_2 = new Transaction("User", 1000, TransactionType.WITHDRAWAL);
        Transaction transaction_3 = new Transaction("User", 500, TransactionType.WITHDRAWAL);
        Transaction transaction_4 = new Transaction("User", 500, TransactionType.WITHDRAWAL);
        Transaction[] allTransactions = {transaction_1, transaction_2, transaction_3, transaction_4};
        BankAccount bankAccount = new BankAccount(allTransactions, 1000);
        BankAccountMinBalanceFinder calculateBalance = new BankAccountMinBalanceFinder();

        int result = calculateBalance.find(bankAccount);

        assertEquals(-1000, result);
    }

    @Test
    public void find_5_Credit_Limit_1000() {
        Transaction transaction_1 = new Transaction("User", 1000, TransactionType.DEPOSIT);
        Transaction transaction_2 = new Transaction("User", 1000, TransactionType.WITHDRAWAL);
        Transaction transaction_3 = new Transaction("User", 500, TransactionType.WITHDRAWAL);
        Transaction transaction_4 = new Transaction("User", 500, TransactionType.WITHDRAWAL);
        Transaction transaction_5 = new Transaction("User", 1000, TransactionType.DEPOSIT);
        Transaction[] allTransactions = {transaction_1, transaction_2, transaction_3, transaction_4,
                transaction_5};
        BankAccount bankAccount = new BankAccount(allTransactions, 1000);
        BankAccountMinBalanceFinder calculateBalance = new BankAccountMinBalanceFinder();

        int result = calculateBalance.find(bankAccount);

        assertEquals(-1000, result);
    }
}