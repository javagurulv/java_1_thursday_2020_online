package student_alexander_bogachenkov.lesson13_23072020.homeworks.level_1.task_6;

import java.math.BigDecimal;

class TaxCalculatorImpl implements TaxCalculator {

    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        return income.multiply(new BigDecimal("0.25"));
    }

}
