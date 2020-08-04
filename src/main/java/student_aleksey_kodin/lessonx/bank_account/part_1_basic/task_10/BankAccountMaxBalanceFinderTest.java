package student_aleksey_kodin.lessonx.bank_account.part_1_basic.task_10;

import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountMaxBalanceFinderTest {

    @Test
    public void find_1() {
        Transaction transaction_1 = new Transaction("User",1000, TransactionType.DEPOSIT);
        Transaction[] allTransactions = {transaction_1};
        BankAccount bankAccount = new BankAccount(allTransactions);
        BankAccountMaxBalanceFinder calculateBalance = new BankAccountMaxBalanceFinder();

        int result = calculateBalance.find(bankAccount);

        assertEquals(1000,result);
    }

    @Test
    public void find_2() {
        Transaction transaction_1 = new Transaction("User",1000, TransactionType.DEPOSIT);
        Transaction transaction_2 = new Transaction("User",1000, TransactionType.DEPOSIT);
        Transaction[] allTransactions = {transaction_1,transaction_2};
        BankAccount bankAccount = new BankAccount(allTransactions);
        BankAccountMaxBalanceFinder calculateBalance = new BankAccountMaxBalanceFinder();

        int result = calculateBalance.find(bankAccount);

        assertEquals(2000,result);
    }
    @Test
    public void find_3() {
        Transaction transaction_1 = new Transaction("User",1000, TransactionType.DEPOSIT);
        Transaction transaction_2 = new Transaction("User",1000, TransactionType.DEPOSIT);
        Transaction transaction_3 = new Transaction("User",1000, TransactionType.DEPOSIT);
        Transaction[] allTransactions = {transaction_1,transaction_2,transaction_3};
        BankAccount bankAccount = new BankAccount(allTransactions);
        BankAccountMaxBalanceFinder calculateBalance = new BankAccountMaxBalanceFinder();

        int result = calculateBalance.find(bankAccount);

        assertEquals(3000,result);
    }

    @Test
    public void find_4() {
        Transaction transaction_1 = new Transaction("User",1000, TransactionType.DEPOSIT);
        Transaction transaction_2 = new Transaction("User",1000, TransactionType.DEPOSIT);
        Transaction transaction_3 = new Transaction("User",1000, TransactionType.DEPOSIT);
        Transaction transaction_4 = new Transaction("User",1000, TransactionType.WITHDRAWAL);
        Transaction[] allTransactions = {transaction_1,transaction_2,transaction_3,transaction_4};
        BankAccount bankAccount = new BankAccount(allTransactions);
        BankAccountMaxBalanceFinder calculateBalance = new BankAccountMaxBalanceFinder();

        int result = calculateBalance.find(bankAccount);

        assertEquals(3000,result);
    }

    @Test
    public void find_5() {
        Transaction transaction_1 = new Transaction("User",1000, TransactionType.DEPOSIT);
        Transaction transaction_2 = new Transaction("User",1000, TransactionType.DEPOSIT);
        Transaction transaction_3 = new Transaction("User",1000, TransactionType.DEPOSIT);
        Transaction transaction_4 = new Transaction("User",1000, TransactionType.WITHDRAWAL);
        Transaction transaction_5 = new Transaction("User",1000, TransactionType.DEPOSIT);
        Transaction[] allTransactions = {transaction_1,transaction_2,transaction_3,transaction_4,transaction_5};
        BankAccount bankAccount = new BankAccount(allTransactions);
        BankAccountMaxBalanceFinder calculateBalance = new BankAccountMaxBalanceFinder();

        int result = calculateBalance.find(bankAccount);

        assertEquals(3000,result);
    }
}