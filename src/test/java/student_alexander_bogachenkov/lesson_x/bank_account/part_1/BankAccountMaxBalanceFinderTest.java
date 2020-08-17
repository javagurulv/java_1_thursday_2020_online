package student_alexander_bogachenkov.lesson_x.bank_account.part_1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountMaxBalanceFinderTest {

    BankAccountMaxBalanceFinder calculator;
    Transaction transaction1;
    Transaction transaction2;
    Transaction transaction3;
    Transaction transaction4;

    @Before
    public void init() {
        calculator = new BankAccountMaxBalanceFinder();
        transaction1 = new Transaction(100, TransactionType.DEPOSIT);
        transaction2 = new Transaction(250, TransactionType.WITHDRAWAL);
        transaction3 = new Transaction(100, TransactionType.WITHDRAWAL);
        transaction4 = new Transaction(1000, TransactionType.DEPOSIT);
    }

    @Test
    public void shouldFindMaxBalance_whenMaxBalanceIsPositive() {
        Transaction[] transactions = {transaction1, transaction2, transaction4, transaction3};
        int actual = calculator.find(new BankAccount("John", transactions, 10000));
        int expected = 850;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxBalance_whenMaxBalanceIsZero() {
        Transaction[] transactions = {transaction3, transaction2, transaction3};
        int actual = calculator.find(new BankAccount("John", transactions,10000));
        int expected = 0;
        assertEquals(expected, actual);
    }
}