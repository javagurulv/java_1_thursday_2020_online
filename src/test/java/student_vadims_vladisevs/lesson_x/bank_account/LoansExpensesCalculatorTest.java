package student_vadims_vladisevs.lesson_x.bank_account;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoansExpensesCalculatorTest {

    LoansExpensesCalculator loansExpensesCalculator = new LoansExpensesCalculator();
    Transaction deposit = TransactionFactory.createDepositTransaction(1000);
    Transaction withdrawal_LOANS_1 = TransactionFactory.createWithdrawalTransaction(10, ExpenseCategory.LOANS);
    Transaction withdrawal_LOANS_2 = TransactionFactory.createWithdrawalTransaction(20, ExpenseCategory.LOANS);
    Transaction withdrawal_OTHERS = TransactionFactory.createWithdrawalTransaction(400, ExpenseCategory.OTHERS);

    @Test
    public void calculateExpensesAmount_v1() {
        BankAccount bankAccount = new BankAccount("Vadim", 500, deposit, withdrawal_LOANS_1, withdrawal_LOANS_2, withdrawal_OTHERS);
        int actual = loansExpensesCalculator.calculateExpensesAmount(bankAccount);
        assertEquals(30, actual);
    }

    @Test
    public void calculateExpensesAmount_v2() {
        BankAccount bankAccount = new BankAccount("Vadim", 500, deposit, withdrawal_LOANS_1, withdrawal_OTHERS);
        int actual = loansExpensesCalculator.calculateExpensesAmount(bankAccount);
        assertEquals(10, actual);
    }

    @Test
    public void calculateExpensesAmount_v3() {
        BankAccount bankAccount = new BankAccount("Vadim", 500, deposit, withdrawal_LOANS_2);
        int actual = loansExpensesCalculator.calculateExpensesAmount(bankAccount);
        assertEquals(20, actual);
    }


}