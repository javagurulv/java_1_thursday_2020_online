package student_igors_mihejevs.lesson_4.day_x;

class FizzBuzz {
    int initialNumber;

    public String detect(int number) {
        this.initialNumber = number;
        if (initialNumber % 3 == 0 && initialNumber % 5 == 0) return "FizzBuzz";
        else if (initialNumber % 3 == 0) return "Fizz";
        else if (initialNumber % 5 == 0) return "Buzz";
        else return "" + initialNumber; // Integer.toString(initialNumber);
    }

}
