package student_aleksey_kodin.lesson10.levelx.supertask2;

interface MyList {
    // Метод возвращает созданный массив
    int[] create();

    // Добовление значения в массив
    int[] add(int[] array, int value);

    // Добовление значения в массив с указанием индекса
    int[] add(int[] array, int index, int value);

    // Получить значение массива по индексу
    int get(int[] array, int index);

    // Поменять два значения между собой по индексам
    int[] replace(int[] array, int indexA, int indexB);

    // Распечатать массив
    void print(int[] array);

    // Удалить элемент из массива
    int[] remove(int[] array, int index);

    // Удалить все элементы массива
    int[] removeAll();

    // Возвращает размер массива
    int size(int[] array);
}
