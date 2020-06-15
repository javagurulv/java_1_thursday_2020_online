package student_vadims_vladisevs.lesson7.day_2_3;

class WordService {


    public String findMostFrequentWord(String text) {
        String[] wordArray = transformTextToWordArray(text);
        return findWord(wordArray);
    }


    public String[] transformTextToWordArray(String text){
        return text.split("\\W+");
    }

    public String findWord(String[] wordArray){
        String mostFrequentWord = null;
        int maxDuplicates = 0;

        for (String temp : wordArray) {
            int duplicatesCount = 0;
            for (String value : wordArray) {
                if (temp.equals(value)) {
                    duplicatesCount++;
                }
                if (duplicatesCount > maxDuplicates) {
                    mostFrequentWord = temp;
                    maxDuplicates = duplicatesCount;
                }
            }
        }
        return mostFrequentWord;
    }

}