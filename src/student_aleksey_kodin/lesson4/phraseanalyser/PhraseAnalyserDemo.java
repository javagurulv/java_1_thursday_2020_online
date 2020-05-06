package student_aleksey_kodin.lesson4.phraseanalyser;

import java.util.Scanner;

public class PhraseAnalyserDemo {
    public static void main(String[] args) {

        System.out.println("Enter string:");
        String strInput = new Scanner(System.in).nextLine();

        System.out.println(new PhraseAnalyser().analyse(strInput));
    }
}
