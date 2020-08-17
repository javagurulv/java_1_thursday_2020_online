package student_alexander_bogachenkov.lesson_x.bank_account.part_1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountMinBalanceFinderTest {

    BankAccountMinBalanceFinder calculator;
    Transaction transaction1;
    Transaction transaction2;
    Transaction transaction3;
    Transaction transaction4;

    @Before
    public void init() {
        calculator = new BankAccountMinBalanceFinder();
        transaction1 = new Transaction(100, TransactionType.DEPOSIT);
        transaction2 = new Transaction(250, TransactionType.WITHDRAWAL);
        transaction3 = new Transaction(100, TransactionType.WITHDRAWAL);
        transaction4 = new Transaction(1000, TransactionType.DEPOSIT);
    }

    @Test
    public void shouldFindMinBalance_whenMinBalanceIsNegative() {
        Transaction[] transactions = {transaction1, transaction2, transaction4, transaction3};
        int actual = calculator.find(new BankAccount("John", transactions, 10000));
        int expected = -150;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMinBalance_whenMinBalanceIsZero() {
        Transaction[] transactions = {transaction1, transaction4};
        int actual = calculator.find(new BankAccount("John", transactions,10000));
        int expected = 0;
        assertEquals(expected, actual);
    }
}