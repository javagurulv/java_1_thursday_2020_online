package student_igors_mihejevs.lesson_7.homework.level_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class WordService {

    public String findMostFrequentWord(String text) {
        String[] arrayOfWords = getArrayOfWordsFromString(text);
        String moreFrequentWord = null;
        int maxNumberOfRepetitions = 0;
        for (String wordOfArray : arrayOfWords) {
            int tempNumberOfRepetitions = countingSpecificWordInArray(arrayOfWords, wordOfArray);
            if (tempNumberOfRepetitions > maxNumberOfRepetitions) {
                maxNumberOfRepetitions = tempNumberOfRepetitions;
                moreFrequentWord = wordOfArray;
            }
        }
        return moreFrequentWord;
    }

    public String[] getArrayOfWordsFromString(String text) {
        return text.split(" ");
    }

    public int countingSpecificWordInArray(String[] arrOfWords, String wordForCounting) {
        int numberOfRepetitions = 0;
        for (String word : arrOfWords) {
            if (word.equals(wordForCounting))
                numberOfRepetitions++;
        }
        return numberOfRepetitions;
    }

}
