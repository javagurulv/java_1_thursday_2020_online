package student_vadims_vladisevs.lesson9.day_1.task_5;

import java.math.BigDecimal;

class SafeDemo {
    public static void main(String[] args) {
        Safe safe = new Safe(1234, new BigDecimal("100.00"));
        safe.putMoney(1234, new BigDecimal("50.00"));
        safe.getMoney(1234, new BigDecimal("50.00"));

    }
}
