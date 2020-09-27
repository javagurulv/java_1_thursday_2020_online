package student_vadims_vladisevs.lesson_15.level_1;

class WordsService {

    public int countRepetitions(String[] words, String repeatingWord) {
        int repetitions = 0;
        for (String word : words) {
            if (word.equals(repeatingWord)) {
                repetitions++;
            }
        }
        return repetitions;
    }

}
