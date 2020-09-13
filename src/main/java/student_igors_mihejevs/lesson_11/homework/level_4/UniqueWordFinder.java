package student_igors_mihejevs.lesson_11.homework.level_4;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class UniqueWordFinder {

    Set<String> find(String text) {
        Set<String> finalSet = new HashSet<>();
        Collections.addAll(finalSet, text.split("\\s+"));
        return finalSet;
    }

}
