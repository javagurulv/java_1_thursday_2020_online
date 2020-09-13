package student_igors_mihejevs.lesson_11.homework.level_1.task_1;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ListImpl {

    /* ArrayList
    Java ArrayList class uses a dynamic array for storing the elements.
    It is like an array, but there is no size limit.
    We can add or remove elements anytime. So, it is much more flexible than the traditional array.
    It is found in the java.util package.

    LinkedList
    A LinkedList is a linear data structure, in which the elements are not stored at contiguous memory locations.
    The elements in a linked list are linked using pointers.
    In simple words, a linked list consists of nodes where each node contains a data field
    and a reference(link) to the next node in the list.

    CopyOnWriteArrayList
    It is enhanced version of ArrayList in which all modifications (add, set, remove, etc)
    are implemented by making a fresh copy.

    Vector
    Vector is similar with ArrayList, but it is synchronized.
    ArrayList is a better choice if your program is thread-safe.
    Vector and ArrayList require space as more elements are added.
    Vector each time doubles its array size, while ArrayList grow 50% of its size each time.

    Stack
    */

    List<Integer> numberAL = new ArrayList<>();
    List<Integer> numberLL = new LinkedList<>();
    List<Integer> numberV = new Vector<>();
    List<Integer> numberS = new Stack<>();
    List<Integer> numberCOWAL = new CopyOnWriteArrayList<>();

}
