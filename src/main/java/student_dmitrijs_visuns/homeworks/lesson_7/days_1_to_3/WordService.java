package student_dmitrijs_visuns.homeworks.lesson_7.days_1_to_3;

class WordService {

    public String findMostFrequentWord(String text) {
        String resultWord = checkIsThisWordMostFrequent (splitTextIntoWords(text));
        return resultWord;
    }

    public String[] splitTextIntoWords(String text) {
        return text.split("\\s+");
    }


    public String checkIsThisWordMostFrequent(String[] splitTextIntoWords) {
        String mostFrequentWord = null;
        int mostTimesInText = 0;
        for (String word : splitTextIntoWords) {
            int timesIsWordInText = howManyTimesIsWordInText(splitTextIntoWords, word);
            if (timesIsWordInText > mostTimesInText) {
                mostTimesInText = timesIsWordInText;
                mostFrequentWord = word;
            }
        }
            return mostFrequentWord;

    }

    public int howManyTimesIsWordInText(String[] splitTextIntoWords, String wordToCompare) {
        int timesInText = 0;
        for (String word : splitTextIntoWords) {
            if (word.toLowerCase().equals(wordToCompare)) {
                timesInText++;
            }
        }
        return timesInText;
    }







}



