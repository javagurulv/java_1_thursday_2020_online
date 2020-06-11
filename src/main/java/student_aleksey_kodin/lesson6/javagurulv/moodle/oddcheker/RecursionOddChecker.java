package student_aleksey_kodin.lesson6.javagurulv.moodle.oddcheker;

class RecursionOddChecker {

    public static void main(String[] args) {

            RecursionChecker(0, 50);
    }

     static int RecursionChecker(int startNumber, int endNumber) {
     int count = startNumber;

        if (startNumber == endNumber) { return 0; }
            if (startNumber % 2 == 1) { System.out.println(startNumber); }
                count++;
     return  RecursionChecker(count, endNumber);
    }
}
