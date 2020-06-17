package student_dmitrijs_visuns.homeworks.lesson_7.day_6.task_13;

import java.util.ArrayList;
import java.util.List;


class Copy {

    int[] copyInRange (int[] in, int leftBound, int rightBound) {
        List<Integer> valuesBetweenBoundsList = new ArrayList();

        for (int i : in) {
            if ((i >= leftBound) && (i <= rightBound))
                valuesBetweenBoundsList.add(i);
        }


        int[] arrayWithValueBounds = new int[valuesBetweenBoundsList.size()];

        for (int i = 0; i < valuesBetweenBoundsList.size(); i++) {
            arrayWithValueBounds[i] = valuesBetweenBoundsList.get(i);
        }

        return arrayWithValueBounds;
    }
}
