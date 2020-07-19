package student_aleksey_kodin.lesson12.level4.task_25;

import java.util.ArrayList;
import java.util.List;

class OutOfMemoryError {

    public static void main(String[] args) {
        List<Object> outOfMemoryErrors = new ArrayList<>();
        for (; ; ) {
            outOfMemoryErrors.add(new Object[10000]);
        }
    }
}
