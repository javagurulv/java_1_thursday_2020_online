package student_alexander_bogachenkov.lesson7_04062020.homeworks.day_6.task_13;

import java.util.Arrays;

class Copy {

    int[] copyInRange(int[] in, int leftBound, int rightBound) {
        return Arrays.copyOfRange(in, leftBound, rightBound + 1);
    }

}
