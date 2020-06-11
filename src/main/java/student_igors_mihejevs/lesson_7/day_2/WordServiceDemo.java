package student_igors_mihejevs.lesson_7.day_2;

public class WordServiceDemo {

    public static void main(String[] args) {
        WordService ws = new WordService();

        String mostFrequentWord = ws.findMostFrequentWord("one five two three five one five two two five");
        System.out.println("the most frequent word is " + mostFrequentWord);
    }

}
