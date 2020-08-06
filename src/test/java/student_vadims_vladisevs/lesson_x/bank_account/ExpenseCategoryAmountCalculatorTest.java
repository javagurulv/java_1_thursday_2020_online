package student_vadims_vladisevs.lesson_x.bank_account;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class ExpenseCategoryAmountCalculatorTest {

    ExpenseCategoryAmountCalculator expenseCategoryAmountCalculator = new ExpenseCategoryAmountCalculator();
    Transaction deposit = TransactionFactory.createDepositTransaction(1000);
    Transaction withdrawal_FOOD = TransactionFactory.createWithdrawalTransaction(10, ExpenseCategory.FOOD);
    Transaction withdrawal_GAMBLING = TransactionFactory.createWithdrawalTransaction(20, ExpenseCategory.GAMBLING);
    Transaction withdrawal_OTHERS = TransactionFactory.createWithdrawalTransaction(400, ExpenseCategory.OTHERS);
    Transaction withdrawal_ENTERTAINMENT = TransactionFactory.createWithdrawalTransaction(200, ExpenseCategory.ENTERTAINMENT);
    Transaction withdrawal_LOANS = TransactionFactory.createWithdrawalTransaction(20, ExpenseCategory.LOANS);
    Transaction withdrawal_COMMUNAL_PAYMENTS = TransactionFactory.createWithdrawalTransaction(100, ExpenseCategory.COMMUNAL_PAYMENTS);

    @Test
    public void calculate_v1() {
        BankAccount bankAccount = new BankAccount("Vadim", 500, deposit, withdrawal_FOOD);
        Map<ExpenseCategory, Integer> expensesByCategory = expenseCategoryAmountCalculator.calculate(bankAccount);
        assertEquals(10, expensesByCategory.get(ExpenseCategory.FOOD).intValue());
    }

    @Test
    public void calculate_v2() {
        BankAccount bankAccount = new BankAccount("Vadim", 500, deposit, withdrawal_FOOD, withdrawal_GAMBLING);
        Map<ExpenseCategory, Integer> expensesByCategory = expenseCategoryAmountCalculator.calculate(bankAccount);
        assertEquals(10, expensesByCategory.get(ExpenseCategory.FOOD).intValue());
        assertEquals(20, expensesByCategory.get(ExpenseCategory.GAMBLING).intValue());
    }

    @Test
    public void calculate_v3() {
        BankAccount bankAccount = new BankAccount("Vadim", 500, deposit, withdrawal_FOOD, withdrawal_GAMBLING, withdrawal_OTHERS);
        Map<ExpenseCategory, Integer> expensesByCategory = expenseCategoryAmountCalculator.calculate(bankAccount);
        assertEquals(10, expensesByCategory.get(ExpenseCategory.FOOD).intValue());
        assertEquals(20, expensesByCategory.get(ExpenseCategory.GAMBLING).intValue());
        assertEquals(400, expensesByCategory.get(ExpenseCategory.OTHERS).intValue());
    }

    @Test
    public void calculate_v4() {
        BankAccount bankAccount = new BankAccount("Vadim", 500, deposit, withdrawal_FOOD, withdrawal_GAMBLING, withdrawal_OTHERS, withdrawal_ENTERTAINMENT);
        Map<ExpenseCategory, Integer> expensesByCategory = expenseCategoryAmountCalculator.calculate(bankAccount);
        assertEquals(10, expensesByCategory.get(ExpenseCategory.FOOD).intValue());
        assertEquals(20, expensesByCategory.get(ExpenseCategory.GAMBLING).intValue());
        assertEquals(400, expensesByCategory.get(ExpenseCategory.OTHERS).intValue());
        assertEquals(200, expensesByCategory.get(ExpenseCategory.ENTERTAINMENT).intValue());
    }

    @Test
    public void calculate_v5() {
        BankAccount bankAccount = new BankAccount("Vadim", 500, deposit, withdrawal_FOOD, withdrawal_GAMBLING, withdrawal_OTHERS, withdrawal_ENTERTAINMENT
        , withdrawal_COMMUNAL_PAYMENTS);
        Map<ExpenseCategory, Integer> expensesByCategory = expenseCategoryAmountCalculator.calculate(bankAccount);
        assertEquals(10, expensesByCategory.get(ExpenseCategory.FOOD).intValue());
        assertEquals(20, expensesByCategory.get(ExpenseCategory.GAMBLING).intValue());
        assertEquals(400, expensesByCategory.get(ExpenseCategory.OTHERS).intValue());
        assertEquals(200, expensesByCategory.get(ExpenseCategory.ENTERTAINMENT).intValue());
        assertEquals(100, expensesByCategory.get(ExpenseCategory.COMMUNAL_PAYMENTS).intValue());
    }

    @Test
    public void calculate_v6() {
        BankAccount bankAccount = new BankAccount("Vadim", 500, deposit, withdrawal_FOOD, withdrawal_GAMBLING, withdrawal_OTHERS, withdrawal_ENTERTAINMENT
                , withdrawal_COMMUNAL_PAYMENTS, withdrawal_LOANS);
        Map<ExpenseCategory, Integer> expensesByCategory = expenseCategoryAmountCalculator.calculate(bankAccount);
        assertEquals(10, expensesByCategory.get(ExpenseCategory.FOOD).intValue());
        assertEquals(20, expensesByCategory.get(ExpenseCategory.GAMBLING).intValue());
        assertEquals(400, expensesByCategory.get(ExpenseCategory.OTHERS).intValue());
        assertEquals(200, expensesByCategory.get(ExpenseCategory.ENTERTAINMENT).intValue());
        assertEquals(100, expensesByCategory.get(ExpenseCategory.COMMUNAL_PAYMENTS).intValue());
        assertEquals(20, expensesByCategory.get(ExpenseCategory.LOANS).intValue());
    }
}