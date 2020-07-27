package student_alexander_bogachenkov.lesson12_16072020.homeworks.level_3.task_18;

class NullPointerExceptionDemo {

    public static void main(String[] args) {
        String name = null;
        if (name.equals("Alex")) {
            System.out.println("Hi, Alex!");
        }
    }

    //Это исключение возникает следующих случаях:
    // - Вызов метода из объекта значения null.
    // - Доступ или изменение объекта поля null.
    // - Принимает длину null(если бы это был массив Java).
    // - Доступ или изменение ячеек объекта null.
    // - Показывает «0», значение Throwable.
    // - При попытке синхронизации по нулевому объекту.

}
