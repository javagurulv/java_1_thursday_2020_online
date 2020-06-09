package student_julija_skopeca.practical_tasks.lesson_7.day_1.task_1;

class WordService {

    public static void main(String[] args) {
        WordService test = new WordService();
        String text = "one two two three three";
        test.findMostFrequentWord(text);
    }

    public void findMostFrequentWord(String text) {
        String[] words = text.split(" ");
        String maxWord = "", word = "";
        int maxCount = 0, count = 1;
        for (String s : words) {
            if (s.equals(word)) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    maxWord = word;
                }
              word = s;
                count = 1;
            }
        }
        if (count > maxCount) {
            maxWord = word;
            maxWord = word;
        }

        System.out.println(maxWord);
    }
}
