package student_julija_skopeca.practical_tasks.lesson_7.level_6.task_13;

import java.util.Arrays;

class Copy {

    int[] copyInRange(int[] in, int leftBound, int rightBound) {
        int [] out = new int[0];
        int i = 1;
        for (int arrayElements : in) {
            if((arrayElements >= leftBound)&&(arrayElements <= rightBound)){
                out = Arrays.copyOf(out, i);
                out[i-1] = arrayElements;
                i++;
            }
        }

        return out;
    }
}
