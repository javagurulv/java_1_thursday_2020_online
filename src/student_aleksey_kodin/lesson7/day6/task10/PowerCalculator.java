package student_aleksey_kodin.lesson7.day6.task10;

import java.math.BigInteger;

class PowerCalculator {
    BigInteger exponentiation(int number,int degree) {
        if (degree == 0) return BigInteger.valueOf(1);
        if (degree == 1) return  BigInteger.valueOf(number);
        return  BigInteger.valueOf(number).multiply(exponentiation(number,degree - 1));
    }
}
