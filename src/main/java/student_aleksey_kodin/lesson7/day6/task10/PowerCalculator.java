package student_aleksey_kodin.lesson7.day6.task10;

import java.math.BigDecimal;
import java.math.RoundingMode;

class PowerCalculator {
    BigDecimal exponentiation(BigDecimal number,int degree) {
        if (degree == 0) return new BigDecimal(1);
        if (degree == 1) return  number;
        if (degree < 0) {
            number = new BigDecimal(1).divide(number,1, RoundingMode.UP);
            degree = Math.abs(degree);
        }
        return number.multiply(exponentiation(number, degree - 1));
    }
}
