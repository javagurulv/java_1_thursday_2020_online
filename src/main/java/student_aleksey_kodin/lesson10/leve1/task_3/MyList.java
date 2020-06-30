package student_aleksey_kodin.lesson10.leve1.task_3;

interface MyList {
    // Метод возвращает созданный массив длиной указанной в size
    int[] create(int size);

    // Добовление значения в массив
    void add(int value);

    // Добовление значения в массив с указанием индекса
    void add(int index, int value);

    // Получить значение массива по индексу
    void get(int index);

    // Поменять два значения между собой по индексам
    void replace(int indexA, int indexB);

    // Распечатать массив
    void print(int[] array);

    // Удалить элемент из массива
    void remove(int index);

    // Удалить все элементы массива
    void removeAll();
}
