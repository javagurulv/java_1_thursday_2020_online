package student_igors_mihejevs.lesson_7.homework.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class WordService {

    public String findMostFrequentWord(String text) {
        String[] arrayOfWords = getArrayOfWordsFromString(text);
        return getCountedWordFromComparing(arrayOfWords);
    }

    public String[] getArrayOfWordsFromString(String text) {
        return text.split(" ");
    }

    public String getCountedWordFromComparing(String[] arrayOfWords) {
        String mostFrequentWord = null;
        int maxNumberOfRepetitions = 0;
        for (String wordOfArray : arrayOfWords) {
            int tempNumberOfRepetitions = countingSpecificWordInArray(arrayOfWords, wordOfArray);
            if (tempNumberOfRepetitions > maxNumberOfRepetitions) {
                maxNumberOfRepetitions = tempNumberOfRepetitions;
                mostFrequentWord = wordOfArray;
            }
        } return mostFrequentWord;
    }

    public int countingSpecificWordInArray(String[] arrayOfWords, String wordForCounting) {
        int numberOfRepetitions = 0;
        for (String word : arrayOfWords) {
            if (word.equals(wordForCounting)) numberOfRepetitions++;
        }
        return numberOfRepetitions;
    }

}
