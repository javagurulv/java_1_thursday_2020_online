package student_igors_mihejevs.lesson_11.homework.level_4;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class UniqueWordFinder {

    Set<String> find(String text) {
        Set<String> finalSet = new HashSet<>();
        String[] arraySubString = text.split("\\s+");
        Collections.addAll(finalSet, arraySubString);
        return finalSet;
    }

}
