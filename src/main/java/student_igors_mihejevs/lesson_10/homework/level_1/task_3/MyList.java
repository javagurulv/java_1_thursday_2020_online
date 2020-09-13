package student_igors_mihejevs.lesson_10.homework.level_1.task_3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface MyList {

    int[] createList(); // создать список

    int[] deleteList(); // удалить список

    void printListToConsole(int[] array); // распечатать список

    int findMaxNumberInList(int[] myList); // найти максимальное число в списке

    int findMinNumberInList(int[] myList); // найти минимальное число в списке

    int[] sortListUp(int[] myList); // отсортировать список по возрастанию

    int[] sortListDown(int[] myList); // отсортировать список по убыванию

    int[] addItemToList(int[] myList, int newItem); // добавить элемент в список

    int[] removeItemFromList(int[] myList, int itemToRemove); // удалить элемент из списка

}
