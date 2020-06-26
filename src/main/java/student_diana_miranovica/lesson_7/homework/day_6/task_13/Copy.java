package student_diana_miranovica.lesson_7.homework.day_6.task_13;

import java.util.Arrays;

class Copy {
     int[] copyInRange(int[] in, int leftBound, int rightBound){
         return Arrays.copyOfRange(in, leftBound,rightBound+1);
     }
}
