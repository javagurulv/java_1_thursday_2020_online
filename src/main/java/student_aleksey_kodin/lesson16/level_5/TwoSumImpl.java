package student_aleksey_kodin.lesson16.level_5;

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TwoSumImpl implements TwoSum {

    @Override
    public List<Integer> sum(int[] valueList, int target) {
        List<Integer> indexFoundDigits = new ArrayList<>();

        for (int i = 0; i < valueList.length; i++) {
            for (int j = i + 1; j < valueList.length; j++) {
                if (isTargetFound(valueList[i], valueList[j], target)) {
                    indexFoundDigits.add(i);
                    indexFoundDigits.add(j);
                    return indexFoundDigits;
                }
            }
        }
        return indexFoundDigits;
    }

    private Boolean isTargetFound(int firstValue, int secondValue, int target) {
        return firstValue + secondValue == target;
    }
}
