package student_julija_skopeca.practical_tasks.lesson_6.day_1.task_3_FizzBuzz;

class FizzBuzz {

        public String detect(int number) {

        if ((number % 3 == 0) && (number % 5 == 0)) return "FizzBuzz";
        else if (number % 3 == 0) return "Fizz";
        else if (number % 5 == 0) return "Buzz";
        else return "" + number;
    }
}
