package student_igors_mihejevs.lesson_7.homework.level_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class PowerCalculatorDemo {

    public static void main(String[] args) {
        PowerCalculator powerCalculator = new PowerCalculator();
        System.out.println("The exponentiation result = " +
                powerCalculator.exponentiation(2, -5));
    }

}
