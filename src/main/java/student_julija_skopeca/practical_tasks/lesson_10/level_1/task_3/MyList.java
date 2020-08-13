package student_julija_skopeca.practical_tasks.lesson_10.level_1.task_3;

interface MyList {

    int[] increase(int[] array, int value); //увелечение размера массива

    void println(int[] array); //расспечатать в строку

    void compare(int[] array, int[] array1); //сравнение по содержанию массивов

    void copy(int[] array, int[] array1); //копирование одного массива в другой

    void copyPart(int[] array, int[] array1); //копирование определенной части одного массива в другой

}
