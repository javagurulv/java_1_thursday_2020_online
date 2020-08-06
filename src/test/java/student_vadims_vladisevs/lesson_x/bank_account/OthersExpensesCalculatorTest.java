package student_vadims_vladisevs.lesson_x.bank_account;

import org.junit.Test;

import static org.junit.Assert.*;

public class OthersExpensesCalculatorTest {

    OthersExpensesCalculator othersExpensesCalculator = new OthersExpensesCalculator();
    Transaction deposit = TransactionFactory.createDepositTransaction(1000);
    Transaction withdrawal_OTHERS_1 = TransactionFactory.createWithdrawalTransaction(10, ExpenseCategory.OTHERS);
    Transaction withdrawal_OTHERS_2 = TransactionFactory.createWithdrawalTransaction(20, ExpenseCategory.OTHERS);
    Transaction withdrawal_FOOD = TransactionFactory.createWithdrawalTransaction(400, ExpenseCategory.FOOD);

    @Test
    public void calculateExpensesAmount_v1() {
        BankAccount bankAccount = new BankAccount("Vadim",500, deposit, withdrawal_OTHERS_1, withdrawal_OTHERS_2, withdrawal_FOOD);
        int actual = othersExpensesCalculator.calculateExpensesAmount(bankAccount);
        assertEquals(30, actual);
    }

    @Test
    public void calculateExpensesAmount_v2() {
        BankAccount bankAccount = new BankAccount("Vadim", 500, deposit, withdrawal_OTHERS_1, withdrawal_FOOD);
        int actual = othersExpensesCalculator.calculateExpensesAmount(bankAccount);
        assertEquals(10, actual);
    }

    @Test
    public void calculateExpensesAmount_v3() {
        BankAccount bankAccount = new BankAccount("Vadim", 500, deposit, withdrawal_OTHERS_2);
        int actual = othersExpensesCalculator.calculateExpensesAmount(bankAccount);
        assertEquals(20, actual);
    }


}