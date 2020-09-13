package student_igors_mihejevs.lesson_7.homework.level_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class WordServiceDemo {

    public static void main(String[] args) {
        WordService ws = new WordService();

        String mostFrequentWord = ws.findMostFrequentWord("one five two three five one five two two five");
        System.out.println("the most frequent word is " + mostFrequentWord);
    }

}
