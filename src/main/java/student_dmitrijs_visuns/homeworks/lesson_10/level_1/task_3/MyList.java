package student_dmitrijs_visuns.homeworks.lesson_10.level_1.task_3;

interface MyList {

    int[] addItemToBeginningOfList (int[] myList, int newItem); // добавить элемент в начало списка

    int[] addItemToEndOfList (int[] myList, int newItem); // добавить элемент в конец списка

    int[] replaceListItem (int[] myList, int newItem, int itemPositionInList); // заменить элемент на указанной позиции
    // списка на предоставленный новый

    int[] removeItemFromList (int[] myList, int itemPositionInList); //удалить элемент на указанной позиции списка

    int[] clearList (int[] myList); // очистить весь список, удалить все элементы

    int[] sortListFromMinToMax (int[] myList); // отсортировать список от меньших значений к бОльшим

    int[] sortListFromMaxToMin (int[] myList); // отсортировать список от бОльших значений к меньшим

}
