package student_vadims_vladisevs.lesson_10.level_x.super_task_2;

interface MyList {

    // Добавить в конец списка
    int[] addToEndOfTheList(int number);

    // Добавить в начало списка
    int[] addToBeginOfTheList(int number);

    // Добавить в писок в определенное место
    int[] addToList(int index, int number);

    // Заменить значение в списке
    int[] replace(int index, int number);

    // Заменить значения всех элементов в списке
    int[] replaceAll(int number);

    // Получить значение из списка
    int getFromList(int index);

    // Удалить значение из списка
    int[] removeFromList(int[] array, int index);

    // Удалить все значения из списка
   int[] removeAllFromList();

    // Сортировка списка
   int[] sort(int[] array);

}
