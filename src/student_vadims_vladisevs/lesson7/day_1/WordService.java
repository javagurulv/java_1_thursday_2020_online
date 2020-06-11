package student_vadims_vladisevs.lesson7.day_1;

class WordService {


    public String findMostFrequentWord(String text) {
        String[] wordArray = textToWordArray(text);
        return findWord(wordArray);
    }


    public String[] textToWordArray(String text){
        return text.split("\\W+");
    }

    public String findWord(String[] wordArray){
        String word = null;
        int maxCount = 0;

        for (String temp : wordArray) {
            int count = 0;
            for (String value : wordArray) {
                if (temp.equals(value)) {
                    count++;
                }
                if (count > maxCount) {
                    word = temp;
                    maxCount = count;
                }
            }
        }
        return word;
    }


}