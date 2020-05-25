package student_alexander_bogachenkov.lesson4_14052020.homeworks.day_x.super_task_1;

class FizzBuzz {

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(-10);
        System.out.println(result);
    }

    public String detect(int number) {
        int fizzResidue = number % 3;
        int buzzResidue = number % 5;
        if ((fizzResidue == 0) && (buzzResidue == 0)) {
            return "FizzBuzz";
        } else if (fizzResidue == 0) {
            return "Fizz";
        } else if (buzzResidue == 0) {
            return "Buzz";
        } else {
            return "" + number;
        }
    }

}
