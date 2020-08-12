package student_vadims_vladisevs.lesson_x.bank_account;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountCurrentBalanceCalculatorTest {

   BankAccountCurrentBalanceCalculator bankAccountCurrentBalanceCalculator = new BankAccountCurrentBalanceCalculator();
    Transaction depositTransaction = TransactionFactory.createDepositTransaction(1000);
    Transaction withdrawalTransaction =  TransactionFactory.createWithdrawalTransaction(500, ExpenseCategory.FOOD);


    @Test
    public void calculate_deposit() {
        BankAccount bankAccount = new BankAccount("Vadim", 0, depositTransaction);
        int actual = bankAccountCurrentBalanceCalculator.calculate(bankAccount);
        assertEquals(1000, actual);
    }

    @Test
    public void calculate_withdrawal() {
        BankAccount bankAccount = new BankAccount("Vadim",0, withdrawalTransaction);
        int actual = bankAccountCurrentBalanceCalculator.calculate(bankAccount);
        assertEquals(-500, actual);
    }

    @Test
    public void calculate_depositAndWithdrawal() {
        BankAccount bankAccount = new BankAccount("Vadim",0, depositTransaction, withdrawalTransaction);
        int actual = bankAccountCurrentBalanceCalculator.calculate(bankAccount);
        assertEquals(500, actual);
    }
}