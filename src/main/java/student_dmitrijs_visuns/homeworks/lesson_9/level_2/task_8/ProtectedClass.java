package student_dmitrijs_visuns.homeworks.lesson_9.level_2.task_8;

// Среда разработки не дает сделать класс protected, потому что его использование
// нарушило бы принцип инкапсуляции,
// дав в данном случае доступ к приватным состояниям title и аuthor.
// Прямой доступ к ним имели бы и остальные классы в пределах пакета,
// и классы-наследники ProtectedClass.

class ProtectedClass {

    private String title;
    private String author;


}
