package student_aleksey_kodin.lesson13.level1;

import java.math.BigDecimal;
import java.math.RoundingMode;

class TaxCalculatorImpl implements TaxCalculator {

    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        if (income.compareTo(new BigDecimal("20000")) > 0) {

            BigDecimal increasedTax = income.subtract(new BigDecimal(20000)).multiply(new BigDecimal("0.40"));

            return new BigDecimal("20000").multiply(new BigDecimal("0.25")).add(increasedTax).
                    setScale(2, RoundingMode.HALF_UP);

        }
        return income.multiply(new BigDecimal("0.25")).setScale(2, RoundingMode.HALF_UP);
    }
}
