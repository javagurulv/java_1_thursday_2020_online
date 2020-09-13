package student_igors_mihejevs.lesson_10.homework.level_3.task_6;
/*
Функциональный интерфейс в Java 8 и далее – это интерфейс, который содержит только 1 абстрактный метод.
Основное назначение – использование в лямбда выражениях и method reference.
Наличие 1 абстрактного метода - это единственное условие,
таким образом функциональный интерфейс может содержать так же default и static методы.
*/

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
@FunctionalInterface
public interface FunctionalInterfaceDemo {

    void printString(String stringName);

}

