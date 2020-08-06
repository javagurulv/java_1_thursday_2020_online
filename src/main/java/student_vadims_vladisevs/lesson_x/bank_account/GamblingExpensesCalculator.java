package student_vadims_vladisevs.lesson_x.bank_account;

class GamblingExpensesCalculator extends ExpensesCalculator{

    @Override
    protected ExpenseCategory getExpenseCategory() {
        return ExpenseCategory.GAMBLING;
    }
}
