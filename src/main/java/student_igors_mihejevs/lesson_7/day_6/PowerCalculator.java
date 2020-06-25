package student_igors_mihejevs.lesson_7.day_6;

import java.math.BigDecimal;

import static java.lang.Math.abs;

public class PowerCalculator {

    double exponentiation(double baseNumber, int exponent) {
        if (exponent > 0) return counting(baseNumber, exponent);
        else if (exponent < 0) return 1 / counting(baseNumber, exponent);
        else return 1;
    }

    private double counting(double baseNumber, int exponent) {
        double result = baseNumber;
        for (int i = abs(exponent); i > 1; i--) {
            result = result * baseNumber;
        }
        return result;
    }

}
