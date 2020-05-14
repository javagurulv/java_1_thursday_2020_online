package student_aleksey_kodin.lesson6.javagurulv.moodle.level3;

import java.math.BigInteger;

class PowerCalculator {
    BigInteger exponentiation(int number,int degree) {
        BigInteger localNumber =  BigInteger.valueOf(number);
        BigInteger result = localNumber;

        if (degree == 0) return BigInteger.valueOf(1);
        if (degree == 1) return BigInteger.valueOf(number);

        for (int count = 2; count <= degree; count++) {
              result = localNumber.multiply(result);
        }
        return result;
    }
    BigInteger exponentiationRecursion(int number,int degree) {
        if (degree == 0) return BigInteger.valueOf(1);
        if (degree == 1) return  BigInteger.valueOf(number);
        return  BigInteger.valueOf(number).multiply(exponentiationRecursion(number,degree - 1));
    }
}
