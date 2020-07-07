package student_aleksey_kodin.lesson11.level4.task_27;

import java.util.HashSet;
import java.util.Set;

class UniqueWordFinder {
    Set<String> find(String text) {
        final int START_FROM_FIRST_CHAR = 0;
        final int OFFSET_ONE_CHAR_AFTER_SPACE = 1;
        final int NO_MORE_SPACE_IN_TEXT = -1;

        Set<String> words = new HashSet<>();
        int start = START_FROM_FIRST_CHAR;

        while (start < text.length()) {
            int index = text.indexOf(" ", start);

            if (index == NO_MORE_SPACE_IN_TEXT) {
                index = text.length();
            }

            String getWords = text.substring(start, index);
            if (!getWords.equals("")) {
                words.add(getWords);
            }
            start = index + OFFSET_ONE_CHAR_AFTER_SPACE;
        }
        return words;
    }
}
