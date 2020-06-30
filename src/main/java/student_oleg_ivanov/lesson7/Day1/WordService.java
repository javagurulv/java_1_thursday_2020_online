package student_oleg_ivanov.lesson7.Day1;

class WordService {

    public String findMostFrequentWord(String text) {
        String[] wordArray = textWordArray(text);
        return findWord(wordArray);
    }

    public String[] textWordArray(String text) {
        return text.split("\\W+");
    }
    public String findWord(String[] wordArray) {
        String finalWord = null;
        int maxSum = 0;

        for (String temp : wordArray) {
            int count = 0;
            for (String value : wordArray) {
                if (temp.equals(value)) {
                    count++;
                }
                if (count > maxSum) {
                    finalWord = temp;
                    maxSum = count;
                }
            }
        }
        return finalWord;
    }

}
