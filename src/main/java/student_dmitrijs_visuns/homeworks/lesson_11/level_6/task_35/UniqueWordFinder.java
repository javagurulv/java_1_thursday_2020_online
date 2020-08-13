package student_dmitrijs_visuns.homeworks.lesson_11.level_6.task_35;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordFinder {

    public Set<String> find (String text) {
        Set<String> uniqueWords = new HashSet<>();
        for (String word : splitTextIntoWords(text)) {
            uniqueWords.add(word.toLowerCase());
        } return uniqueWords;
    }

    private String[] splitTextIntoWords(String text) {
        return text.split("\\s+");
    }


}
