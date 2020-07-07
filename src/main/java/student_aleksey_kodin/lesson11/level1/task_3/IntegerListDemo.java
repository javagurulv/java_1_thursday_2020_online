package student_aleksey_kodin.lesson11.level1.task_3;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {

    private void listOperation() {
        List<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        // Add to end
        integers.add(6); // result -> 1,2,3,4,5,6
        // Add to start
        integers.add(0, 0); // result -> 0,1,2,3,4,5,6
        //Check list size
        int size = integers.size(); // result -> 7
        // Remove index 3
        integers.remove(3); // result -> 0,1,2,4,5,6
        integers.add(55);
        // Remove value 55
        integers.removeIf(i -> i == 55);
        // Return true if list is empty, another false
        boolean result = integers.isEmpty(); // result -> false
        // Print to console
        integers.forEach(System.out::println);
    }
}
