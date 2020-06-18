package student_vadims_vladisevs.lesson7.day_x.super_task_7;

class WordService {

    public String findMostFrequentWord(String text) {
        String[] textArray = convertStringToWordArray(text);
        int[] wordCountArray = wordCountArray(textArray);
        return findWord(wordCountArray, textArray);
    }

        private String[] convertStringToWordArray (String text){
            return text.split(" ");
    }

        private int[] wordCountArray (String[]textArray){
            int[] wordCountArray = new int[textArray.length];
            int wordCounter = 0;
            for (int wordCount = 0; wordCount < textArray.length; wordCount++) {
                for (String s : textArray) {
                    if (textArray[wordCount].equals(s)) {
                        wordCounter++;
                    }
                }
                wordCountArray[wordCount] = wordCounter;
                wordCounter = 0;
            }
            return wordCountArray;
        }

        private String findWord ( int[] wordCountArray, String[] textArray){
            int max = 0;
            for (int count = 0; count < wordCountArray.length; count++) {
                if (wordCountArray[count] > max) {
                    max = count;
                }
            }
            return textArray[max];
        }

}

