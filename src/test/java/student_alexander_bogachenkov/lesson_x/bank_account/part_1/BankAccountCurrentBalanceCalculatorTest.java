package student_alexander_bogachenkov.lesson_x.bank_account.part_1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountCurrentBalanceCalculatorTest {

    BankAccountCurrentBalanceCalculator calculator;
    Transaction transaction1;
    Transaction transaction2;
    Transaction transaction3;
    Transaction transaction4;

    @Before
    public void init() {
        calculator = new BankAccountCurrentBalanceCalculator();
        transaction1 = new Transaction(100, TransactionType.DEPOSIT);
        transaction2 = new Transaction(250, TransactionType.WITHDRAWAL);
        transaction3 = new Transaction(100, TransactionType.WITHDRAWAL);
        transaction4 = new Transaction(1000, TransactionType.DEPOSIT);
    }

    @Test
    public void shouldCalculate_whenCurrentBalanceIsNegative() {
        Transaction[] transactions = {transaction1, transaction2};
        int actual = calculator.calculate(new BankAccount("John", transactions, 10000));
        int expected = -150;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculate_whenCurrentBalanceIsZero() {
        Transaction[] transactions = {transaction1, transaction3};
        int actual = calculator.calculate(new BankAccount("John", transactions, 10000));
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculate_whenCurrentBalanceIsPositive() {
        Transaction[] transactions = {transaction1, transaction3, transaction4};
        int actual = calculator.calculate(new BankAccount("John", transactions, 10000));
        int expected = 1000;
        assertEquals(expected, actual);
    }
}