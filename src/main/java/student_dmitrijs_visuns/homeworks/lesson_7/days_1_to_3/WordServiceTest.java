package student_dmitrijs_visuns.homeworks.lesson_7.days_1_to_3;

class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest newTest = new WordServiceTest();
        newTest.splitTextIntoWordsTest();
        newTest.howManyTimesIsWordInText();
        newTest.findMostFrequentWordTest();
        newTest.bringWordsToLowercaseTest();
        newTest.splitTextWithUnevenSpacesTest();

    }

    public void splitTextIntoWordsTest() {
        WordService wordServiceTest = new WordService();
        String[] testArray = wordServiceTest.splitTextIntoWords("Blue blue green green");
        if ((testArray[0].equals("Blue")) && (testArray[3].equals ("green"))) {
            System.out.println("Split text into words and create array of words test - OK");
        } else {
            System.out.println("Split text into words and create array of words test - FAIL");
        }

    }


    public void howManyTimesIsWordInText() {
        WordService wordService = new WordService();
        String[] testArray = wordService.splitTextIntoWords("Blue blue green green");
        if (wordService.howManyTimesIsWordInText(testArray, "blue") == 2) {
            System.out.println("Find how many times is given word in text - OK");
        } else {
            System.out.println("Find how many times is given word in text - FAIL");
        }
    }


    public void findMostFrequentWordTest () {
        WordService wordService = new WordService();
       if (wordService.findMostFrequentWord("blue blue green green").equals("blue")) {
            System.out.println("Find Most Frequent Word Test - OK");
        } else {
            System.out.println("Find Most Frequent Word Test - FAIL");
        }

    }

    public void bringWordsToLowercaseTest () {
        WordService wordService = new WordService();
        if (wordService.findMostFrequentWord("Blue blue green green").equals("blue")) {
            System.out.println("Bring Words To Lowercase Test - OK");
        } else {
            System.out.println("Bring Words To Lowercase Test - FAIL");
        }

    }

    public void splitTextWithUnevenSpacesTest () {
        WordService wordService = new WordService();
        String[] testArray = wordService.splitTextIntoWords("Blue   blue green      green");
        if ((testArray[0].equals("Blue")) && (testArray[3].equals ("green"))) {
            System.out.println("Split text into words - text contains uneven spaces - OK");
        } else {
            System.out.println("Split text into words - text contains uneven spaces - FAIL");
        }

    }


}
