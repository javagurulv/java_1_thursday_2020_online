package student_vadims_vladisevs.lesson_x.bank_account;

class CommunalPaymentsExpensesCalculator extends ExpensesCalculator{

    @Override
    protected ExpenseCategory getExpenseCategory() {
        return ExpenseCategory.COMMUNAL_PAYMENTS;
    }
}
