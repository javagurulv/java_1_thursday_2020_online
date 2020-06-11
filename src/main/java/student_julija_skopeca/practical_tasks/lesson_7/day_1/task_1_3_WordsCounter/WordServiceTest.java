package student_julija_skopeca.practical_tasks.lesson_7.day_1.task_1_3_WordsCounter;

class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest ();
        test.findMostFrequentWordTest ();
    }

    public void findMostFrequentWordTest () {
        WordService wordService = new WordService();
        String text = "one two two three three";
        String result = wordService.findMostFrequentWord(text);
        if (result.equals("two")) {
            System.out.println("findMostFrequentWordTest - OK");
        } else {
            System.out.println("findMostFrequentWordTest - FAIL");
        }
    }
}
