package student_aleksey_kodin.lesson16.level_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class WaterCounter {

    public int countWaterQuantity(int[] entry) {
        int waterQuantity = 0;
        int maxLeftSide = 0;
        int maxRightSide = 0;
        int indexLow = 0;
        int indexHigh = entry.length - 1;

        while (indexLow <= indexHigh) {
            if (entry[indexLow] < entry[indexHigh]) {
                if (entry[indexLow] > maxLeftSide) {
                    maxLeftSide = entry[indexLow];
                } else {
                    waterQuantity += maxLeftSide - entry[indexLow];
                }
                indexLow++;
            } else {
                if (entry[indexHigh] > maxRightSide) {
                    maxRightSide = entry[indexHigh];
                } else {
                    waterQuantity += maxRightSide - entry[indexHigh];
                }
                indexHigh--;
            }
        }
        return waterQuantity;
    }
}
