package student_aleksey_kodin.lesson7.day1.task_3;

 class WordService {
     public String findMostFrequentWord(String text) {
         String[] textArray = convertStringToWordArray(text);

         int[] wordCountArray = new int[textArray.length];

         countEachWorld(wordCountArray, textArray);

      return textArray[getIndexMaxCount(wordCountArray)];
     }
     private String[] convertStringToWordArray(String text) {
         return  text.split(" ");
     }

     private void countEachWorld(int[] wordCountArray, String[] textArray) {
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
     }
     private int getIndexMaxCount(int[] wordCountArray) {
         int max = 0;
         int maxIndex = 0;
         for (int count = 0; count < wordCountArray.length; count++) {
             if (wordCountArray[count] >= max) {
                 max = wordCountArray[count];
                 maxIndex = count;
             }
         }
     return maxIndex;
     }
     public static void main(String[] args) {
         WordService wordService = new WordService();
         String result = wordService.findMostFrequentWord("Это текст просто текст просто просто");
         System.out.println(result);
     }
}
