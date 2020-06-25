package student_aleksey_kodin.lesson7.day3.task_7;

class WordService {
    public String findMostFrequentWord(String text) {
        String[] textArray = convertStringToWordArray(text);
        int[] wordCountArray = new int[textArray.length];
        countEachWorld(wordCountArray, textArray);
        return textArray[getIndexMaxCount(wordCountArray)];
    }

    private String[] convertStringToWordArray(String text) {
        return text.split(" ");
    }

    private void countEachWorld(int[] wordCountArray, String[] textArray) {
        for (int i = 0; i < textArray.length; i++) {
            wordCountArray[i] = countWordQuantity(textArray, i);
        }
    }

    private int countWordQuantity(String[] textArray, int wordNumber) {
        int quantityWordsInString = 0;
        for (String s : textArray) {
            quantityWordsInString = isWordsEqualIncreaseCounter(quantityWordsInString, wordNumber, textArray, s);
        }
        return quantityWordsInString;
    }

    private int isWordsEqualIncreaseCounter(int quantityWordsInString, int wordIndex, String[] textArray, String word) {
        if (textArray[wordIndex].equals(word)) {
            quantityWordsInString++;
        }
        return quantityWordsInString;
    }

    private int getIndexMaxCount(int[] wordCountArray) {
        int maxValue = 0;
        int maxIndex = 0;
        for (int i = 0; i < wordCountArray.length; i++) {
            if (isArrayElementMoreThanMax(wordCountArray[i], maxValue)) {
                maxValue = setMaxValue(wordCountArray[i]);
                maxIndex = setMaxIndexEqualCurrentIndex(i);
            }
        }
        return maxIndex;
    }

    private int setMaxIndexEqualCurrentIndex(int index) {
        return index;
    }

    private int setMaxValue(int arrayElement) {
        return arrayElement;
    }

    private boolean isArrayElementMoreThanMax(int arrayElement, int maxValue) {
        return arrayElement >= maxValue;
    }

    public static void main(String[] args) {
        WordService wordService = new WordService();
        String result = wordService.findMostFrequentWord("Это текст просто текст просто просто");
        System.out.println(result);
    }
}
