package student_dmitrijs_visuns.homeworks.lesson_7.day_1;

class WordService {

    public String findMostFrequentWord(String text) {
        String[] wordsFromTheText = text.split("\\s+");
        String mostFrequentWord = null;
        int mostTimesInText = 0;
        int timesInText = 0;
        for (String word : wordsFromTheText) {
            for (int i = 0; i < wordsFromTheText.length; i++) {
                if (word.toLowerCase().equals(wordsFromTheText[i])) {
                    timesInText++;
                }
            }
            if (timesInText > mostTimesInText) {
                mostTimesInText = timesInText;
                mostFrequentWord = word;
            }
        }
        return mostFrequentWord;

    }

}
