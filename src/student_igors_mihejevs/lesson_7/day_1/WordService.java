package student_igors_mihejevs.lesson_7.day_1;

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

    public String[] getArrayOfWords(String text) {
        return text.split(" ");
    }

    public int countOfEqualWord(String[] arrOfWords, String wordForCheck) {
        int sum = 0;
        for (String word : arrOfWords) {
            if (word.equals(wordForCheck))
                sum++;
        }
        return sum;
    }

}
