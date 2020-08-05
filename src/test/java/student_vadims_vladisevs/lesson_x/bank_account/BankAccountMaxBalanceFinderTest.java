package student_vadims_vladisevs.lesson_x.bank_account;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountMaxBalanceFinderTest {

    BankAccountMaxBalanceFinder bankAccountMaxBalanceFinder = new BankAccountMaxBalanceFinder();
    Transaction depositTransaction = new Transaction(1000, TransactionType.DEPOSIT);
    Transaction withdrawalTransaction = new Transaction(500, TransactionType.WITHDRAWAL);

    @Test
    public void find_v1() {
        Transaction[] allTransactions = {depositTransaction,withdrawalTransaction};
        BankAccount bankAccount = new BankAccount("Vadim", allTransactions,0);
        int actual = bankAccountMaxBalanceFinder.find(bankAccount);
        assertEquals(1000, actual);
    }

    @Test
    public void find_v2() {
        Transaction[] allTransactions = {depositTransaction,depositTransaction,withdrawalTransaction,withdrawalTransaction};
        BankAccount bankAccount = new BankAccount("Vadim", allTransactions,0);
        int actual = bankAccountMaxBalanceFinder.find(bankAccount);
        assertEquals(2000, actual);
    }

    @Test
    public void find_v3() {
        Transaction[] allTransactions = {withdrawalTransaction};
        BankAccount bankAccount = new BankAccount("Vadim", allTransactions,0);
        int actual = bankAccountMaxBalanceFinder.find(bankAccount);
        assertEquals(0, actual);
    }
}