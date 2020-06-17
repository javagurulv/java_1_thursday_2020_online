package student_alexander_bogachenkov.lesson8_11062020.homeworks.day_6;

class Task_30 {

    // varargs - Variable Arguments List - Вариативная функция.
    // В программировании функции(методы) с переменным
    // числом аргументов называются вариативными.

    int sum(int... numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }

    int mult(int... numbers) {
        int result = 1;
        for (int number : numbers) {
            result *= number;
        }
        return result;
    }
}
