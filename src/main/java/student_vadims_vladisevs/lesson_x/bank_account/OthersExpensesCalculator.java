package student_vadims_vladisevs.lesson_x.bank_account;

class OthersExpensesCalculator extends ExpensesCalculator{

    @Override
    public ExpenseCategory getExpenseCategory() {
        return ExpenseCategory.OTHERS;
    }
}
