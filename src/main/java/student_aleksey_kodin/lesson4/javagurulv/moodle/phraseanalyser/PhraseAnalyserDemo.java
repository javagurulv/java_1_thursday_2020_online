package student_aleksey_kodin.lesson4.javagurulv.moodle.phraseanalyser;

import java.util.Scanner;

class PhraseAnalyserDemo {
    public static void main(String[] args) {

        System.out.println("Enter string:");
        String strInput = new Scanner(System.in).nextLine();

        System.out.println(new PhraseAnalyser().analyse(strInput));
    }
}
