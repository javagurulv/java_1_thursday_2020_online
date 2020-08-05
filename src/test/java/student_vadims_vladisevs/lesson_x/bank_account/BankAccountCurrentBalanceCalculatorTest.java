package student_vadims_vladisevs.lesson_x.bank_account;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountCurrentBalanceCalculatorTest {

   BankAccountCurrentBalanceCalculator bankAccountCurrentBalanceCalculator = new BankAccountCurrentBalanceCalculator();
    Transaction depositTransaction = new Transaction(1000, TransactionType.DEPOSIT);
    Transaction withdrawalTransaction = new Transaction(500, TransactionType.WITHDRAWAL);


    @Test
    public void calculate_deposit() {
        Transaction[] allTransactions = {depositTransaction};
        BankAccount bankAccount = new BankAccount("Vadim", allTransactions, 0);
        int actual = bankAccountCurrentBalanceCalculator.calculate(bankAccount);
        assertEquals(1000, actual);
    }

    @Test
    public void calculate_withdrawal() {
        Transaction[] allTransactions = {withdrawalTransaction};
        BankAccount bankAccount = new BankAccount("Vadim", allTransactions,0);
        int actual = bankAccountCurrentBalanceCalculator.calculate(bankAccount);
        assertEquals(-500, actual);
    }

    @Test
    public void calculate_depositAndWithdrawal() {
        Transaction[] allTransactions = {depositTransaction, withdrawalTransaction};
        BankAccount bankAccount = new BankAccount("Vadim", allTransactions,0);
        int actual = bankAccountCurrentBalanceCalculator.calculate(bankAccount);
        assertEquals(500, actual);
    }
}