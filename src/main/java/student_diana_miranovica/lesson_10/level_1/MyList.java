package student_diana_miranovica.lesson_10.level_1;

public interface MyList {

    int[] create(); // оздать массив

    int[] willIncrease( int[] array, int value); // увеличить массив

    int[] add(int array, int value); // добавить значение в массив

    int[] print(int array); // распечатать значения массива

    int[] add(int array, int value, int index); // добавление значения с использованием определенного индекса

    int[] compare(int array, int array1); // сравнение двух массивов

    int[] remove(int array, int index); // удалить элемент из массива

    int[] removeAll(); // удалить все

    int[] copy(int array,  int array1); //опировать массив один в другой

    int[] unify(int array, int arrayA); // обьеденить массивы
}
