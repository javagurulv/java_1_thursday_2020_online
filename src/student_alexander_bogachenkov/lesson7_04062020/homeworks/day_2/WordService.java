package student_alexander_bogachenkov.lesson7_04062020.homeworks.day_2;

class WordService {

    public String findMostFrequentWord(String text) {
        String[] words = splitTextByWord(text);
        String resultWord = null;
        int max = 0;
        for (String word : words) {
            int repetitions = countWordRepetitions(words, word);
            if (repetitions > max) {
                max = repetitions;
                resultWord = word;
            }
        }
        return resultWord;
    }

    private int countWordRepetitions(String[] words, String wordToCount) {
        int sum = 0;
        for (String word : words) {
            if (word.equals(wordToCount)) {
                sum++;
            }
        }
        return sum;
    }

    private String[] splitTextByWord(String text) {
        return text.split(" ");
    }

}