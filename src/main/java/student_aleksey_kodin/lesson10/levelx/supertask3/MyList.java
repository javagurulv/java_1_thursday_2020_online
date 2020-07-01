package student_aleksey_kodin.lesson10.levelx.supertask3;

interface MyList {

    // Добовление значения в массив
    void add(int value);

    // Добовление значения в массив с указанием индекса
    boolean add(int index, int value);

    // Получить значение массива по индексу
    int get(int index);

    // Поменять два значения между собой по индексам
    boolean replace(int indexA, int indexB);

    // Проверить нахождение значения в листе
    boolean contains(int value);

    // Распечатать массив
    void print();

    // Удалить элемент из массива
    boolean remove(int index);

    // Удалить все элементы массива
    void removeAll();

    // Получить количество элементов
    int size();
}