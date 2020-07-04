package student_vadims_vladisevs.lesson_10.level_1.task_3;

interface MyList {

    // Добавить в конец списка
    void addToEndOfTheList(String text);

    // Добавить в начало списка
    void addToBeginOfTheList();

    // Добавить в писок в определенное место
    void addToList(int index, String text);

    // Заменить значение в списке
    void replace(int index, String text);

    // Заменить значения всех элементов в списке
    void replaceAll(String text);

    // Получить значение из списка
    String getFromList(int index);

    // Удалить значение из списка
    void removeFromList(int index);

    // Удалить все значения из списка
    void removeAllFromList();

    // Сортировка списка
    void sort();

}
