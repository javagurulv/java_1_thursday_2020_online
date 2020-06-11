package student_aleksey_kodin.lesson4.javagurulv.moodle.signcomparator;

class SignComparator {

    public String compare(int number) {

        if (number > 0) {
            return "Number is positive";
        } else if (number < 0) {
            return "Number is negative";
        } else {
            return "Number is equal to zero";
        }
    }
}
