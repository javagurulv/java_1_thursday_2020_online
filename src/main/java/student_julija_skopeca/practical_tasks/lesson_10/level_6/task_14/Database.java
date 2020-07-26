package student_julija_skopeca.practical_tasks.lesson_10.level_6.task_14;

import java.util.ArrayList;

class Database {

    private ArrayList<Book> list = new ArrayList<Book>();

    public void Add (Book book){
        list.add(book);
    }

    public boolean CheckIfExists(Book book){
        return !list.stream().filter(b -> b.equals(book)).findFirst().isEmpty();
    }


}
