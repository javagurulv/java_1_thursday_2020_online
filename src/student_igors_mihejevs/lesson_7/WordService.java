package student_igors_mihejevs.lesson_7;

class WordService {

    public static void main(String[] args) {
        WordService ws = new WordService();

        String mostFrequentWord = ws.findMostFrequentWord("one five two three five one five two two five");
        System.out.println("the most frequent word is " + mostFrequentWord);

    }

    public String findMostFrequentWord(String text) {
        System.out.println("From string : " + text);
        String[] arrOfWords = getArrayOfWords(text);
        //System.out.println(Arrays.toString(arrOfWords));
        String finalWord = null;
        int maxSum = 0;
        for (String word : arrOfWords) {
            int tempSum = countOfEqualWord(arrOfWords, word);
            if (tempSum > maxSum) {
                maxSum = tempSum;
                finalWord = word;
            }
        }
        return finalWord;
    }

    public String[] getArrayOfWords(String text) {
        return text.split(" ");
    }

    public int countOfEqualWord(String[] arrOfWords, String wordForCheck) {
        int sum = 0;
        for (String word : arrOfWords) {
            if (word.equals(wordForCheck))
                sum++;
        }
        return sum;
    }

}
