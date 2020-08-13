package student_vadims_vladisevs.lesson_12.level_3.task_18;

class NullPointerExceptionDemo {

    public static void main(String[] args) {
        Object example = null;
        System.out.println(example.toString());
    }
}

/*
В Java особое значение null может быть назначено для ссылки на объект и означает, что объект в данный момент указывает неизвестную область данных.

NullPointerException появляется, если программа обращается или получает доступ к объекту, а ссылка на него равна нулю (null).

Это исключение возникает следующих случаях:

-Вызов метода из объекта значения null.
-Доступ или изменение объекта поля null.
-Принимает длину null(если бы это был массив Java).
-Доступ или изменение ячеек объекта null.
-Показывает «0», значение Throwable.
-При попытке синхронизации по нулевому объекту.
 */