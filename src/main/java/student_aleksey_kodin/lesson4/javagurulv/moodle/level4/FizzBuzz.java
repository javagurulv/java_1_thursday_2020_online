package student_aleksey_kodin.lesson4.javagurulv.moodle.level4;

class FizzBuzz {

    public static void main(String[] args) {
        byte byteFizzCount = 0;
        byte byteBuzzCount = 0;
        byte byteFizzBuzzCount = 0;

        for (byte byteCount = 1; byteCount <= 100; byteCount++) {

            if (byteCount % 3 == 0 && byteCount % 5 == 0) {
                byteFizzBuzzCount++;
                System.out.println("FizzBuzz");

            } else if (byteCount % 5 == 0) {
                byteBuzzCount++;
                System.out.println("Buzz");

            } else if (byteCount % 3 == 0) {
                byteFizzCount++;
                System.out.println("Fizz");

            } else {
                System.out.println(byteCount);
            }
        }
        System.out.println();
        System.out.println("Fizz (3) count - " + byteFizzCount);
        System.out.println("Buzz (5) count - " + byteBuzzCount);
        System.out.println("FizzBuzz (3 & 5) count - " + byteFizzBuzzCount);
    }
}