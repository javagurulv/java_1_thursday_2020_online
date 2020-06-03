package student_vadim_sokolenko.Lesson6Code;

public class WhileExample2 {

    public static void main(String[] args) {

        int number = 0;
        int sum = 0;
        while (sum < 100){
            sum = sum + number;
            number++;
            System.out.println("Sum =" + sum);
        }

    }
}
