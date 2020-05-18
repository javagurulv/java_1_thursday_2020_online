package student_aleksey_kodin.lesson4.dayx.supertask1;

class FizzBuzz {
    public String detect(int number) {
        if (divisionsToThree(number) && divisionsToFive(number)) {
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
}
