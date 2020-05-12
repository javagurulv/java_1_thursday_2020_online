package student_aleksey_kodin.lesson4.dayx.supertask1;

public class FizzBuzz {
    public String detect(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        }
    return Integer.toString(number);
    }
}
