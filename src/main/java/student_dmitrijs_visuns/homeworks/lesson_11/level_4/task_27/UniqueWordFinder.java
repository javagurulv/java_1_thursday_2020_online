package student_dmitrijs_visuns.homeworks.lesson_11.level_4.task_27;

import java.util.*;

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
