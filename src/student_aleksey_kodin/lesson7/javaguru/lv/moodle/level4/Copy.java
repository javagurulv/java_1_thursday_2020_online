package student_aleksey_kodin.lesson7.javaguru.lv.moodle.level4;

import java.util.Arrays;

class Copy {

    public int[] copyInRange(int[] in, int leftBound, int rightBound) {
        int[] arrayNewRange = new int[0];
        int arrayNewRangeCount = 1;

        for (int arrayElement : in) {
            if ((arrayElement >= leftBound) && (arrayElement <= rightBound)) {
                if (arrayNewRange.length < arrayNewRangeCount) {
                    arrayNewRange = Arrays.copyOf(arrayNewRange, arrayNewRangeCount);
                    arrayNewRange[arrayNewRangeCount - 1] = arrayElement;
                    arrayNewRangeCount++;
                }
            }
        }
    return arrayNewRange;
    }
}
