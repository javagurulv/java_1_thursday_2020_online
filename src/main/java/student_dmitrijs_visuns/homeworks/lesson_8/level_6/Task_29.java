package student_dmitrijs_visuns.homeworks.lesson_8.level_6;

 /* Найти в интернете (javadoc) иерархию наследования
    для класса java.util.ArrayList.

             https://docs.oracle.com/javase/7/docs/api/*/

import java.util.AbstractCollection;
import java.util.AbstractList;

class Task_29 {

    class ArrayList extends AbstractList {}

    class AbstractList extends AbstractCollection {}

    class AbstractCollection extends Object {}

}
