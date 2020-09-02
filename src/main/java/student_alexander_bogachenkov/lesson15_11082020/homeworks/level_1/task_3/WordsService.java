package student_alexander_bogachenkov.lesson15_11082020.homeworks.level_1.task_3;

class WordsService {

    public int countRepetitions(String[] words, String wordToCountForRepetition) {
        int repetitionSum = 0;
        for (String word : words) {
            if (word.equals(wordToCountForRepetition)) {
                repetitionSum++;
            }
        }
        return repetitionSum;
    }

}