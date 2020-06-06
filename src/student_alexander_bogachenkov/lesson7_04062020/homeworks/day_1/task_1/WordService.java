package student_alexander_bogachenkov.lesson7_04062020.homeworks.day_1.task_1;

class WordService {

    public static void main(String[] args) {
        WordService wordService = new WordService();
        String text = "word word word text text book book book book";
        String result = wordService.findMostFrequentWord(text);
        System.out.println(result);
    }

    public String findMostFrequentWord(String text) {
        String[] splitted = text.split(" ");
        int max = 0;
        int count = 1;
        String word = splitted[0];
        String curr = splitted[0];
        for (int i = 1; i < splitted.length; i++) {
            if (splitted[i].equals(curr)) {
                count++;
            } else {
                count = 1;
                curr = splitted[i];
            }
            if (max < count) {
                max = count;
                word = splitted[i];
            }
        }
        return word;
    }

}