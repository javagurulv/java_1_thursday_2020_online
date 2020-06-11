package student_alexander_bogachenkov.lesson6_28052020.homeworks.day_1.task_3;

class FizzBuzz {

    public String detect(int number) {
        if (isFizz(number) && isBuzz(number)) return "FizzBuzz";
        else if (isFizz(number)) return "Fizz";
        else if (isBuzz(number)) return "Buzz";
        else return "" + number; // Integer.toString(initialNumber);
    }

    public boolean isFizz(int number) {
        return number % 3 == 0;
    }

    public boolean isBuzz(int number) {
        return number % 5 == 0;
    }
}