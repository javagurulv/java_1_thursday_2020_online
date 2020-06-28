package student_julija_skopeca.practical_tasks.lesson_8.task_6;

import java.util.Arrays;

class Calculator {

        public static void main(String... sss) {
            Calculator calculator = new Calculator();
            int sum = calculator.sum(1,10,12,234,624,12,8);
        }
        int sum(int... numbers){
            return Arrays.stream(numbers).sum();
        }

}
