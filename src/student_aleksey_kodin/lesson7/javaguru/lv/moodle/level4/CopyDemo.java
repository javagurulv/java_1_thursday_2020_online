package student_aleksey_kodin.lesson7.javaguru.lv.moodle.level4;

import java.util.Arrays;

class CopyDemo {

    public static void main(String[] args) {
        int[] a1 = {40, 75, 23, 36, 87, 95, 54, 11, 62};

        Copy copy = new Copy();
        int[] out = copy.copyInRange(a1,30,75);

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(out));
    }
}
