package student_vadim_sokolenko.lesson5Code;

class NumberService {


    int sumOfEvenNumbersInRange(int from, int to){
        int sum = 0;
        while (from<= to){
            if (from % 2 == 0){
                sum += from;
            }
            from++;
        }
        return sum;
    }
}
