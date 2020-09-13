package student_igors_mihejevs.lesson_7.homework.level_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest wst = new WordServiceTest();

        wst.shouldReturnArrayOfWords();
        wst.shouldReturnCountOfOneWordFromString();
        wst.shouldFindMostFrequentWord();
    }

    public void shouldReturnArrayOfWords() {
        WordService ws = new WordService();
        String testString = "one five two three five one five two two five";
        //System.out.println(Arrays.toString(ws.getArrayOfWords(testString)));
        if (ws.getArrayOfWordsFromString(testString).length == 10)
            System.out.println("Test of creating of array of words - OK");
        else System.out.println("Test of creating off array of words - FAIL");
    }

    public void shouldReturnCountOfOneWordFromString() {
        WordService ws = new WordService();
        String testString = "one five two three five one five two two five";

        if (ws.countingSpecificWordInArray(ws.getArrayOfWordsFromString(testString), "five") == 4)
            System.out.println("Test of returning count of word - OK");
        else System.out.println("Test of returning count of word - FAIL");
    }

    public void shouldFindMostFrequentWord() {
        WordService ws = new WordService();
        String testString = "one five two three five one five two two five";

        //String testWord = ws.findMostFrequentWord(testString);

        //System.out.println(testWord);
        if (ws.findMostFrequentWord(testString).equals("five"))
            System.out.println("Test of finding the most frequent word - OK");
        else System.out.println("Test of finding the most frequent word - FAIL");
    }

}
