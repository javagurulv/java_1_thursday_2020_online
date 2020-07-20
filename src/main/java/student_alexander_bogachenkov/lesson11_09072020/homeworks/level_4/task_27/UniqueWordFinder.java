package student_alexander_bogachenkov.lesson11_09072020.homeworks.level_4.task_27;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class UniqueWordFinder {

    Set<String> find(String text) {
        Set<String> allUniqueWords = new HashSet<>();
        String lowercased = text.toLowerCase();
        String[] words = lowercased.split(" ");
        Collections.addAll(allUniqueWords, words);
        return allUniqueWords;
    }

}
