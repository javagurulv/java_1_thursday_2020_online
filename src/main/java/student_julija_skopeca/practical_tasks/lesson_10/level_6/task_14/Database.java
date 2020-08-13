package student_julija_skopeca.practical_tasks.lesson_10.level_6.task_14;

import java.util.ArrayList;
import java.util.stream.Collectors;

class Database {

    private ArrayList<Book> list = new ArrayList<Book>();

    public void Add (Book book){
        list.add(book);

    }

    public void Delete (Book book){
        list.remove(book);
    }

    public boolean CheckIfExists(Book book){
        return !list.stream().filter(b -> b.equals(book)).findFirst().isEmpty();
    }

    public ArrayList<Book> GetAll(){
        return list;
    }

    public ArrayList<Book> getByAuthor(String author){
        return list.stream().filter(b -> b.getAuthor().equals(author))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Book> getByAuthorName(String author){
        return list.stream().filter(b -> b.getAuthor().contains(author))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Book> getByBookTitle(String title){
        return list.stream().filter(b -> b.getTitle().equals(title))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Book> getByBookTitleByParts(String title){
        return list.stream().filter(b -> b.getTitle().contains(title))
                .collect(Collectors.toCollection(ArrayList::new));
    }


}
