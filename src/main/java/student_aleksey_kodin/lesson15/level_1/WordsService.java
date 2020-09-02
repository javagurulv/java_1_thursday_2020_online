package student_aleksey_kodin.lesson15.level_1;

class WordsService {
    public int countRepetitions(String[] words, String entryTextForWordsRepeatCount) {
        int numberRepeatWord = 0;
        for (String word : words) {
            if (word.equals(entryTextForWordsRepeatCount)) {
                numberRepeatWord++;
            }
        }
        return numberRepeatWord;
    }
}
