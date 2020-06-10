package student_igors_mihejevs.lesson_7.day_3;

public class WordServiceDemo {

    public static void main(String[] args) {
        WordService wordService = new WordService();

        String mostCommonWord = wordService.findMostFrequentWord("one five two three five one five two two five");
        System.out.println("The most frequent word is " + mostCommonWord);
    }

}
