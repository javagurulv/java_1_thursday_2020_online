package student_dmitrijs_visuns.homeworks.lesson_7;

class WordServiceDemo {

    public static void main(String[] args) {
        WordServiceDemo demo = new WordServiceDemo();
        demo.findMostFrequentWordTest();

    }

    public void findMostFrequentWordTest () {
        WordService test = new WordService();
       if (test.findMostFrequentWord("Blue blue green green").equals("blue")) {
            System.out.println("Find Most Frequent Word Test - OK");
        } else {
            System.out.println("Find Most Frequent Word Test - FAIL");
        }

    }


}
