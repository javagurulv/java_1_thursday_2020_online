package student_alexander_bogachenkov.lesson3_07052020.homeworks.day_2;

public class Task_10 {
    // 1. Все переменные класса или ссылки на объекты
    // (который является всего лишь указателем на местоположение,
    // где хранится объект, то есть куча) также хранятся в куче.

    // 2. Метод length() — возвращает длину строки в Java.

    // 3. Чтобы сравнить две строки в Java можно использовать метод equals().

    // 4. Пул строк (string pool) в Java это некий пул
    // (или список) объектов класса String, который хранится в специальном месте кучи (Java Heap).

    // Пул строк работает следующим образом: когда мы создаем строку с помощью конструкции:
       String str = "HELLO";
    // Эта строка попадает в пул строк. Когда мы создаем другую строку с тем же значением:
       String str2 = "HELLO";
    // То на самом деле сначала происходит поиск по пулу строк. И если там уже найдена
    // такая строка - то str2 присваивается ссылка на уже созданный объект (на который указывает и str).
}
