package student_alexander_bogachenkov.lesson7_04062020.homeworks.day_1.task_2;

class WordService {

    public String findMostFrequentWord(String text) {
        String[] words = splitByWord(text);
        String resultWord = null;
        int max = 0;
        for (String word : words) {
            int repetitions = countRepetitions(words, word);
            if (repetitions > max) {
                max = repetitions;
                resultWord = word;
            }
        }
        return resultWord;
    }

    public int countRepetitions(String[] words, String wordToCount) {
        int sum = 0;
        for (String word : words) {
            if (word.equals(wordToCount)) {
                sum++;
            }
        }
        return sum;
    }

    public String[] splitByWord(String text) {
        return text.split(" ");
    }

}