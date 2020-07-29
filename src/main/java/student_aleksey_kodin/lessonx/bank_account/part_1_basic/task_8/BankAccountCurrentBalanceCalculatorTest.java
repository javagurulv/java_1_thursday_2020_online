package student_aleksey_kodin.lessonx.bank_account.part_1_basic.task_8;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountCurrentBalanceCalculatorTest {

    @Test
    public void calculate_1() {
        Transaction transaction_1 = new Transaction("User",1000,TransactionType.DEPOSIT);
        Transaction[] allTransactions = {transaction_1};
        BankAccount bankAccount = new BankAccount(allTransactions);
        BankAccountCurrentBalanceCalculator calculateBalance = new BankAccountCurrentBalanceCalculator();

        int result = calculateBalance.calculate(bankAccount);

        assertEquals(1000,result);
    }

    @Test
    public void calculate_2() {
        Transaction transaction_1 = new Transaction("User",1000,TransactionType.DEPOSIT);
        Transaction transaction_2 = new Transaction("User",1000,TransactionType.DEPOSIT);
        Transaction[] allTransactions = {transaction_1,transaction_2};
        BankAccount bankAccount = new BankAccount(allTransactions);
        BankAccountCurrentBalanceCalculator calculateBalance = new BankAccountCurrentBalanceCalculator();

        int result = calculateBalance.calculate(bankAccount);

        assertEquals(2000,result);
    }

    @Test
    public void calculate_3() {
        Transaction transaction_1 = new Transaction("User",1000,TransactionType.DEPOSIT);
        Transaction transaction_2 = new Transaction("User",1000,TransactionType.DEPOSIT);
        Transaction transaction_3 = new Transaction("User",1000,TransactionType.DEPOSIT);
        Transaction[] allTransactions = {transaction_1,transaction_2,transaction_3};
        BankAccount bankAccount = new BankAccount(allTransactions);
        BankAccountCurrentBalanceCalculator calculateBalance = new BankAccountCurrentBalanceCalculator();

        int result = calculateBalance.calculate(bankAccount);

        assertEquals(3000,result);
    }

    @Test
    public void calculate_4() {
        Transaction transaction_1 = new Transaction("User",1000,TransactionType.DEPOSIT);
        Transaction transaction_2 = new Transaction("User",1000,TransactionType.DEPOSIT);
        Transaction transaction_3 = new Transaction("User",1000,TransactionType.WITHDRAWAL);
        Transaction[] allTransactions = {transaction_1,transaction_2,transaction_3};
        BankAccount bankAccount = new BankAccount(allTransactions);
        BankAccountCurrentBalanceCalculator calculateBalance = new BankAccountCurrentBalanceCalculator();

        int result = calculateBalance.calculate(bankAccount);

        assertEquals(1000,result);
    }

    @Test
    public void calculate_5() {
        Transaction transaction_1 = new Transaction("User",1000,TransactionType.DEPOSIT);
        Transaction transaction_2 = new Transaction("User",1000,TransactionType.WITHDRAWAL);
        Transaction[] allTransactions = {transaction_1,transaction_2};
        BankAccount bankAccount = new BankAccount(allTransactions);
        BankAccountCurrentBalanceCalculator calculateBalance = new BankAccountCurrentBalanceCalculator();

        int result = calculateBalance.calculate(bankAccount);

        assertEquals(0,result);
    }
}