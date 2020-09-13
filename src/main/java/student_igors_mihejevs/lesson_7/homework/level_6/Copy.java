package student_igors_mihejevs.lesson_7.homework.level_6;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "А где тесты?")
@CodeReviewComment(student = "Тесты в JUnit")
public class Copy {

    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int[] finalArray = new int[countingRangeOfFinalArray(in, numberFrom, numberTo)];
        int finalArrayCount = 0;
        for (int i : in) {
            if ((i >= numberFrom) && (i <= numberTo)) {
                finalArray[finalArrayCount] = i;
                finalArrayCount++;
            }
        }
        return finalArray;
    }

    private int countingRangeOfFinalArray(int[] in, int numberFrom, int numberTo) {
        int count = 0;
        for (int i : in) {
            if ((i >= numberFrom) && (i <= numberTo)) count++;
        }
        return count;
    }

}
