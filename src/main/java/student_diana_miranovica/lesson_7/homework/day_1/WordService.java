package student_diana_miranovica.lesson_7.homework.day_1;


 class WordService {

     public static void main(String[] args) {
         WordService test = new WordService();
         String text = "one two two three three";
         String testword = test.findMostFrequentWord(text);
         System.out.println(testword);
     }

     public String findMostFrequentWord(String text) {
         String[] words = text.split(" ");
         String maxWord = null;
         int maxCount = 0;
         for (String s : words) {
             int wordCount = wordsToCount(words, s);
             if (wordCount > maxCount) {
                 maxCount = wordCount;
                 maxWord = s;
             }
         }
         return maxWord;
     }


     public int wordsToCount(String[] wordsArray, String word) {
         int count = 0;
         for (String s : wordsArray) {
             if (s.equals(word)) {
                 count++;
             }
         }
         return count;
     }


 }