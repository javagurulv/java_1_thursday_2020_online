package student_vadims_vladisevs.lesson_x.bank_account;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountMinBalanceFinderTest {

    BankAccountMinBalanceFinder bankAccountMinBalanceFinder = new BankAccountMinBalanceFinder();
    Transaction depositTransaction = TransactionFactory.createDepositTransaction(1000);
    Transaction withdrawalTransaction =  TransactionFactory.createWithdrawalTransaction(500, ExpenseCategory.FOOD);

    @Test
    public void find_v1() {
        Transaction[] allTransactions = {depositTransaction};
        BankAccount bankAccount = new BankAccount("Vadim", allTransactions,0);
        int actual = bankAccountMinBalanceFinder.find(bankAccount);
        assertEquals(0, actual);
    }

    @Test
    public void find_v2() {
        Transaction[] allTransactions = {depositTransaction, withdrawalTransaction};
        BankAccount bankAccount = new BankAccount("Vadim", allTransactions,0);
        int actual = bankAccountMinBalanceFinder.find(bankAccount);
        assertEquals(0, actual);
    }

    @Test
    public void find_v3() {
        Transaction[] allTransactions = { withdrawalTransaction};
        BankAccount bankAccount = new BankAccount("Vadim", allTransactions,0);
        int actual = bankAccountMinBalanceFinder.find(bankAccount);
        assertEquals(-500, actual);
    }
}