package student_igors_mihejevs.lesson_11.homework.level_1.task_2;

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Task_2 {

    /*
    An ArrayList can hold only references to the location of objects in the Heap.
    We can use primitive types of data through wrapped classes.
    Wrapper classes are those whose objects wraps a primitive data type within them.
    In the java.lang package java provides a separate class for each of the primitive data types
    namely Byte, Character, Double, Integer, Float, Long, Short.
    At the time of instantiation, these classes accept a primitive datatype directly, or in the form of String.
    Wrapper classes provide methods to, convert primitive data types within them to String objects and,
    to compare them with other objects etc.
    Using wrapper classes, you can also add primitive data types
    to various Collection objects such as ArrayList
     */

    public static void main(String[] args) {
        Integer numberI = Integer.parseInt("6");
        List<Integer> numberAL = new ArrayList<>();

        numberAL.add(5);
        numberAL.add(7);
        numberAL.add(9);
        numberAL.add(0, numberI);
        numberAL.add(Integer.parseInt("3"));
    }

}
