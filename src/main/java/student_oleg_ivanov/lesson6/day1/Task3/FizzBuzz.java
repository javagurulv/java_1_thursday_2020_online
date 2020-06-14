package student_oleg_ivanov.lesson6.day1.Task3;

class FizzBuzz {
    private int initialNumber; // зачем тут это свойство?

    public String detect(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) return "FizzBuzz";
        if (number % 3 == 0) return "Fizz";
        if (number % 5 == 0) return "Buzz";
        else return "" + number; // Integer.toString(initialNumber);
    }
}
