package student_vadims_vladisevs.lesson_11.level_4.task_27;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class UniqueWordFinder {

    Set<String> find(String text){
        Set<String> list = new HashSet<>();
        Collections.addAll(list, transformTextToWordArray(modifyText(text)));
        return list;
    }

    public String modifyText(String text){
        return text.toLowerCase();
    }

    public String[] transformTextToWordArray(String text){
        return text.split("\\W+");
    }
}
