package student_aleksey_kodin.lesson6.javagurulv.moodle.oddcheker;

public class WhileOddChecker {

    public static void main(String[] args) {
        byte count = 0;

        while (count <= 50) {
            if (count % 2 == 1) System.out.println(count);
        count++;
        }
    }
}
