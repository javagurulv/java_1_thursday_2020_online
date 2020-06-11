package student_aleksey_kodin.lesson6.javagurulv.moodle.oddcheker;

class DoWhileOddChecker {

    public static void main(String[] args) {
        byte count = 0;

        do {
            if (count % 2 == 1) System.out.println(count);
            count++;
        } while (count <= 50);
    }
}
