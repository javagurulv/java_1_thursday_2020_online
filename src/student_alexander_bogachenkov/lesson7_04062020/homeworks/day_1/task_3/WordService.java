package student_alexander_bogachenkov.lesson7_04062020.homeworks.day_1.task_3;

class WordService {

    public String findMostFrequentWord(String text) {
        String[] splitted = splitTextInArray(text);
        return findMostFrequentWordInSplittedText(splitted);
    }

    public String findMostFrequentWordInSplittedText(String[] splitted) {
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

    public String[] splitTextInArray(String text) {
        String[] splitted = text.split(" ");
        return splitted;
    }

}