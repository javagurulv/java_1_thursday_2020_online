package student_vadims_vladisevs.lesson_x.bank_account;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ExpenseCategoryAmountCalculator {

    private List<ExpensesCalculator> expensesCalculators;

    public ExpenseCategoryAmountCalculator() {
        this.expensesCalculators = new ArrayList<>();
        this.expensesCalculators.add(new FoodExpensesCalculator());
        this.expensesCalculators.add(new EntertainmentExpensesCalculator());
        this.expensesCalculators.add(new LoansExpensesCalculator());
        this.expensesCalculators.add(new CommunalPaymentsExpensesCalculator());
        this.expensesCalculators.add(new GamblingExpensesCalculator());
        this.expensesCalculators.add(new OthersExpensesCalculator());
    }

    public Map<ExpenseCategory, Integer> calculate(BankAccount bankAccount) {
        Map<ExpenseCategory, Integer> expensesByCategory = new HashMap<>();

        for (ExpensesCalculator calculator : expensesCalculators) {
            ExpenseCategory expenseCategory = calculator.getExpenseCategory();
            int expenseAmount = calculator.calculateExpensesAmount(bankAccount);
            expensesByCategory.put(expenseCategory, expenseAmount);
        }

        return expensesByCategory;
    }




}
