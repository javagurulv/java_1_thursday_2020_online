package student_aleksey_kodin.lesson16.level_5.usehashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class TwoSumV2Impl implements student_aleksey_kodin.lesson16.level_5.TwoSum {

    @Override
    public List<Integer> sum(int[] valueList, int target) {
        HashMap<Integer, Integer> enterMap = new HashMap<>();
        List<Integer> indexFoundDigits = new ArrayList<>();

        for (int i = 0; i < valueList.length; i++) {
            if (enterMap.containsKey(getDifference(valueList[i], target))) {
                indexFoundDigits.add(enterMap.get(getDifference(valueList[i], target)));
                indexFoundDigits.add(i);
                break;
            } else {
                enterMap.put(valueList[i], i);
            }
        }
        return indexFoundDigits;
    }

    private int getDifference(int arrayElement, int target) {
        return target - arrayElement;
    }
}
