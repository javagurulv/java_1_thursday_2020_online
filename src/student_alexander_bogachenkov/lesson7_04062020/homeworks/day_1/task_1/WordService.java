package student_alexander_bogachenkov.lesson7_04062020.homeworks.day_1.task_1;

class WordService {

    public static void main(String[] args) {
        WordService wordService = new WordService();
        String text = "word word word text text book book book";
        String result = wordService.findMostFrequentWord(text);
        System.out.println(result);
    }

    public String findMostFrequentWord(String text) {
        String[] words = text.split(" ");
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

    private int countRepetitions(String[] words, String wordToCount) {
        int sum = 0;
        for (String word : words) {
            if (word.equals(wordToCount)) {
                sum++;
            }
        }
        return sum;
    }

}