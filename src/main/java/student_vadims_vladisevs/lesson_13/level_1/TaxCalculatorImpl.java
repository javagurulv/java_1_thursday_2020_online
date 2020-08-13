package student_vadims_vladisevs.lesson_13.level_1;

import java.math.BigDecimal;

class TaxCalculatorImpl implements TaxCalculator {

    private final BigDecimal LIMIT = new BigDecimal("20000");

    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        if (income.compareTo(LIMIT) <= 0){
            return income.multiply(new BigDecimal("0.25"));
        } else {
            BigDecimal taxBefore20000 = LIMIT.multiply(new BigDecimal("0.25"));
            BigDecimal taxAfter20000 = income.subtract(LIMIT).multiply(new BigDecimal("0.40"));
            return taxBefore20000.add(taxAfter20000);
        }
    }


}
