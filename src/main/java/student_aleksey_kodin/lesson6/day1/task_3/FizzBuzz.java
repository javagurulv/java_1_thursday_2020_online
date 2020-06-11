package student_aleksey_kodin.lesson6.day1.task_3;

class FizzBuzz {
    public String detect(int number) {
        if (divisionsToFifteen(number)) {
            return "FizzBuzz";
        } else if (divisionsToFive(number)) {
            return "Buzz";
        } else if (divisionsToThree(number)) {
            return "Fizz";
        }
    return Integer.toString(number);
    }
    private boolean divisionsToThree(int number) {
        return number % 3 == 0;
    }
    private boolean divisionsToFive(int number) {
        return number % 5 == 0;
    }
    private boolean divisionsToFifteen(int number) { return number % 15 == 0; }
}
