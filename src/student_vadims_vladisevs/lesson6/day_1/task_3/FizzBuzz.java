package student_vadims_vladisevs.lesson6.day_1.task_3;

class FizzBuzz {



    public String detect(int number) {

        boolean isDividedByThree = (number % 3 == 0);
        boolean isDividedByFive = (number % 5 == 0);

        if (isDividedByThree && !isDividedByFive){
            return "Fizz";
        }
        else if (!isDividedByThree && isDividedByFive){
            return "Buzz";
        }
        else if (isDividedByThree && isDividedByFive){
            return "FizzBuzz";
        }
        else {
            return "" + number;
        }
    }

}