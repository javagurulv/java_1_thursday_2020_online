package student_aleksey_kodin.lesson4.javagurulv.moodle.signcomparator;

public class SignComparatorDemo {

    public static void main(String[] args) {
        SignComparator clsSignComparator = new SignComparator();

        System.out.println(clsSignComparator.compare(5));
        System.out.println(clsSignComparator.compare(-5));
        System.out.println(clsSignComparator.compare(0));

    }
}