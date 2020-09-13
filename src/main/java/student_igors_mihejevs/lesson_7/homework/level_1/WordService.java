package student_igors_mihejevs.lesson_7.homework.level_1;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class WordService {

    public String findMostFrequentWord(String text) {
        String[] arrOfWords = getArrayOfWords(text);
        String finalWord = null;
        int maxSum = 0;
        for (String word : arrOfWords) {
            int tempSum = countOfEqualWord(arrOfWords, word);
            if (tempSum > maxSum) {
                maxSum = tempSum;
                finalWord = word;
            }
        }
        return finalWord;
    }

    @CodeReviewComment(teacher = "Must be private, not visible for other classes. This is internal method.")
    @CodeReviewComment(student = "If it will be private, how I'll test it ?")
    String[] getArrayOfWords(String text) {
        return text.split(" ");
    }

	@CodeReviewComment(teacher = "Must be private, not visible for other classes. This is internal method.")
    @CodeReviewComment(student = "If it will be private, how I'll test it ?")
    int countOfEqualWord(String[] arrOfWords, String wordForCheck) {
        int sum = 0;
        for (String word : arrOfWords) {
            if (word.equals(wordForCheck))
                sum++;
        }
        return sum;
    }

}
